package dao;

import model.itemProduto;

public class itemProdutoDAO extends Dao<itemProduto> implements IitemProdutoDAO{

    public itemProdutoDAO() {
        super(itemProduto.class);
    }

}
