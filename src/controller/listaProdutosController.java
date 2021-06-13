package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

import java.net.URL;
import java.util.ResourceBundle;

public class listaProdutosController<TableColumn> implements Initializable{


    @FXML
    private StackPane listaProdutosPane;

    @FXML
    private AnchorPane listaProdutosAnchorPane;

    @FXML
    private ScrollPane scrollList;

//    @FXML
//    private TableView<?> tabelaProduto;
//
//    @FXML
//    private TableColumn<?, ?> codigoColumn;
//
//    @FXML
//    private TableColumn<?, ?> nomeColumn;
//
//    @FXML
//    private TableColumn<?, ?> qntColumn;
//
//    @FXML
//    private TableColumn<?, ?> precoCustoColumn;
//
//    @FXML
//    private TableColumn<?, ?> precoVenda;
//
//    @FXML
//    private TableColumn<?, ?> fornecedorColumn;
//
//    @FXML
//    private TableColumn<?, ?> categoriaColumn;
//
//    @FXML
//    private TableColumn<?, ?> descricaoColumn;

    @FXML
    private TextField inputProtudoField;

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

    public StackPane getListaProdutosPane() {
        return listaProdutosPane;
    }

    public void setListaProdutosPane(StackPane listaProdutosPane) {
        this.listaProdutosPane = listaProdutosPane;
    }

    public AnchorPane getListaProdutosAnchorPane() {
        return listaProdutosAnchorPane;
    }

    public void setListaProdutosAnchorPane(AnchorPane listaProdutosAnchorPane) {
        this.listaProdutosAnchorPane = listaProdutosAnchorPane;
    }

    public ScrollPane getScrollList() {
        return scrollList;
    }

    public void setScrollList(ScrollPane scrollList) {
        this.scrollList = scrollList;
    }

    public TextField getInputProtudoField() {
        return inputProtudoField;
    }

    public void setInputProtudoField(TextField inputProtudoField) {
        this.inputProtudoField = inputProtudoField;
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
