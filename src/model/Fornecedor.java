package model;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "fornecedor")
@SequenceGenerator(name = Entidade.SEQUENCE_ENTIDADE, sequenceName = Fornecedor.SEQUENCE_ENTIDADE, initialValue = 1, allocationSize = 1)

public class Fornecedor extends Pessoa{
	
	private static final long serialVersionUID = 1L;
    protected static final String SEQUENCE_ENTIDADE = "fornecedor_sequence";
	
}
