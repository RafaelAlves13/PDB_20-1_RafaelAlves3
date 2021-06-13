package dao;

import exception.DAOException;
import model.Entidade;

import java.util.List;

public interface IDao <T extends Entidade>{

    public T buscar (Class<T> classe, int id) throws DAOException;

    public void desabilitar(T t) throws DAOException;

    public void deletar(T t) throws DAOException;

    public void atualizar(T t) throws DAOException;

    public void inserir(T t) throws DAOException;

    public List<T> buscarTodos() throws DAOException;
}
