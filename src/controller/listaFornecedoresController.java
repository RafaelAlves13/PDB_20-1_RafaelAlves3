package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

import java.net.URL;
import java.util.ResourceBundle;

public class listaFornecedoresController implements Initializable{
    @FXML
    private StackPane listaFornecedoresPane;

    @FXML
    private AnchorPane listaProdutosAnchorPane;

    @FXML
    private TableView<?> tableFornecedores;

    @FXML
    private TableColumn<?, ?> cnpjColumn;

    @FXML
    private TableColumn<?, ?> nomeColumn;

    @FXML
    private TableColumn<?, ?> telefoneColumn;

    @FXML
    private TableColumn<?, ?> emailColumn;

    @FXML
    private TableColumn<?, ?> observacaoColumn;

    @FXML
    private AnchorPane anchorListHeader;

    @FXML
    private TextField inputSearch;

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

    public StackPane getListaFornecedoresPane() {
        return listaFornecedoresPane;
    }

    public void setListaFornecedoresPane(StackPane listaFornecedoresPane) {
        this.listaFornecedoresPane = listaFornecedoresPane;
    }

    public AnchorPane getListaProdutosAnchorPane() {
        return listaProdutosAnchorPane;
    }

    public void setListaProdutosAnchorPane(AnchorPane listaProdutosAnchorPane) {
        this.listaProdutosAnchorPane = listaProdutosAnchorPane;
    }

    public AnchorPane getAnchorListHeader() {
        return anchorListHeader;
    }

    public void setAnchorListHeader(AnchorPane anchorListHeader) {
        this.anchorListHeader = anchorListHeader;
    }

    public TextField getInputSearch() {
        return inputSearch;
    }

    public void setInputSearch(TextField inputSearch) {
        this.inputSearch = inputSearch;
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
