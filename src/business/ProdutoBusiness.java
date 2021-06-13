package business;

import dao.IProdutoDAO;
import dao.ProdutoDAO;
import exception.ValidacaoException;
import model.Produto;

public class ProdutoBusiness extends Business<Produto> implements IProdutoBusiness{

    private IProdutoDAO iProdutoDAO;

    public ProdutoBusiness() {
        iProdutoDAO = new ProdutoDAO();
        init(iProdutoDAO);
    }

    @Override
    public void isValid(Produto produto) throws ValidacaoException {

    }
}
