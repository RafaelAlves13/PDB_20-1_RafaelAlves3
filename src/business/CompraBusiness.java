package business;

import dao.CompraDAO;
import dao.ICompraDAO;
import exception.ValidacaoException;
import model.Compra;

public class CompraBusiness extends Business<Compra> implements ICompraBusiness{

    private ICompraDAO iCompraDAO;

    public CompraBusiness() {
        iCompraDAO = new CompraDAO();
        init(iCompraDAO);
    }

    @Override
    public void isValid(Compra compra) throws ValidacaoException {

    }
}
