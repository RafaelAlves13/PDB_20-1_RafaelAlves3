package business;

import dao.IVendaDAO;
import dao.VendaDAO;
import exception.ValidacaoException;
import model.Venda;

public class VendaBusiness extends Business<Venda> implements IVendaBusiness{

    private IVendaDAO iVendaDAO;

    public VendaBusiness() {
        iVendaDAO = new VendaDAO();
        init(iVendaDAO);
    }

    @Override
    public void isValid(Venda venda) throws ValidacaoException {

    }
}
