package br.com.nourishmegroup.programa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.nourishmegroup.entity.Usuario;

public class CadastraUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("NourishMe");
		EntityManager em= factory.createEntityManager();
		
		Usuario usuario = new Usuario("Testando4@gmail.com", "564", "Teste 4", "30-04-2019", "1192335254", null, null);


        em.getTransaction().begin();

        try {
            em.persist(usuario);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
            factory.close();
        }
		
	}

}
