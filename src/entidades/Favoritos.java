package entidades;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Favorito")
@Data
public class Favoritos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_favorito;
    
    @OneToOne
    @JoinColumn(name = "id_posto", referencedColumnName = "id_posto")
    private Posto posto;

    @Column(name = "nome_posto")
    private String nome_posto;
    
    @ManyToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    private Usuario usuario;

}
