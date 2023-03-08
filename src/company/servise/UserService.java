package company.servise;

import company.model.User;

public interface UserService {

    void addUser(User user);

    User findById(int id);

    void deleteUserById(int id);

    void getAllUsers();

}
