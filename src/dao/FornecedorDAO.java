package dao;

import model.Fornecedor;

public class FornecedorDAO extends Dao<Fornecedor> implements  IFornecedorDAO{

    public FornecedorDAO() {
        super(Fornecedor.class);
    }

}
