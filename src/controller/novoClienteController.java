package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class novoClienteController implements Initializable{

    @FXML
    private AnchorPane novoClienteAnchorPane;

    @FXML
    private TextField nomeClienteField;

    @FXML
    private TextField cpfClienteField;

    @FXML
    private TextField emailClienteField;

    @FXML
    private TextField dataNascFiled;

    @FXML
    private Button salvarButton;

    @FXML
    private Button cancelarButton;

    @FXML
    private TextField observacaoClienteField;

    @FXML
    private RadioButton masculinoRadioButton;

    @FXML
    private RadioButton femininoRadioButton;

    @FXML
    private TextField telefoneClienteFlied;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public TextField getNomeClienteField() {
        return nomeClienteField;
    }

    public void setNomeClienteField(TextField nomeClienteField) {
        this.nomeClienteField = nomeClienteField;
    }

    public TextField getCpfClienteField() {
        return cpfClienteField;
    }

    public void setCpfClienteField(TextField cpfClienteField) {
        this.cpfClienteField = cpfClienteField;
    }

    public TextField getEmailClienteField() {
        return emailClienteField;
    }

    public void setEmailClienteField(TextField emailClienteField) {
        this.emailClienteField = emailClienteField;
    }

    public TextField getDataNascFiled() {
        return dataNascFiled;
    }

    public void setDataNascFiled(TextField dataNascFiled) {
        this.dataNascFiled = dataNascFiled;
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

    public TextField getObservacaoClienteField() {
        return observacaoClienteField;
    }

    public void setObservacaoClienteField(TextField observacaoClienteField) {
        this.observacaoClienteField = observacaoClienteField;
    }

    public RadioButton getMasculinoRadioButton() {
        return masculinoRadioButton;
    }

    public void setMasculinoRadioButton(RadioButton masculinoRadioButton) {
        this.masculinoRadioButton = masculinoRadioButton;
    }

    public RadioButton getFemininoRadioButton() {
        return femininoRadioButton;
    }

    public void setFemininoRadioButton(RadioButton femininoRadioButton) {
        this.femininoRadioButton = femininoRadioButton;
    }

    public TextField getTelefoneClienteFlied() {
        return telefoneClienteFlied;
    }

    public void setTelefoneClienteFlied(TextField telefoneClienteFlied) {
        this.telefoneClienteFlied = telefoneClienteFlied;
    }

    public AnchorPane getNovoClienteAnchorPane() {
        return novoClienteAnchorPane;
    }

    public void setNovoClienteAnchorPane(AnchorPane novoClienteAnchorPane) {
        this.novoClienteAnchorPane = novoClienteAnchorPane;
    }
}
