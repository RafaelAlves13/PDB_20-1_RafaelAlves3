package enuns;

public enum ResetSenha {

    SIM ("Solicitou RESET SENHA"), NAO ("-");

    private final String exibicao;

    private ResetSenha(String exibicao) {

        this.exibicao = exibicao;
    }

    public String getExibicao() {
        return this.exibicao;
    }

    @Override
    public String toString() {
        return exibicao;
    }
}
