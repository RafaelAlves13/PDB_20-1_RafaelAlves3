package model;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "operador_caixa")
@SequenceGenerator(name = Entidade.SEQUENCE_ENTIDADE, sequenceName = OperadorCaixa.SEQUENCE_ENTIDADE,
        initialValue = 1, allocationSize = 1)

public class OperadorCaixa extends Usuario{

    private static final long serialVersionUID = 1L;
    protected static final String SEQUENCE_ENTIDADE = "operador-caixa_sequence";
}
