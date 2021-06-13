package business;

import dao.IUsuarioDAO;
import dao.UsuarioDAO;
import exception.BussinesException;
import exception.DAOException;
import exception.ValidacaoException;
import model.Usuario;

public class UsuarioBusiness extends Business<Usuario> implements IUsuarioBusiness{

    private IUsuarioDAO iusuarioDAO;

    public UsuarioBusiness() {
        iusuarioDAO = new UsuarioDAO();
        init(iusuarioDAO);
    }

    @Override
    public Usuario buscarLoginUsuario(String login, String senha) throws BussinesException {
        try {
            Usuario user = iusuarioDAO.buscarLoginUsuario(login, senha);
            return user;
        } catch (DAOException e) {
            e.printStackTrace();
            throw new BussinesException(e.getMessage());
        }
    }

    @Override
    public void isValid(Usuario usuario) throws ValidacaoException {

    }
}
