package model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "itemproduto")
@SequenceGenerator(name = Entidade.SEQUENCE_ENTIDADE, sequenceName = itemProduto.SEQUENCE_ENTIDADE, initialValue = 1, allocationSize = 1)

public class itemProduto extends Produto{
	
	private static final long serialVersionUID = 1L;
    protected static final String SEQUENCE_ENTIDADE = "intemproduto_sequence";

    @OneToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

    @Column(name = "preco_venda")
    private double precoVenda;

    @Column(name = "preco_custo")
    private double precoCusto;

    @Column(name = "qnt")
    private int qnt;

    @Column(name = "data_entrada")
    private LocalDate dataEntrada;

    @Column(name = "categoria")
    private String categoria;

    @Column(name = "descricao")
    private String descricao;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
