package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;

public class Main {
    public static void main(String[] args) {

        UserDaoHibernateImpl userDao = new UserDaoHibernateImpl();
        userDao.createUsersTable();

        userDao.saveUser("Leo", "Messi", (byte) 36);
        userDao.saveUser("Cristiano", "Ronaldo", (byte) 38);
        userDao.saveUser("Gennaro", "Gattuso", (byte) 45);
        userDao.saveUser("Andrew", "Robertson", (byte) 29);

        userDao.removeUserById(3);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
        
    }
}
