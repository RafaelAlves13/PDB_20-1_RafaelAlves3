package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

import java.net.URL;
import java.util.ResourceBundle;

public class listaClientesController implements Initializable {
    @FXML
    private StackPane listaClientesPane;

//    @FXML
//    private TableView<?> tabelaClientes;
//
//    @FXML
//    private TableColumn<?, ?> cpfColumn;
//
//    @FXML
//    private TableColumn<?, ?> nomeColumn;
//
//    @FXML
//    private TableColumn<?, ?> dnColumn;
//
//    @FXML
//    private TableColumn<?, ?> emailColumn;
//
//    @FXML
//    private TableColumn<?, ?> sexoColumn;
//
//    @FXML
//    private TableColumn<?, ?> telefoneColumn;
//
//    @FXML
//    private TableColumn<?, ?> descricaoColumn;

    @FXML
    private AnchorPane anchorListHeader;

    @FXML
    private TextField inputCliente;

    @FXML
    private Button pesquisarButton;

    @FXML
    private Button adicionarButton;

    @FXML
    private Button editarButton;

    @FXML
    private Button deletarButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public StackPane getListaClientesPane() {
        return listaClientesPane;
    }

    public void setListaClientesPane(StackPane listaClientesPane) {
        this.listaClientesPane = listaClientesPane;
    }

    public AnchorPane getAnchorListHeader() {
        return anchorListHeader;
    }

    public void setAnchorListHeader(AnchorPane anchorListHeader) {
        this.anchorListHeader = anchorListHeader;
    }

    public TextField getInputCliente() {
        return inputCliente;
    }

    public void setInputCliente(TextField inputCliente) {
        this.inputCliente = inputCliente;
    }

    public Button getPesquisarButton() {
        return pesquisarButton;
    }

    public void setPesquisarButton(Button pesquisarButton) {
        this.pesquisarButton = pesquisarButton;
    }

    public Button getAdicionarButton() {
        return adicionarButton;
    }

    public void setAdicionarButton(Button adicionarButton) {
        this.adicionarButton = adicionarButton;
    }

    public Button getEditarButton() {
        return editarButton;
    }

    public void setEditarButton(Button editarButton) {
        this.editarButton = editarButton;
    }

    public Button getDeletarButton() {
        return deletarButton;
    }

    public void setDeletarButton(Button deletarButton) {
        this.deletarButton = deletarButton;
    }
}
