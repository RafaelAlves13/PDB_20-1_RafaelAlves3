package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import model.Pessoa;

public class PessoaDAO extends Dao<Pessoa> implements IPessoaDAO{
	  private EntityManager em;

	public PessoaDAO() {
		super(Pessoa.class);
	}



    public void persist(Pessoa p, EntityManagerFactory emf) {
	      try {
	          this.em = emf.createEntityManager();
	          em.getTransaction().begin(); 

	          em.persist(p); 
	          em.getTransaction().commit(); 
	          System.out.println("persistir: deu certo");
	      } catch (Exception e) {
	          System.out.println("persistir: deu errado: " + e.getMessage());
	          em.getTransaction().rollback();
	      } finally {
	          em.close();
	      }
	  }
}