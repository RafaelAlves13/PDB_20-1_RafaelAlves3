package model;


import javax.persistence.*;

@Entity
@Table(name = "pessoa")
@SequenceGenerator(name = Entidade.SEQUENCE_ENTIDADE, sequenceName = Pessoa.SEQUENCE_ENTIDADE, initialValue = 1, allocationSize = 1)

public abstract class Pessoa extends Entidade{

	private static final long serialVersionUID = 1L;
    protected static final String SEQUENCE_ENTIDADE = "pessoa_sequence";

    @Column(nullable = false, length = 50)
	private String email;

	@Column(nullable = false, length = 50)
	private String nome;

	@Column(nullable = false, length = 100)
	private String observacao;

	@Column(nullable = false, unique = true)
	private String cpf;

	@Column(nullable = false, unique = true)
	private String cnpj;

	@Column(nullable = false, length = 20)
	private String telefone;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "endereco_id")
	private Endereco endereco;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id",unique=true, nullable = false)
	private Integer id;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}
}