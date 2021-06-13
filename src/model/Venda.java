package model;

import javax.persistence.*;

@Entity
@Table(name = "venda")
@SequenceGenerator(name = Entidade.SEQUENCE_ENTIDADE, sequenceName = Venda.SEQUENCE_ENTIDADE, initialValue = 1, allocationSize = 1)

public class Venda extends Entidade{
	
	private static final long serialVersionUID = 1L;
    protected static final String SEQUENCE_ENTIDADE = "produto_sequence";

    @JoinColumn(name = "produto")
    private String produto;

    @OneToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @Column(name = "data")
    private String data;

    @Column(name = "preco_Total")
    private double precoTotal;

    @Column(name = "qnt")
    private int qnt;

    @Column(name = "desconto")
    private double desconto;

    @ManyToOne
    @JoinColumn(name = "caixa_id")
    private Caixa caixa;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id",unique=true, nullable = false)
    private Integer id;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
