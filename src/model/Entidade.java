package model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public abstract class Entidade implements Serializable{

	public static final long serialVersionUID = 1L;
	protected static final String SEQUENCE_ENTIDADE = "ENTIDADE";

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQUENCE_ENTIDADE)
	private Integer id;

	@Column
	private boolean status = true;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isAtivade() {
		return status;
	}

	public void setAtivade(boolean ativade) {
		this.status = ativade;
	}

}
