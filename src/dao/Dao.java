package dao;

import exception.DAOException;
import model.Entidade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import java.util.List;

public abstract class Dao <T extends Entidade> implements IDao<T> {

    protected Class<T> class1;

    public Dao(Class<T> class1) {
        this.class1 = class1;
    }
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgresql");

    public EntityManager entityManager(){
        return emf.createEntityManager();
    }

    public void inserir(T t) throws DAOException {
        EntityManager em = entityManager();

        try {
            em.getTransaction().begin();
            em.persist(t);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
            em.getTransaction().rollback();
            throw new DAOException("Erro ao inserir no banco de dados");
        } finally {
            em.close();
        }

    }

    @Override
    public void desabilitar(T t) throws DAOException {
        EntityManager em = entityManager();

        try {

            em.getTransaction().begin();
            em.merge(t);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            throw new DAOException("Erro a desabilitar no banco de dados");
        } finally {
            em.close();
        }

    }

    public void deletar(T t) throws DAOException {
        EntityManager em = entityManager();

        try {
            t.setAtivade(false);
            em.getTransaction().begin();
            em.remove(t);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            throw new DAOException("Erro a deletar no banco de dados");
        } finally {
            em.close();
        }
    }

    public void atualizar(T t) throws DAOException {
        EntityManager em = entityManager();

        try {
            em.getTransaction().begin();
            em.merge(t);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            throw new DAOException("Erro ao atualizar no banco de dados");
        } finally {
            em.close();
        }

    }

    public T buscar (Class<T> classe, int id) throws DAOException{
        EntityManager em = entityManager();
        T result = null;
        try {
            result = em.find(classe, id);

        }catch (NoResultException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
            result = null;
            throw new DAOException("Nunhum resultado encontrado" + classe.getSimpleName());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
            em.getTransaction().rollback();
            throw new DAOException("Erro ao buscar " +classe.getSimpleName()+ " "+e.getMessage());
        } finally {
            em.close();
        }
        return result;
    }

    public List<T> buscarTodos() throws DAOException{
        EntityManager em = entityManager();
        List<T> listT = null;

        try {
            //listT = em.createQuery("from "+class1.getName() + "entidade e where e.status = true").getResultList();
            listT = em.createQuery("from "+ class1.getName()).getResultList();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
            throw new DAOException("Erro ao buscar a lista " +class1.getSimpleName());
        }finally{

            em.close();
        }
        return  listT;
    }

}
