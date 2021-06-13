package dao;

import model.Produto;

public class ProdutoDAO extends Dao<Produto> implements IProdutoDAO {

    public ProdutoDAO(Class<Produto> class1) {
        super(class1);
    }

    public ProdutoDAO() {
        super(Produto.class);
    }
}
