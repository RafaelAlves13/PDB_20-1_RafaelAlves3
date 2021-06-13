package business;

import exception.BussinesException;
import model.Usuario;

public interface IUsuarioBusiness extends IBusiness<Usuario>{

    public Usuario buscarLoginUsuario(String login, String senha) throws BussinesException;

}
