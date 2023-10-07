package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Leo", "Messi", (byte) 36);
        userService.saveUser("Cristiano", "Ronaldo", (byte) 38);
        userService.saveUser("Gennaro", "Gattuso", (byte) 45);
        userService.saveUser("Andrew", "Robertson", (byte) 29);
        userService.removeUserById(3);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}
