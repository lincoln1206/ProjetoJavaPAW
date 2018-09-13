package entidades;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Usuario")
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_usuario;

    @Column(name = "nome_usuario")
    private String nome_usuario;

    @Column(name = "email")
    private String email;

    @Column(name = "km_rodados")
    private long km_rodados;

    @OneToMany(mappedBy = "usuario" , targetEntity = Favoritos.class)
    private List<Favoritos> favoritos = new ArrayList<Favoritos>();

    public void addPostoFavorito(Favoritos favorito) {
        this.favoritos.add(favorito);
        favorito.setUsuario(this);
    }
}

