package entidades;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Combustivei")
@Data
public class Combustivel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_combustivel;
    
    @ManyToOne
    @JoinColumn(name = "id_posto", referencedColumnName = "id_posto")
    private Posto posto;

    @Column(name = "nome_combustivel")
    private String nome_combustivel;

    @Column(name = "preco")
    private double preco;

    
}
