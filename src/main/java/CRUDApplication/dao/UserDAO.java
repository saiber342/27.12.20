package CRUDApplication.dao;

import CRUDApplication.models.User;

import java.util.List;

public interface UserDAO {
    List<User> index();
    User show(int id);
    void saveUser(User user);
    void editUser(int id, User editedUser);
    void delete(int id);
}
