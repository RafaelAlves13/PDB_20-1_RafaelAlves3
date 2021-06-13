package business;

import dao.FornecedorDAO;
import dao.IFornecedorDAO;
import exception.ValidacaoException;
import model.Fornecedor;

public class FornecedorBusiness extends Business<Fornecedor> implements IFornecedorBusiness{

    private IFornecedorDAO iFornecedorDAO;

    public FornecedorBusiness() {
        iFornecedorDAO = new FornecedorDAO();
        init(iFornecedorDAO);
    }

    @Override
    public void isValid(Fornecedor fornecedor) throws ValidacaoException {

    }
}
