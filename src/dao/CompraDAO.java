package dao;

import model.Compra;

public class CompraDAO extends Dao<Compra> implements ICompraDAO{

    public CompraDAO() {
        super(Compra.class);
    }
}
