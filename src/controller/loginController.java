package controller;

import facade.Facade;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import main.Main;
import model.Usuario;
import util.SQLUtil;
import view.Mensagem;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class loginController implements Initializable {

    public static String login, senha;
    private  Usuario usuario;
    private static Usuario user;
    private mainController mainControl;
    private Facade facade = Facade.getInstance();

    @FXML
    private TextField loginField;

    @FXML
    private PasswordField senhaField;

    @FXML
    private Button entrarButton;

    @FXML
    private Button SairButton;

    @FXML
    private Button esqueceuSenhaButton;

    @FXML
    void entrar(ActionEvent event) throws IOException {
        if(efetuarLogin()){
//            Main.stagePrincipal().show();
//            Main.stagePrincipal().setResizable(false);
//            Main.stagePrincipal().setTitle("Tela Inicial");
//            Main.stageLogin().close();
        }
    }
    public boolean efetuarLogin(){
        try {
            usuario = facade.buscarLoginUsuario(loginField.getText(),senhaField.getText());
            senha = usuario.getSenha();

            if (usuario == null){
                Mensagem.getInstance().mostrarMensagem("LOGIN", "Senha ou Login incorretos," +
                        "Por favor verifique novamente seus dados", Alert.AlertType.ERROR);
                return false;
            }

            user = usuario;
            this.loginField.clear();
            this.senhaField.clear();
            SQLUtil.TIPO =  usuario.getNivelAcesso().toString();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            Mensagem.getInstance().mostrarMensagem("LOGIN", "Senha ou Login incorretos, Por favor verifique novamente seus dados", Alert.AlertType.ERROR);
            this.loginField.clear();
            this.senhaField.clear();
            return false;
        }
    }

    @FXML
    void sair(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void esqueceuSenha(ActionEvent event) throws IOException {

//        Main.genericaStage(Main.RESETARSENHA);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public static Usuario getUser() {
        return user;
    }

    public static void setUser(Usuario user) {
        loginController.user = user;
    }

    public mainController getMainControl() {
        return mainControl;
    }

    public void setMainControl(mainController mainControl) {
        this.mainControl = mainControl;
    }

    public Facade getFacade() {
        return facade;
    }

    public void setFacade(Facade facade) {
        this.facade = facade;
    }

    public TextField getLoginField() {
        return loginField;
    }

    public void setLoginField(TextField loginField) {
        this.loginField = loginField;
    }

    public PasswordField getSenhaField() {
        return senhaField;
    }

    public void setSenhaField(PasswordField senhaField) {
        this.senhaField = senhaField;
    }

    public Button getEntrarButton() {
        return entrarButton;
    }

    public void setEntrarButton(Button entrarButton) {
        this.entrarButton = entrarButton;
    }

    public Button getSairButton() {
        return SairButton;
    }

    public void setSairButton(Button sairButton) {
        SairButton = sairButton;
    }

    public Button getEsqueceuSenhaButton() {
        return esqueceuSenhaButton;
    }

    public void setEsqueceuSenhaButton(Button esqueceuSenhaButton) {
        this.esqueceuSenhaButton = esqueceuSenhaButton;
    }
}
