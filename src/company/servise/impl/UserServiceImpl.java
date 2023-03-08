package company.servise.impl;

import company.dao.UserDao;
import company.model.User;
import company.servise.UserService;
import exceptions.MyExection;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDao();

    List<User> users2 = new ArrayList<>();


    @Override
    public void addUser(User user) {
        userDao.getUsers().add(user);
        System.out.println(user);
    }

    @Override
    public User findById(int id) {
        for (User user : userDao.getUsers()) {
            if (user.getId() == id) {
                return user;
            }
        }
        throw new MyExection("Not found user with id: " + id);
    }

    @Override
    public void deleteUserById(int id) {
        boolean isTrue = true;
        for (int i = 0; i < userDao.getUsers().size(); i++) {
            if (userDao.getUsers().get(i).getId() == id) {
                System.out.println("Deleted user: "+userDao.getUsers().get(i));
                userDao.getUsers().remove(userDao.getUsers().get(i));
                isTrue = false;
            }
        }
        if (isTrue){
            throw new MyExection("Not found user with id: "+id);
        }

    }

    @Override
    public void getAllUsers() {
        for (User user : userDao.getUsers()) {
            System.out.println(user);
        }
    }
}
