package CRUDApplication.service;

import CRUDApplication.dao.UserDAO;
import CRUDApplication.dao.UserDAOImpl;
import CRUDApplication.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;


    @Override
    public List<User> index() {
        return userDAO.index();
    }

    @Override
    public User show(int id) {
        return userDAO.show(id);
    }

    @Override
    public void saveUser(User user) {
        userDAO.saveUser(user);

    }

    @Override
    public void editUser(int id, User editedUser) {
        userDAO.editUser(id,editedUser);

    }

    @Override
    public void delete(int id) {
        userDAO.delete(id);

    }
}
