package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class resetarSenhaController implements Initializable{
    @FXML
    private AnchorPane redefinirSenhaAnchorPane;

    @FXML
    private TextField loginRSField;

    @FXML
    private PasswordField senhaRSField;

    @FXML
    private Button cancelarButton;

    @FXML
    private Button salvarButton;

    @FXML
    private TextField novaSenhaRSField;

    @FXML
    private PasswordField confirmarSenhaRSField;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public AnchorPane getRedefinirSenhaAnchorPane() {
        return redefinirSenhaAnchorPane;
    }

    public void setRedefinirSenhaAnchorPane(AnchorPane redefinirSenhaAnchorPane) {
        this.redefinirSenhaAnchorPane = redefinirSenhaAnchorPane;
    }

    public TextField getLoginRSField() {
        return loginRSField;
    }

    public void setLoginRSField(TextField loginRSField) {
        this.loginRSField = loginRSField;
    }

    public PasswordField getSenhaRSField() {
        return senhaRSField;
    }

    public void setSenhaRSField(PasswordField senhaRSField) {
        this.senhaRSField = senhaRSField;
    }

    public Button getCancelarButton() {
        return cancelarButton;
    }

    public void setCancelarButton(Button cancelarButton) {
        this.cancelarButton = cancelarButton;
    }

    public Button getSalvarButton() {
        return salvarButton;
    }

    public void setSalvarButton(Button salvarButton) {
        this.salvarButton = salvarButton;
    }

    public TextField getNovaSenhaRSField() {
        return novaSenhaRSField;
    }

    public void setNovaSenhaRSField(TextField novaSenhaRSField) {
        this.novaSenhaRSField = novaSenhaRSField;
    }

    public PasswordField getConfirmarSenhaRSField() {
        return confirmarSenhaRSField;
    }

    public void setConfirmarSenhaRSField(PasswordField confirmarSenhaRSField) {
        this.confirmarSenhaRSField = confirmarSenhaRSField;
    }
}
