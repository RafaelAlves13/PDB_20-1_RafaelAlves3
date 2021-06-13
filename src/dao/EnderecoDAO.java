package dao;

import model.Endereco;

public class EnderecoDAO extends Dao<Endereco> implements IEnderecoDAO{

    public EnderecoDAO() {
        super(Endereco.class);
    }
}
