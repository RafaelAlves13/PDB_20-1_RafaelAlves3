package facade;

import business.*;
import dao.IitemProdutoDAO;
import exception.BussinesException;
import model.*;

import java.util.List;

public class Facade implements IFacade{

    private static Facade instance;

    public static Facade getInstance(){

        if(instance == null){
            instance = new Facade();
        }return instance;
    }

    private ICaixaBusiness caixaBusiness;
    private IClienteBusiness clienteBusiness;
    private ICompraBusiness compraBusiness;
    private IEnderecoBusiness enderecoBusiness;
    private IFornecedorBusiness fornecedorBusiness;
    private IGerenteBusiness gerenteBusiness;
    private IitemProdutoBusiness itemProdutoBusiness;
    private IOperadorCaixaBusiness operadorCaixaBusiness;
    private IProdutoBusiness produtoBusiness;
    private ISuperUsuarioBusiness superUsuarioBusiness;
    private IUsuarioBusiness usuarioBusiness;
    private IVendaBusiness vendaBusiness;
    private ILogBusiness logBusiness;

    private Facade() {
        caixaBusiness = new CaixaBusiness();
        clienteBusiness = new ClienteBusiness();
        compraBusiness = new CompraBusiness();
        enderecoBusiness = new EnderecoBusiness();
        fornecedorBusiness = new FornecedorBusiness();
        gerenteBusiness = new GerenteBusiness();
        itemProdutoBusiness = new itemProdutoBusiness();
        operadorCaixaBusiness = new OperadorCaixaBusiness();
        produtoBusiness = new ProdutoBusiness();
        superUsuarioBusiness = new SuperUsuarioBusiness();
        usuarioBusiness = new UsuarioBusiness();
        vendaBusiness = new VendaBusiness();
        logBusiness = new LogBusiness();
    }

    //Caixa
    @Override
    public void inserirOuAtualizarCaixa(Caixa caixa) throws BussinesException {
        caixaBusiness.criarOuAtualizar(caixa); }
    @Override
    public void desabilitarCaixa(Caixa caixa) throws BussinesException {
        caixaBusiness.desabilitar(caixa); }
    @Override
    public void deletarCaixa(Caixa caixa) throws BussinesException {
        caixaBusiness.deletar(caixa); }
    @Override
    public void buscarCaixa(Caixa caixa) throws BussinesException {
        caixaBusiness.buscar(Caixa.class, caixa.getId()); }
    @Override
    public List<Caixa> buscarTodosCaixas() throws BussinesException {
        return caixaBusiness.buscarTodos(); }

    //Cliente
    @Override
    public void inserirOuAtualizarCliente(Cliente cliente) throws BussinesException {
        clienteBusiness.criarOuAtualizar(cliente); }
    @Override
    public void desabilitarCliente(Cliente cliente) throws BussinesException {
        clienteBusiness.desabilitar(cliente); }
    @Override
    public void deletarCliente(Cliente cliente) throws BussinesException {
        clienteBusiness.deletar(cliente); }
    @Override
    public void buscarCliente(Cliente cliente) throws BussinesException {
        clienteBusiness.buscar(Cliente.class, cliente.getId()); }
    @Override
    public List<Cliente> buscarTodosClientes() throws BussinesException {
        return clienteBusiness.buscarTodos(); }

    //Compra
    @Override
    public void inserirOuAtualizarCompra(Compra compra) throws BussinesException {
        compraBusiness.criarOuAtualizar(compra); }
    @Override
    public void desabilitarCompra(Compra compra) throws BussinesException {
        compraBusiness.desabilitar(compra); }
    @Override
    public void deletarCompra(Compra compra) throws BussinesException {
        compraBusiness.deletar(compra); }
    @Override
    public void buscarCompra(Compra compra) throws BussinesException {
        compraBusiness.buscar(Compra.class, compra.getId()); }
    @Override
    public List<Compra> buscarTodasCompras() throws BussinesException {
        return compraBusiness.buscarTodos(); }

