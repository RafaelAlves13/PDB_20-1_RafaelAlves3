package business;

import dao.IDao;
import exception.BussinesException;
import exception.DAOException;
import model.Entidade;

import java.util.List;

public abstract class Business <T extends Entidade> implements IBusiness<T>{

    protected IDao<T> dao;

    @Override
    public void init(IDao<T> dao) {
        this.dao = dao;
    }

    @Override
    public void criarOuAtualizar(T t) throws BussinesException {


        try {
            if(t.getId() == null){
                dao.inserir(t);
            }else{
                dao.atualizar(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            throw new BussinesException(e.getMessage());
        }
    }

    @Override
    public T buscar(Class<T> t, int id) throws BussinesException {

        T tt = null;
        try {
            tt = dao.buscar(t, id);
        } catch (DAOException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            throw new BussinesException(e.getMessage());
        }
        return tt;
    }

    @Override
    public void deletar(T t) throws BussinesException {
        try {
            dao.deletar(t);
        } catch (DAOException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            throw new BussinesException(e.getMessage());
        }

    }

    @Override
    public void desabilitar(T t) throws BussinesException {
        try {
            dao.desabilitar(t);
        } catch (DAOException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            throw new BussinesException(e.getMessage());
        }

    }

    @Override
    public List<T> buscarTodos() throws BussinesException {
        T tt = null;
        try {
            return dao.buscarTodos();
        } catch (DAOException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            throw new BussinesException(e.getMessage());
        }
    }
}
