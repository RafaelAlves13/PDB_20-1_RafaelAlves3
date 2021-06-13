package dao;

import exception.DAOException;
import model.Usuario;
import util.SQLUtil;

import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class UsuarioDAO extends Dao<Usuario> implements IUsuarioDAO{

    public UsuarioDAO() {
        super(Usuario.class);
    }

    @Override
    public Usuario buscarLoginUsuario(String login, String senha) throws DAOException {

        try {
            TypedQuery<Usuario> typedQuery = entityManager().createQuery(SQLUtil.BUSCAR_LOGIN, class1);
            typedQuery.setParameter("login", login);
            typedQuery.setParameter("senha", senha);
            return typedQuery.getSingleResult();

        } catch (NoResultException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            throw new DAOException("Não foi encontrado Usuario");

        }catch(Exception e){
            e.printStackTrace();
            System.err.println(e.getMessage());
            throw new DAOException("Erro de busca no "+ class1.getSimpleName()+ " " +e.getMessage());
        }
    }

   // @Override
    public List<Usuario> buscarTodos(String string) throws DAOException {
        try {
            TypedQuery<Usuario> typedQuery = entityManager().createQuery(SQLUtil.BUSCAR_LOGIN, class1);
            return typedQuery.getResultList();

        } catch (NoResultException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            throw new DAOException("Não foi encontrado Usuario");

        }catch(Exception e){
            e.printStackTrace();
            System.err.println(e.getMessage());
            throw new DAOException("Erro de busca no "+ class1.getSimpleName()+ " " +e.getMessage());
        }
    }

    //@Override
    public Usuario buscarTipo(String tipocargo) throws DAOException {

        try {
            Query q = entityManager().createQuery(SQLUtil.BUSCAR_TIPO_USUARIO+tipocargo+"'");

            Usuario usuario =(Usuario) q.getSingleResult() ;
            usuario.getNome();
            return usuario;

        } catch (NoResultException e) {
            e.printStackTrace();
            return null;

        }catch(Exception e){
            e.printStackTrace();
            throw new DAOException("Erro de busca no "+ class1.getSimpleName()+ " " +e.getMessage());
        }
    }

   // @Override
    public Usuario buscarCPF(String cpf) throws DAOException {

        try {
            TypedQuery<Usuario> typedQuery = entityManager().createQuery(SQLUtil.BUSCAR_CPF_USUARIO, class1);
            typedQuery.setParameter("cpf", cpf);
            return typedQuery.getSingleResult();

        } catch (NoResultException e) {
            throw new DAOException("Não foi encontrado nenhum cpf");

        }catch(Exception e){
            e.printStackTrace();
            System.err.println(e.getMessage());
            throw new DAOException("Erro de busca no "+ class1.getSimpleName()+ " " +e.getMessage());
        }
    }

    //@Override
    public Usuario buscarLogin(String login) throws DAOException {

        try {
            TypedQuery<Usuario> typedQuery = entityManager().createQuery(SQLUtil.BUSCAR_LOGIN_APENAS, class1);
            typedQuery.setParameter("login", login);
            return typedQuery.getSingleResult();

        } catch (NoResultException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            throw new DAOException("Não foi encontrado Usuario com esse login");

        }catch(Exception e){
            e.printStackTrace();
            System.err.println(e.getMessage());
            throw new DAOException("Erro de busca no "+ class1.getSimpleName()+ " " +e.getMessage());
        }
    }
}
