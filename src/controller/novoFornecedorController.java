package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class novoFornecedorController implements Initializable{

    @FXML
    private AnchorPane fornecedorAnchorPane;

    @FXML
    private TextField nomeFornecedorField;

    @FXML
    private TextField cnpjFornecedorField;

    @FXML
    private TextField emailFornecedorField;

    @FXML
    private TextField telefoneFornecedorField;

    @FXML
    private Button salvarButton;

    @FXML
    private Button cancelarButton;

    @FXML
    private TextField observacaoField;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
