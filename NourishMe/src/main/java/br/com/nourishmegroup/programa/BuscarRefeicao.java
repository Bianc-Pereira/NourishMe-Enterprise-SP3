package br.com.nourishmegroup.programa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.nourishmegroup.entity.RegistroRefeicao;

public class BuscarRefeicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("NourishMe");
		EntityManager em = factory.createEntityManager();

		RegistroRefeicao refeicao= em.find(RegistroRefeicao.class, 1);

		System.out.println("\n" + "********************** RESULTADO DA BUSCA **********************");
		System.out.println("ID da Refeição: " +refeicao.getIdRegistro() + "\n" + "Tipo da refeicão: " + refeicao.getTipoRefeicao());

		em.close();
		factory.close();
	}
	}


