package business;

import dao.GerenteDAO;
import dao.IGerenteDAO;
import exception.ValidacaoException;
import model.Gerente;

public class GerenteBusiness extends Business<Gerente> implements IGerenteBusiness{

    private IGerenteDAO iGerenteDAO;

    public GerenteBusiness() {
        iGerenteDAO = new GerenteDAO();
        init(iGerenteDAO);
    }

    @Override
    public void isValid(Gerente gerente) throws ValidacaoException {

    }
}
