package br.com.nourishmegroup.programa;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.nourishmegroup.entity.RegistroRefeicao;

public class CadastroRegistro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("NourishMe");
		EntityManager em= factory.createEntityManager();
		
		RegistroRefeicao refeicao = new RegistroRefeicao(5, "Lanche da madrugada", "Pão Frances","Estava muito ansiosa, passei por momentos dificeis antes da refeição", Calendar.getInstance(), Calendar.getInstance());

        em.getTransaction().begin();

        try {
            em.persist(refeicao);
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
