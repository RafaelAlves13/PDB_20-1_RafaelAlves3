package business;

import dao.ClienteDAO;
import dao.IClienteDAO;
import exception.ValidacaoException;
import model.Cliente;

public class ClienteBusiness extends Business<Cliente> implements IClienteBusiness{

    private IClienteDAO iClienteDAO;

    public ClienteBusiness() {
        iClienteDAO = new ClienteDAO();
        init(iClienteDAO);
    }

    @Override
    public void isValid(Cliente cliente) throws ValidacaoException {

    }
}
