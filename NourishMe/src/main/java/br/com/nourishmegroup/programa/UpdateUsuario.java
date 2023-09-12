package br.com.nourishmegroup.programa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.nourishmegroup.entity.Usuario;

public class UpdateUsuario {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("NourishMe");
        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();

       
        Usuario usuarioExistente = em.find(Usuario.class, 1); // Substitua 1 pelo ID que deseja alterar

        // Verifique se o usuário foi encontrado
        if (usuarioExistente != null) {
            // Atualiza o nome do usuário
            usuarioExistente.setNomeCompleto("Bianca");
            usuarioExistente.setEmail("Bianca@gmail.com");

        em.getTransaction().commit();

        em.close();
        factory.close();
    }
    }}
