package business;

import dao.EnderecoDAO;
import dao.IEnderecoDAO;
import exception.ValidacaoException;
import model.Endereco;

public class EnderecoBusiness extends Business<Endereco> implements IEnderecoBusiness {

    private IEnderecoDAO ienderecoDAO;

    public EnderecoBusiness() {
        ienderecoDAO = new EnderecoDAO();
        init(ienderecoDAO);
    }

    @Override
    public void isValid(Endereco endereco) throws ValidacaoException {
        if (endereco.getBairro().isEmpty()){
            throw new ValidacaoException("O campo Bairro tem que está preenchido!"); }
        if (endereco.getCidade().isEmpty()){
            throw new ValidacaoException("O campo Cidade tem que está preenchido!"); }
        if (endereco.getCep().isEmpty()){
            throw new ValidacaoException("O campo CEP tem que está preenchido!"); }
        if (endereco.getComplemento().isEmpty()){
            throw new ValidacaoException("O campo Complemento tem que está preenchido!"); }
        if (endereco.getLogradouro().isEmpty()){
            throw new ValidacaoException("O campo Logradouro tem que está preenchido!"); }
        if (endereco.getNumero().isEmpty()){
            throw new ValidacaoException("O campo Numero tem que está preenchido!"); }
//        if (endereco.getUf().equals(""){
//            throw new ValidacaoException("O campo UF tem que está preenchido!"); }
    }
}
