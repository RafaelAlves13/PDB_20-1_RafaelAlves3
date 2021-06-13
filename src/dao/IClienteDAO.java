package dao;

import exception.DAOException;
import model.Cliente;

import java.util.List;

public interface IClienteDAO extends IDao<Cliente>{

    public List<Cliente> buscarClientes() throws DAOException;

}
