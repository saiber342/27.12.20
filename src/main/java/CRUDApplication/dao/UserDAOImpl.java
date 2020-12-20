package CRUDApplication.dao;

import CRUDApplication.models.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Component
@Repository
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    @SuppressWarnings("unchecked")
    public List<User> index() {
        return entityManager.createQuery("FROM User").getResultList();
    }

    @Override
    public User show(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void saveUser(User user) {
       entityManager.persist(user);
    }

    @Override
    public void editUser(int id, User editedUser) {
        entityManager.merge(editedUser);

    }

    @Override
    public void delete(int id) {
        User userForDelete = entityManager.find(User.class, id);
        entityManager.remove(userForDelete);
    }
}
