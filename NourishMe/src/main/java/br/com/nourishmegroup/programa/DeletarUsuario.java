package br.com.nourishmegroup.programa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.nourishmegroup.entity.Usuario;

public class DeletarUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("NourishMe");
		EntityManager em = factory.createEntityManager();

		Usuario usuario = em.find(Usuario.class, 1);
		em.remove(usuario);
		
		
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch (Exception e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		}
	}

}