    //Endereco
    @Override
    public void inserirOuAtualizarEndereco(Endereco endereco) throws BussinesException {
        enderecoBusiness.criarOuAtualizar(endereco); }
    @Override
    public void desabilitarEndereco(Endereco endereco) throws BussinesException {
        enderecoBusiness.desabilitar(endereco); }
    @Override
    public void deletarEndereco(Endereco endereco) throws BussinesException {
        enderecoBusiness.deletar(endereco); }
    @Override
    public void buscarEndereco(Endereco endereco) throws BussinesException {
        enderecoBusiness.buscar(Endereco.class, endereco.getId()); }
    @Override
    public List<Endereco> buscarTodosEnderecos() throws BussinesException {
        return enderecoBusiness.buscarTodos();
    }

    //Fornecedor
    @Override
    public void inserirOuAtualizarFornecedor(Fornecedor fornecedor) throws BussinesException {
        fornecedorBusiness.criarOuAtualizar(fornecedor); }
    @Override
    public void desabilitarFornecedor(Fornecedor fornecedor) throws BussinesException {
        fornecedorBusiness.desabilitar(fornecedor); }
    @Override
    public void deletarFornecedor(Fornecedor fornecedor) throws BussinesException {
        fornecedorBusiness.deletar(fornecedor); }
    @Override
    public void buscarFornecedor(Fornecedor fornecedor) throws BussinesException {
        fornecedorBusiness.buscar(Fornecedor.class, fornecedor.getId()); }
    @Override
    public List<Fornecedor> buscarTodosFornecedores() throws BussinesException {
        return fornecedorBusiness.buscarTodos(); }

    //Gerente
    @Override
    public void inserirOuAtualizarGerente(Gerente gerente) throws BussinesException {
        gerenteBusiness.criarOuAtualizar(gerente); }
    @Override
    public void desabilitarGerente(Gerente gerente) throws BussinesException {
        gerenteBusiness.desabilitar(gerente); }
    @Override
    public void deletarGerente(Gerente gerente) throws BussinesException {
        gerenteBusiness.deletar(gerente); }
    @Override
    public void buscarGerente(Gerente gerente) throws BussinesException {
        gerenteBusiness.buscar(Gerente.class,gerente.getId()); }
    @Override
    public List<Gerente> buscarTodosGerentes() throws BussinesException {
        return gerenteBusiness.buscarTodos(); }

    //itemProduto
    @Override
    public void inserirOuAtualizarItemProduto(itemProduto item_Produto) throws BussinesException {
        itemProdutoBusiness.criarOuAtualizar(item_Produto); }
    @Override
    public void desabilitarItemProduto(itemProduto item_Produto) throws BussinesException {
        itemProdutoBusiness.desabilitar(item_Produto); }
    @Override
    public void deletarItemProduto(itemProduto item_Produto) throws BussinesException {
        itemProdutoBusiness.deletar(item_Produto); }
    @Override
    public void buscarItemProduto(itemProduto item_Produto) throws BussinesException {
        itemProdutoBusiness.buscar(itemProduto.class, item_Produto.getId()); }
    @Override
    public List<itemProduto> buscarTodosItemProdutos() throws BussinesException {
        return itemProdutoBusiness.buscarTodos(); }

    //OperadorCaixa
    @Override
    public void inserirOuAtualizarOperadorCaixa(OperadorCaixa operadorCaixa) throws BussinesException {
        operadorCaixaBusiness.criarOuAtualizar(operadorCaixa); }
    @Override
    public void desabilitarOperadorCaixa(OperadorCaixa operadorCaixa) throws BussinesException {
        operadorCaixaBusiness.desabilitar(operadorCaixa); }
    @Override
    public void deletarOperadorCaixa(OperadorCaixa operadorCaixa) throws BussinesException {
        operadorCaixaBusiness.deletar(operadorCaixa); }
    @Override
    public void buscarOperadorCaixa(OperadorCaixa operadorCaixa) throws BussinesException {
        operadorCaixaBusiness.buscar(OperadorCaixa.class, operadorCaixa.getId()); }
    @Override
    public List<OperadorCaixa> buscarTodosOperadorCaixa() throws BussinesException {
        return operadorCaixaBusiness.buscarTodos(); }

