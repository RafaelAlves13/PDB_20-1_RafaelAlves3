package enuns;

public enum NivelAcesso {

    SUPER_USUARIO("Super Usuário"), GERENTE("Gerente"), OPERADOR_CAIXA("Operador Caixa");

    private String exibicao;

    private NivelAcesso(String descricao) {
        this.exibicao = descricao;
    }

    public String getExibicao() {
        return this.exibicao;
    }

    @Override
    public String toString() {
        return exibicao;
    }
}
