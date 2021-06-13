package business;

import dao.IDao;
import exception.BussinesException;
import exception.ValidacaoException;
import model.Entidade;

import java.util.List;

public interface IBusiness <T extends Entidade>{
    public void init (IDao<T> dao);

    public T buscar(Class<T> t, int id) throws BussinesException;

    public void criarOuAtualizar (T t) throws BussinesException;

    public void deletar (T t) throws BussinesException;

    public void desabilitar (T t) throws BussinesException;

    public List<T> buscarTodos() throws BussinesException;

    public void isValid(T t) throws ValidacaoException;
}
