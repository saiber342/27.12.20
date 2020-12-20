package CRUDApplication.service;

import CRUDApplication.models.User;

import java.util.List;

public interface UserService {

    List<User> index();
    User show(int id);
    void saveUser(User user);
    void editUser(int id, User editedUser);
    void delete(int id);

}
