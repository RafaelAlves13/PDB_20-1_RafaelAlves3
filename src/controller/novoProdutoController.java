package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class novoProdutoController implements Initializable{

    @FXML
    private AnchorPane novoProdutoAnchorPane;

    @FXML
    private TextField nomeProdutoField;

    @FXML
    private TextField codigoProdutoField;

    @FXML
    private Label categoriaProdutoLabel;

    @FXML
    private TextField precoCustoField;

    @FXML
    private TextField precoVendaField;

    @FXML
    private TextField qntProdutoField;

    @FXML
    private Button salvarButton;

    @FXML
    private Button cancelarButton;

    @FXML
    private Label fornecedoreProdutoLabel;

    @FXML
    private TextField descricaoLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public AnchorPane getNovoProdutoAnchorPane() {
        return novoProdutoAnchorPane;
    }

    public void setNovoProdutoAnchorPane(AnchorPane novoProdutoAnchorPane) {
        this.novoProdutoAnchorPane = novoProdutoAnchorPane;
    }

    public TextField getNomeProdutoField() {
        return nomeProdutoField;
    }

    public void setNomeProdutoField(TextField nomeProdutoField) {
        this.nomeProdutoField = nomeProdutoField;
    }

    public TextField getCodigoProdutoField() {
        return codigoProdutoField;
    }

    public void setCodigoProdutoField(TextField codigoProdutoField) {
        this.codigoProdutoField = codigoProdutoField;
    }

    public Label getCategoriaProdutoLabel() {
        return categoriaProdutoLabel;
    }

    public void setCategoriaProdutoLabel(Label categoriaProdutoLabel) {
        this.categoriaProdutoLabel = categoriaProdutoLabel;
    }

    public TextField getPrecoCustoField() {
        return precoCustoField;
    }

    public void setPrecoCustoField(TextField precoCustoField) {
        this.precoCustoField = precoCustoField;
    }

    public TextField getPrecoVendaField() {
        return precoVendaField;
    }

    public void setPrecoVendaField(TextField precoVendaField) {
        this.precoVendaField = precoVendaField;
    }

    public TextField getQntProdutoField() {
        return qntProdutoField;
    }

    public void setQntProdutoField(TextField qntProdutoField) {
        this.qntProdutoField = qntProdutoField;
    }

    public Button getSalvarButton() {
        return salvarButton;
    }

    public void setSalvarButton(Button salvarButton) {
        this.salvarButton = salvarButton;
    }

    public Button getCancelarButton() {
        return cancelarButton;
    }

    public void setCancelarButton(Button cancelarButton) {
        this.cancelarButton = cancelarButton;
    }

    public Label getFornecedoreProdutoLabel() {
        return fornecedoreProdutoLabel;
    }

    public void setFornecedoreProdutoLabel(Label fornecedoreProdutoLabel) {
        this.fornecedoreProdutoLabel = fornecedoreProdutoLabel;
    }

    public TextField getDescricaoLabel() {
        return descricaoLabel;
    }

    public void setDescricaoLabel(TextField descricaoLabel) {
        this.descricaoLabel = descricaoLabel;
    }
}
