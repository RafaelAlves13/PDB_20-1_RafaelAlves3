package dao;

import model.Gerente;

public class GerenteDAO extends Dao<Gerente> implements IGerenteDAO{

    public GerenteDAO(Class<Gerente> class1) {
        super(class1);
    }

    public GerenteDAO() {
        super(Gerente.class);
    }
}
