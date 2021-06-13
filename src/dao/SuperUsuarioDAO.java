package dao;

import model.SuperUsuario;

public class SuperUsuarioDAO extends Dao<SuperUsuario> implements ISuperUsuarioDAO{

    public SuperUsuarioDAO() {
        super(SuperUsuario.class);
    }

}
