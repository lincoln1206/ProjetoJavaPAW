package entidades;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Conveniencia")
@Data
public class Conveniencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_conveniencia;
    
    @OneToOne
    @JoinColumn(name = "id_posto", referencedColumnName = "id_posto")
    private Posto posto;

    @Column(name = "nome_conveniencia")
    private String nome_conveniencia;

    @Column(name = "localizacao")
    private String localizacao;

}
