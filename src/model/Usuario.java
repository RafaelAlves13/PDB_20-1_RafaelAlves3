package model;

import enuns.NivelAcesso;
import enuns.ResetSenha;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
@SequenceGenerator(name = Entidade.SEQUENCE_ENTIDADE, sequenceName = Usuario.SEQUENCE_ENTIDADE, initialValue = 1, allocationSize = 1)

public abstract class Usuario extends Entidade{

	private static final long serialVersionUID = 1L;
    protected static final String SEQUENCE_ENTIDADE = "usuario_sequence";

    @Column(nullable = false)
    private String senha;

    @Column(nullable = false, unique = true)
    private String login;

    @Column(nullable = false, length = 100)
    private String nome;

    @Enumerated(EnumType.STRING)
    private NivelAcesso nivelAcesso;

    @Enumerated(EnumType.STRING)
    private ResetSenha solicitar_reset;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id",unique=true, nullable = false)
    private Integer id;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelAcesso getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(NivelAcesso nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public ResetSenha getSolicitar_reset() {
        return solicitar_reset;
    }

    public void setSolicitar_reset(ResetSenha solicitar_reset) {
        this.solicitar_reset = solicitar_reset;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