    //Produto
    @Override
    public void inserirOuAtualizarProduto(Produto produto) throws BussinesException {
        produtoBusiness.criarOuAtualizar(produto); }
    @Override
    public void desabilitarProduto(Produto produto) throws BussinesException {
        produtoBusiness.desabilitar(produto); }
    @Override
    public void deletarProduto(Produto produto) throws BussinesException {
        produtoBusiness.deletar(produto); }
    @Override
    public void buscarProduto(Produto produto) throws BussinesException {
        produtoBusiness.buscar(Produto.class, produto.getId()); }
    @Override
    public List<Produto> buscarTodosProdutos() throws BussinesException {
        return produtoBusiness.buscarTodos(); }

    //SuperUsuario
    @Override
    public void inserirOuAtualizarSuperUsuario(SuperUsuario superUsuario) throws BussinesException {
        superUsuarioBusiness.criarOuAtualizar(superUsuario); }
    @Override
    public void desabilitarSuperUsuario(SuperUsuario superUsuario) throws BussinesException {
        superUsuarioBusiness.desabilitar(superUsuario); }
    @Override
    public void deletarSuperUsuario(SuperUsuario superUsuario) throws BussinesException {
        superUsuarioBusiness.deletar(superUsuario); }
    @Override
    public void buscarSuperUsuario(SuperUsuario superUsuario) throws BussinesException {
        superUsuarioBusiness.buscar(SuperUsuario.class, superUsuario.getId()); }
    @Override
    public List<SuperUsuario> buscarTodosSuperUsuario() throws BussinesException {
        return superUsuarioBusiness.buscarTodos(); }

    //Usuario
    @Override
    public Usuario buscarLoginUsuario(String login, String senha) throws BussinesException {
        return usuarioBusiness.buscarLoginUsuario(login, senha);
    }
    @Override
    public void inserirOuAtualizarUsuario(Usuario usuario) throws BussinesException {
        usuarioBusiness.criarOuAtualizar(usuario); }
    @Override
    public void desabilitarUsuario(Usuario usuario) throws BussinesException {
        usuarioBusiness.desabilitar(usuario);
    }
    @Override
    public void deletarUsuario(Usuario usuario) throws BussinesException {
        usuarioBusiness.deletar(usuario);
    }
    @Override
    public void buscarUsuario(Usuario usuario) throws BussinesException {
        usuarioBusiness.buscar(Usuario.class, usuario.getId());
    }
    @Override
    public List<Usuario> buscarTodosUsuarios() throws BussinesException {
        return usuarioBusiness.buscarTodos();
    }

    //Venda
    @Override
    public void inserirOuAtualizarVenda(Venda venda) throws BussinesException {
        vendaBusiness.criarOuAtualizar(venda);
    }
    @Override
    public void desabilitarVenda(Venda venda) throws BussinesException {
        vendaBusiness.desabilitar(venda);
    }
    @Override
    public void deletarVenda(Venda venda) throws BussinesException {
        vendaBusiness.deletar(venda);
    }
    @Override
    public void buscarVenda(Venda venda) throws BussinesException {
        vendaBusiness.buscar(Venda.class, venda.getId());
    }
    @Override
    public List<Venda> buscarTodosVendas() throws BussinesException {
        return vendaBusiness.buscarTodos();
    }

    //Log
    @Override
    public List<Log> buscarTodosLogs() throws BussinesException {
        return logBusiness.buscarTodos();
    }
    @Override
    public List<Log> buscarTudo() throws BussinesException {
        return logBusiness.buscarTudo();
    }
}
