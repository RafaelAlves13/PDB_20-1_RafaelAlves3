package dao;

import exception.DAOException;
import model.Usuario;

import java.util.List;

public interface IUsuarioDAO extends IDao<Usuario>{

    public Usuario buscarLoginUsuario(String login, String senha) throws DAOException;

    public Usuario buscarLogin(String login) throws DAOException;

    public List<Usuario> buscarTodos(String string) throws DAOException;

    public Usuario buscarTipo(String tipocargo) throws DAOException;

    public Usuario buscarCPF (String cpf) throws DAOException;
}
