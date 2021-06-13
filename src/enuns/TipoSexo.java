package enuns;

public enum TipoSexo {

    MASCULINO("Masculino"), FEMININO("Feminino");

    private String sexo;

    private TipoSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return sexo;
    }
}
