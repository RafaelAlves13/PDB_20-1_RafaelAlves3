package business;

import dao.ILogDao;
import dao.LogDao;
import exception.BussinesException;
import exception.DAOException;
import exception.ValidacaoException;
import model.Log;

import java.util.List;

public class LogBusiness extends Business<Log> implements ILogBusiness{

    private ILogDao logDao;

    public LogBusiness() {
        logDao = new LogDao();
        init(logDao);
    }

    @Override
    public void isValid(Log log) throws ValidacaoException {

    }

    @Override
    public List<Log> buscarTudo() throws BussinesException {
        try {
            List<Log> usuarios = logDao.buscarTudo();
            return usuarios;
        } catch (DAOException e) {
            e.printStackTrace();
            throw new BussinesException(e.getMessage());
        }
    }
}
