package business;

import dao.ISuperUsuarioDAO;
import dao.SuperUsuarioDAO;
import exception.ValidacaoException;
import model.SuperUsuario;

public class SuperUsuarioBusiness extends Business<SuperUsuario> implements ISuperUsuarioBusiness{

    private ISuperUsuarioDAO iSuperUsuarioDAO;

    public SuperUsuarioBusiness() {
        iSuperUsuarioDAO = new SuperUsuarioDAO();
        init(iSuperUsuarioDAO);
    }

    @Override
    public void isValid(SuperUsuario superUsuario) throws ValidacaoException {

    }
}
