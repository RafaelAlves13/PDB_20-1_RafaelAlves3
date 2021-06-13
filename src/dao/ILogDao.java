package dao;

import exception.DAOException;
import model.Log;

import java.util.List;

public interface ILogDao extends IDao<Log>{

    public List<Log> buscarTudo () throws DAOException;

}
