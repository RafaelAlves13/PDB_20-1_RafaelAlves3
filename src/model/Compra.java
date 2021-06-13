package model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "compra")
@SequenceGenerator(name = Entidade.SEQUENCE_ENTIDADE, sequenceName = Compra.SEQUENCE_ENTIDADE, initialValue = 1, allocationSize = 1)

public class Compra extends Entidade{
	
	private static final long serialVersionUID = 1L;
    protected static final String SEQUENCE_ENTIDADE = "compra_sequence";

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "fornecedor_id")
    private Fornecedor fornecedor;

    @Column(name = "qnt")
    private int qnt;

    @Column(name = "preco")
    private double preco;

    @Column(name = "data_compra")
    private LocalDate dataCompra;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id",unique=true, nullable = false)
    private Integer id;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
