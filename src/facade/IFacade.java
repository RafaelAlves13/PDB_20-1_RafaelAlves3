package facade;

import exception.BussinesException;
import model.*;

import java.util.List;

public interface IFacade {

    //Caixa
    public void inserirOuAtualizarCaixa(Caixa caixa) throws BussinesException;
    public void desabilitarCaixa(Caixa caixa) throws BussinesException;
    public void deletarCaixa(Caixa caixa) throws BussinesException;
    public void buscarCaixa(Caixa caixa) throws BussinesException;
    public List<Caixa> buscarTodosCaixas () throws BussinesException;

    //Cliente
    public void inserirOuAtualizarCliente(Cliente cliente) throws BussinesException;
    public void desabilitarCliente(Cliente cliente) throws BussinesException;
    public void deletarCliente(Cliente cliente) throws BussinesException;
    public void buscarCliente(Cliente cliente) throws BussinesException;
    public List<Cliente> buscarTodosClientes() throws BussinesException;

    //Compra
    public void inserirOuAtualizarCompra(Compra compra) throws BussinesException;
    public void desabilitarCompra(Compra compra) throws BussinesException;
    public void deletarCompra(Compra compra) throws BussinesException;
    public void buscarCompra(Compra compra) throws BussinesException;
    public List<Compra> buscarTodasCompras() throws BussinesException;

    //  Endereco
    public void inserirOuAtualizarEndereco(Endereco endereco) throws BussinesException;
    public void desabilitarEndereco(Endereco endereco) throws BussinesException;
    public void deletarEndereco (Endereco endereco) throws BussinesException;
    public void buscarEndereco (Endereco endereco) throws BussinesException;
    public List<Endereco> buscarTodosEnderecos () throws BussinesException;

    //Fornecedor
    public void inserirOuAtualizarFornecedor(Fornecedor fornecedor) throws BussinesException;
    public void desabilitarFornecedor(Fornecedor fornecedor) throws BussinesException;
    public void deletarFornecedor(Fornecedor fornecedor) throws BussinesException;
    public void buscarFornecedor(Fornecedor fornecedor) throws BussinesException;
    public List<Fornecedor> buscarTodosFornecedores() throws BussinesException;

    //Gerente
    public void inserirOuAtualizarGerente(Gerente gerente) throws BussinesException;
    public void desabilitarGerente(Gerente gerente) throws BussinesException;
    public void deletarGerente(Gerente gerente) throws BussinesException;
    public void buscarGerente(Gerente gerente) throws BussinesException;
    public List<Gerente> buscarTodosGerentes() throws BussinesException;

    //ItemProduto
    public void inserirOuAtualizarItemProduto(itemProduto item_Produto) throws BussinesException;
    public void desabilitarItemProduto(itemProduto item_Produto) throws BussinesException;
    public void deletarItemProduto(itemProduto item_Produto) throws BussinesException;
    public void buscarItemProduto(itemProduto item_Produto) throws BussinesException;
    public List<itemProduto> buscarTodosItemProdutos() throws BussinesException;

    //OperadorCaixa
    public void inserirOuAtualizarOperadorCaixa(OperadorCaixa operadorCaixa) throws BussinesException;
    public void desabilitarOperadorCaixa(OperadorCaixa operadorCaixa) throws BussinesException;
    public void deletarOperadorCaixa(OperadorCaixa operadorCaixa) throws BussinesException;
    public void buscarOperadorCaixa(OperadorCaixa operadorCaixa) throws BussinesException;
    public List<OperadorCaixa> buscarTodosOperadorCaixa() throws BussinesException;

    //Produto
    public void inserirOuAtualizarProduto(Produto produto) throws BussinesException;
    public void desabilitarProduto(Produto produto) throws BussinesException;
    public void deletarProduto(Produto produto) throws BussinesException;
    public void buscarProduto(Produto produto) throws BussinesException;
    public List<Produto> buscarTodosProdutos() throws BussinesException;

    //SuperUsuario
    public void inserirOuAtualizarSuperUsuario(SuperUsuario superUsuario) throws BussinesException;
    public void desabilitarSuperUsuario(SuperUsuario superUsuario) throws BussinesException;
    public void deletarSuperUsuario(SuperUsuario superUsuario) throws BussinesException;
    public void buscarSuperUsuario(SuperUsuario superUsuario) throws BussinesException;
    public List<SuperUsuario> buscarTodosSuperUsuario() throws BussinesException;

    //Usuario
    public void inserirOuAtualizarUsuario(Usuario usuario) throws BussinesException;
    public void desabilitarUsuario(Usuario usuario) throws BussinesException;
    public void deletarUsuario(Usuario usuario) throws BussinesException;
    public void buscarUsuario(Usuario usuario) throws BussinesException;
    Usuario buscarLoginUsuario(String login, String senha) throws BussinesException;
    public List<Usuario> buscarTodosUsuarios() throws BussinesException;

    //Venda
    public void inserirOuAtualizarVenda(Venda venda) throws BussinesException;
    public void desabilitarVenda(Venda venda) throws BussinesException;
    public void deletarVenda(Venda venda) throws BussinesException;
    public void buscarVenda(Venda venda) throws BussinesException;
    public List<Venda> buscarTodosVendas() throws BussinesException;

    //  Log
    public List<Log> buscarTodosLogs() throws BussinesException;
    public List<Log> buscarTudo () throws BussinesException;
}
