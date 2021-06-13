package business;

import dao.IOperadorCaixaDAO;
import dao.OperadorCaixaDAO;
import exception.ValidacaoException;
import model.OperadorCaixa;

public class OperadorCaixaBusiness extends Business<OperadorCaixa> implements IOperadorCaixaBusiness{

    private IOperadorCaixaDAO iOperadorCaixaDAO;

    public OperadorCaixaBusiness() {
        iOperadorCaixaDAO = new OperadorCaixaDAO();
        init(iOperadorCaixaDAO);
    }

    @Override
    public void isValid(OperadorCaixa operadorCaixa) throws ValidacaoException {

    }
}
