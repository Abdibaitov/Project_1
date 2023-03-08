import company.model.Gender;
import company.model.User;
import company.servise.impl.UserServiceImpl;
import exceptions.MyExection;

public class Main {
    public static void main(String[] args) {
        User user = new User(1, "User", 20, Gender.MALE);
        User user2 = new User(2, "User2", 18, Gender.FAMALE);
        User user3 = new User(3, "User3", 25, Gender.MALE);

        UserServiceImpl userServiceImpl = new UserServiceImpl();
        userServiceImpl.addUser(user);
        userServiceImpl.addUser(user2);
        userServiceImpl.addUser(user3);

//        userServiceImpl.findById(1);

        System.out.println("/n****************************************");

        try {
            System.out.println(userServiceImpl.findById(1));
        }
        catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
        System.out.println("/n****************************************");


        try{
            userServiceImpl.deleteUserById(3);
        }
        catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
        System.out.println("/n****************************************");
        userServiceImpl.getAllUsers();



    }
}