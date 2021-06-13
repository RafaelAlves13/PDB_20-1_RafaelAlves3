package dao;

import model.Venda;

public class VendaDAO extends Dao<Venda> implements IVendaDAO{

    public VendaDAO() {
        super(Venda.class);
    }

}
