package teste;

import entidades.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {
    public static void main(String[] args) {
        EntityManagerFactory fac = Persistence.createEntityManagerFactory("gasosa");
        EntityManager manager = fac.createEntityManager();

        Usuario usuario = new Usuario();

        usuario.setNome_usuario("Lincoln");
        usuario.setEmail("lincoln@email.com");
        usuario.setKm_rodados(1);

        Posto posto = new Posto();
        posto.setNome_posto("Ipiranga");
        posto.setLocalizacao("Acre");

        Ranking ranking = new Ranking();
        ranking.setClassificacao(1);
        posto.setRanking(ranking);
        posto.addRanking(ranking);

        Combustivel combustivel = new Combustivel();
        combustivel.setNome_combustivel("Gasolina");
        combustivel.setPreco(5.0);
        posto.addCombustivel(combustivel);
        
        Combustivel combustivel2 = new Combustivel();
        combustivel.setNome_combustivel("Alcool");
        combustivel.setPreco(3.0);
        posto.addCombustivel(combustivel2);

        Conveniencia conveniencia = new Conveniencia();
        conveniencia.setNome_conveniencia("Mercadinho");
        conveniencia.setLocalizacao("Acre");
        posto.addConveniencia(conveniencia);

        Favoritos favoritos = new Favoritos();
        favoritos.setNome_posto("Posto");
        usuario.addPostoFavorito(favoritos);

        manager.getTransaction().begin();
        manager.persist(usuario);
        for (Favoritos favorito : usuario.getFavoritos()) {
            manager.persist(favorito);
        }
        manager.persist(posto);
        for (Combustivel combustiveis : posto.getCombustiveis()) {
            manager.persist(combustiveis);
        }
        manager.persist(ranking);
        manager.persist(conveniencia);
        manager.getTransaction().commit();
        manager.close();
    }
}
