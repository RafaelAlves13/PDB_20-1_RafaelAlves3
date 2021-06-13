package dao;

import exception.DAOException;
import model.Log;
import util.SQLUtil;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import java.util.List;

public class LogDao extends Dao<Log> implements  ILogDao{

    public LogDao(Class<Log> class1) {
        super(class1);
    }

    public LogDao() {
        super(Log.class);
    }

    @Override
    public List<Log> buscarTudo() throws DAOException {
        try {
            TypedQuery<Log> typedQuery = (TypedQuery<Log>) entityManager().createQuery(SQLUtil.BUSCAR_LOG);
            return typedQuery.getResultList();

        } catch (NoResultException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            throw new DAOException("Usuario não encontrado");

        }catch(Exception e){
            e.printStackTrace();
            System.err.println(e.getMessage());
            throw new DAOException("Erro de busca: "+ class1.getSimpleName()+ " " +e.getMessage());
        }
    }
}
