package model;

import enuns.EstadosUF;

import javax.persistence.*;

@Entity
@Table(name = "endereco")
@SequenceGenerator(name = Entidade.SEQUENCE_ENTIDADE, sequenceName = Endereco.SEQUENCE_ENTIDADE, initialValue = 1, allocationSize = 1)

public class Endereco extends Entidade{
	
	private static final long serialVersionUID = 1L;
    protected static final String SEQUENCE_ENTIDADE = "endereco_sequence";

    @Column(nullable = false, length = 50)
    private String cidade;

    @Column(nullable = false, length = 40)
    private String bairro;

    @Enumerated(EnumType.STRING)
    private EstadosUF uf;

    @Column(nullable = false, length = 9)
    private String cep;

    @Column(nullable = false, length = 20)
    private String numero;

    @Column(nullable = false, length = 120)
    private String logradouro;

    @Column(nullable = false, length = 100)
    private String complemento;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", unique=true, nullable = false)
    private Integer id;


    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public EstadosUF getUf() {
        return uf;
    }

    public void setUf(EstadosUF uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cidade='" + cidade + '\'' +
                ", bairro='" + bairro + '\'' +
                ", uf=" + uf +
                ", cep='" + cep + '\'' +
                ", numero='" + numero + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", complemento='" + complemento + '\'' +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
