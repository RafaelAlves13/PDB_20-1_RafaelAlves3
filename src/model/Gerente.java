package model;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "gerente")
@SequenceGenerator(name = Entidade.SEQUENCE_ENTIDADE, sequenceName = Gerente.SEQUENCE_ENTIDADE,
        initialValue = 1, allocationSize = 1)

public class Gerente extends Usuario{

    private static final long serialVersionUID = 1L;
    protected static final String SEQUENCE_ENTIDADE = "gerente_sequence";
}
