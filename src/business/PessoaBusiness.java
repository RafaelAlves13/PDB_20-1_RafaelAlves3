package business;

import dao.IPessoaDAO;
import dao.PessoaDAO;
import exception.ValidacaoException;
import model.Pessoa;

public class PessoaBusiness extends Business<Pessoa> implements IPessoaBusiness{

    private IPessoaDAO iPessoaDAO;

    public PessoaBusiness() {
        iPessoaDAO = new PessoaDAO();
        init(iPessoaDAO);
    }

    @Override
    public void isValid(Pessoa pessoa) throws ValidacaoException {

    }
}