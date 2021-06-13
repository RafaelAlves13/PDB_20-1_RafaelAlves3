package enuns;

public enum EstadosUF {

    ACRE("Acre","AC"), ALAGOAS("Alagoas","AL"), AMAPA("Amapa","AP"),
    AMAZONAS("Amazonas","AM"), BAHIA("Bahia","BA"), CEARA("Ceará","CE"),
    DISTRITO_FERERAL("Distrito Federal","DF"), ESPIRITO_SANTO("Espírito Santo","ES"),
    GOIAS("Goiás","GO"), MARANAO("Maranhão","MA"), MINAS_GERAIS("Minas Gerais","MG"),
    MATO_GROSSO_DO_SUL("Mato Grosso do Sul","MS"), MATO_GROSSO("Mato Grosso","MT"),
    PARA("Pará¡","PA"), PERNAMBUCO("Pernambuco","PE"), PARAIBA("Paraíba","PB"),
    PARANA("Paraná","PR"), PIAUI("Piauí","PI"), RORAIMA("Roraima","RR"),
    RONDONIA("Rondônia","RO"), RIO_DE_JANEIRO("Rio de Janeiro","RJ"),
    RIO_GRANDE_DO_SUL("Rio Grande do Sul","RS"), RIO_GRANDE_DO_NORTE("Rio Grande do Norte","RN"),
    SANTA_CATARINA("Santa Catarina","SC"), SAO_PAULO("São Paulo","SP"),
    SERGIPE("Sergipe","SE"), TONANTINS("Tocantins","TO");

    private String nome, sigla;

    private EstadosUF(String nome, String sigla)
    {
        this.nome = nome;
        this.sigla = sigla;
    }

    private EstadosUF(String sigla) {
        this.sigla = sigla;
    }

    public static EstadosUF getEstadoUF(String estado)
    {
        for(EstadosUF e : values())
            if(e.toString().equalsIgnoreCase(estado))
                return e;
        return null;
    }

    @Override
    public String toString() {
        return sigla;
    }

}
