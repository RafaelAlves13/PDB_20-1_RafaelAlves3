package model;

import enuns.TipoSexo;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "cliente")
@SequenceGenerator(name = Entidade.SEQUENCE_ENTIDADE, sequenceName = Cliente.SEQUENCE_ENTIDADE, initialValue = 1, allocationSize = 1)

public class Cliente extends Pessoa{
	
	private static final long serialVersionUID = 1L;
    protected static final String SEQUENCE_ENTIDADE = "cliente_sequence";

    @Enumerated(EnumType.STRING)
    private TipoSexo sexo;

    @Column(name = "data_Nascimento")
    private LocalDate dataNascimento;

    public TipoSexo getSexo() {
        return sexo;
    }

    public void setSexo(TipoSexo sexo) {
        this.sexo = sexo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
