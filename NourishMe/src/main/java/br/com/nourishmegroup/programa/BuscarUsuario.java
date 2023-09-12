package br.com.nourishmegroup.programa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.nourishmegroup.entity.Usuario;

public class BuscarUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("NourishMe");
		EntityManager em = factory.createEntityManager();

		Usuario usuario = em.find(Usuario.class, 1);

		System.out.println("\n" + "********************** RESULTADO DA BUSCA **********************");
		System.out.println("ID do usuário: "+usuario.getIdUsuario() + "\n" + "Nome do usuário: " + usuario.getNomeCompleto());

		em.close();
		factory.close();
	}

}
