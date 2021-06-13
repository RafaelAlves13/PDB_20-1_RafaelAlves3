package business;

import dao.IitemProdutoDAO;
import dao.itemProdutoDAO;
import exception.ValidacaoException;
import model.itemProduto;

public class itemProdutoBusiness extends Business<itemProduto> implements IitemProdutoBusiness{

    private IitemProdutoDAO iitemProdutoDAO;

    public itemProdutoBusiness() {
        iitemProdutoDAO = new itemProdutoDAO();
        init(iitemProdutoDAO);
    }

    @Override
    public void isValid(itemProduto itemProduto) throws ValidacaoException {
        
    }
}
