package entidades;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Posto")
@Data
public class Posto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_posto;

    @Column(name = "nome_posto")
    private String nome_posto;

    @Column(name = "localizacao")
    private String localizacao;
    
    @OneToOne(mappedBy = "posto", targetEntity = Ranking.class)
    private Ranking ranking;

    @OneToMany(mappedBy = "posto", targetEntity = Combustivel.class)
    private List<Combustivel> combustiveis = new ArrayList<Combustivel>();

    @OneToOne(mappedBy = "posto", targetEntity = Conveniencia.class)
    private Conveniencia conveniencia;

    public void addCombustivel(Combustivel combustivel) {
        this.combustiveis.add(combustivel);
        combustivel.setPosto(this);
    }

    public void addConveniencia(Conveniencia conveniencia) {
        conveniencia.setNome_conveniencia(conveniencia.getNome_conveniencia());
        conveniencia.setLocalizacao(conveniencia.getLocalizacao());
        conveniencia.setPosto(this);
    }
    
    public void addRanking(Ranking ranking) {
        ranking.setClassificacao(ranking.getClassificacao());
        ranking.setNome_ranking(this.getNome_posto());
    	ranking.setPosto(this);
    }

}
