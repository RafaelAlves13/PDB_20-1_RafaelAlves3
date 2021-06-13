package util;

public class SQLUtil {

    public static final String BUSCAR_LOGIN = "select u from Usuario u where u.login = :login and u.senha = :senha";
    public static final String BUSCAR_TIPO_USUARIO = "SELECT u FROM Usuario u WHERE u.NivelAcesso='";
    public static final String BUSCAR_CPF_USUARIO = "SELECT u FROM Usuario u WHERE u.cpf = :cpf";
    public static final String BUSCAR_LOGIN_APENAS = "select u from Usuario u where u.login = :login";
    public static String TIPO = "SELECT";
    public static final String BUSCAR_LOG = "select l.data, l.alteracao, l.autor, l.tabela FROM log l ";

}
