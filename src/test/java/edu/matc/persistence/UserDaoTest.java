package edu.matc.persistence;

import edu.matc.entity.User;
import edu.matc.testUtils.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    UserDao userDao;

    @BeforeEach
    void setUp() {
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");

        userDao = new UserDao();
    }

    @Test
    void getUserById() {
        User retrievedUser = userDao.getUserById(1);

        assertEquals("dkunk7", retrievedUser.getUsername());
    }

    @Test
    void updateUser() {
    }

    @Test
    void insertUser() {
    }

    @Test
    void deleteUser() {
    }

    @Test
    void getAllUser() {
    }
}