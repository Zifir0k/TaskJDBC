package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService userService = new UserServiceImpl();
    public static void main(String[] args) {
        userService.cleanUsersTable();

        userService.saveUser("Andje", "Sapkovski", (byte) 74);

        userService.saveUser("Oliver", "Bolden", (byte) 75);

        userService.saveUser("Govard", "Lavkraft", (byte) 59);

        userService.saveUser("Maria", "Remark", (byte) 74);

        userService.removeUserById(2);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
