package br.com.nourishmegroup.programa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.nourishmegroup.entity.RegistroRefeicao;

public class UpdateRefeicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("NourishMe");
        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();

       
        RegistroRefeicao refeicaoExistente = em.find(RegistroRefeicao.class, 1); // Substitua 1 pelo ID que deseja alterar

        // Verifique se o usuário foi encontrado
        if (refeicaoExistente != null) {
            // Atualiza o nome do usuário
            refeicaoExistente.setTipoRefeicao("Almoço");
            refeicaoExistente.setDescricaoRefeicao("Arroz, feijão e carne");

        em.getTransaction().commit();

        em.close();
        factory.close();
    }
	}

}
