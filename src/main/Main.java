package main;

import dao.UsuarioDAO;
import enuns.EstadosUF;
import enuns.TipoSexo;
import exception.BussinesException;
import facade.Facade;
import facade.IFacade;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import model.Cliente;
import model.Endereco;
import model.Pessoa;
import model.Usuario;

import java.io.IOException;

public class Main{

    public static final String ABRIRCAIXA = "/view/abrirCaixa.fxml";
    public static final String CATEGORIA = "/view/categoria.fxml";
    public static final String HISTORICOVENDAS = "/view/historicoVendas.fxml";
    public static final String LISTACLIENTES = "/view/listaClientes.fxml";
    public static final String LISTAFORNECEDORES = "/view/listaFornecedores.fxml";
    public static final String LISTAPRODUTOS = "/view/listaProdutos.fxml";
    public static final String LOGIN = "/view/login.fxml";
    public static final String MAIN = "/view/main.fxml";
    public static final String NOVOCLIENTE = "/view/novoCliente.fxml";
    public static final String NOVOFORNECEDOR = "/view/novoFornecedor.fxml";
    public static final String NOVOPRODUTO = "/view/novoProduto.fxml";
    public static final String RELATORIOVENDAS = "/view/relatorioVendas.fxml";
    public static final String RESETARSENHA = "/view/resetarSenha.fxml";

    public static void main(String[] args) throws BussinesException {
        IFacade facade = Facade.getInstance();

//        launch(args);

        Endereco endereco = new Endereco();
        endereco.setBairro("AABB");
        endereco.setUf(EstadosUF.PERNAMBUCO);
        endereco.setCep("56912-310");
        endereco.setCidade("Serra Talhada");
        endereco.setNumero("1019");
        endereco.setComplemento("Casa");
        endereco.setLogradouro("Rua João");

        facade.inserirOuAtualizarEndereco(endereco);

        Cliente cliente = new Cliente();
        cliente.setSexo(TipoSexo.MASCULINO);
        cliente.setEndereco(endereco);
        cliente.setNome("Rafael");
        cliente.setTelefone("87999214475");
        cliente.setCpf("11279073449");
        cliente.setCnpj(null);
        cliente.setObservacao("OK");
        cliente.setEmail("rafael_alves_barros@hotmail.com");

        facade.inserirOuAtualizarCliente(cliente);
    }
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//
//        Pane root = FXMLLoader.load(getClass().getResource(LOGIN));
//        Scene scene = new Scene(root);
//        primaryStage.setScene(scene);
//        primaryStage.show();

//        STAGE.initOwner(STAGE_PRINCIPAL);
//        STAGE.initModality(Modality.WINDOW_MODAL);
//
//        stageLogin().setResizable(false);
//        stageLogin().setTitle("Login ZN Variedades");
//        stageLogin().initStyle(StageStyle.UNDECORATED);
//        stageLogin().show();

//    }

//    public static Stage stagePrincipal() throws IOException {
//        Stage STAGE = new Stage();
//        Stage STAGE_PRINCIPAL = new Stage();
//        STAGE_PRINCIPAL.setScene(new Scene(
//                FXMLLoader.load(Main.class.getResource (MAIN))));
//        STAGE.setOnCloseRequest(new EventHandler<WindowEvent>() {
//            public void handle(WindowEvent event) {
//                System.exit(0);}});
//        return  STAGE_PRINCIPAL;
//    }
//
//
//    public static  Stage stageLogin() throws IOException {
//        Stage STAGE = new Stage();
//        STAGE.setScene(new Scene(
//                FXMLLoader.load(Main.class.getResource(LOGIN))));
//        STAGE.setOnCloseRequest(new EventHandler<WindowEvent>() {
//            public void handle(WindowEvent event) { STAGE.close(); }});
//        return STAGE;
//    }
//
//
//    public static Stage genericaStage(String caminho) throws IOException {
//        Stage STAGE = new Stage();
//        STAGE.setScene(new Scene(
//                FXMLLoader.load(Main.class.getResource (caminho))));
//        STAGE.setOnCloseRequest(new EventHandler<WindowEvent>() {
//            public void handle(WindowEvent event) { STAGE.close(); }});
//        return STAGE;
//    }
//
//    public static Stage genericaStage01(Stage STAGE, String caminho) throws IOException {
//        STAGE.setScene(new Scene(
//                FXMLLoader.load(Main.class.getResource (caminho))));
//        STAGE.setOnCloseRequest(new EventHandler<WindowEvent>() {
//            public void handle(WindowEvent event) { STAGE.close(); }});
//        return STAGE;
//    }

}
