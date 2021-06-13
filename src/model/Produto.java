package model;

import javax.persistence.*;

@Entity
@Table(name = "produto")
@SequenceGenerator(name = Entidade.SEQUENCE_ENTIDADE, sequenceName = Produto.SEQUENCE_ENTIDADE, initialValue = 1, allocationSize = 1)

public class Produto extends Entidade{
	
	private static final long serialVersionUID = 1L;
    protected static final String SEQUENCE_ENTIDADE = "produto_sequence";

    @Column(nullable = false, unique = true)
    private String codigo;

    @Column(name = "marca")
    private String marca;

    @OneToOne
    @JoinColumn(name = "fornecedor_id")
    private Fornecedor fornecedor;

    @Column(nullable = false, length = 50)
    private String nome;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id",unique=true, nullable = false)
    private Integer id;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
