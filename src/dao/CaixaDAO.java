package dao;

import model.Caixa;

public class CaixaDAO extends Dao<Caixa> implements ICaixaDAO{

    public CaixaDAO() {
        super(Caixa.class);
    }

}
