package dao;

import exception.DAOException;
import model.Cliente;

import javax.persistence.EntityManager;
import java.util.List;

public class ClienteDAO extends Dao<Cliente> implements IClienteDAO{

    public ClienteDAO() {
        super(Cliente.class);
    }

    @Override
    public List<Cliente> buscarClientes() throws DAOException {
        EntityManager em = entityManager();
        List listT;
        listT = em.createQuery("SELECT c FROM Cliente c").getResultList();
        em.close();
        return  listT;
    }
}
