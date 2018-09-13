package entidades;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Ranking")
@Data
public class Ranking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_ranking;
    
    @OneToOne
    @JoinColumn(name = "id_posto", referencedColumnName = "id_posto")
    private Posto posto;

    @Column(name = "classificacao")
    private int classificacao;
    
}
