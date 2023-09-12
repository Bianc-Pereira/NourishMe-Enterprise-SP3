package br.com.nourishmegroup.programa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.nourishmegroup.entity.Usuario;

public class Teste {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("NourishMe");
		EntityManager em = factory.createEntityManager();

		/*
		 * // Criando um novo usuário Usuario usuario = new Usuario("Teste3@gmail.com",
		 * "894", "Teste 3", "28-02-2002", "1196541569", null, null);
		 * 
		 * 
		 * em.getTransaction().begin();
		 * 
		 * try { em.persist(usuario); em.getTransaction().commit(); } catch (Exception
		 * e) { if (em.getTransaction().isActive()) { em.getTransaction().rollback(); }
		 * e.printStackTrace(); } finally { em.close(); factory.close(); }
		 */

		// Buscando um usuario no banco de dados
		Usuario usuario = em.find(Usuario.class, 1);

		System.out.println(usuario.getIdUsuario() + " " + usuario.getNomeCompleto());

		em.close();
		factory.close();
	}
}
