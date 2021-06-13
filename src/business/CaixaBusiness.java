package business;

import dao.CaixaDAO;
import dao.ICaixaDAO;
import exception.ValidacaoException;
import model.Caixa;

public class CaixaBusiness extends Business<Caixa> implements ICaixaBusiness{

    private ICaixaDAO iCaixaDAO;

    public CaixaBusiness() {
        iCaixaDAO = new CaixaDAO();
        init(iCaixaDAO);
    }

    @Override
    public void isValid(Caixa caixa) throws ValidacaoException {

    }
}
