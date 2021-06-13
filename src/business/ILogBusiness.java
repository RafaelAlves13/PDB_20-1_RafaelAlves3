package business;

import exception.BussinesException;
import model.Log;

import java.util.List;

public interface ILogBusiness extends IBusiness<Log>{

    public List<Log> buscarTudo () throws BussinesException;

}
