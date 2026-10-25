package edu.matc.persistence;

import edu.matc.entity.User;
import edu.matc.testUtils.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The test class for UserDao.
 */
class UserDaoTest {

    /**
     * The User dao.
     */
    UserDao userDao;

    /**
     * Repopulates the database before each test
     */
    @BeforeEach
    void setUp() {
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");

        userDao = new UserDao();
    }

    /**
     * Tests that you can get user by Id.
     */
    @Test
    void getUserById() {
        User retrievedUser = userDao.getUserById(1);

        assertEquals("dkunk7", retrievedUser.getUsername());
    }

    /**
     * Tests that you can pdate user.
     */
    @Test
    void updateUser() {
        User userToUpdate = userDao.getUserById(1);
        userToUpdate.setUsername("dkunk8");
        userDao.updateUser(userToUpdate);

        User userAfterUpdate = userDao.getUserById(1);
        assertEquals("dkunk8", userAfterUpdate.getUsername());
    }

    /**
     * Tests that you can insert user.
     */
    @Test
    void insertUser() {
        User userToInsert = new User("Arnold4", "ar4@gmail.com");
        userDao.insertUser(userToInsert);

        User userAfterInsert = userDao.getUserById(4);
        assertEquals("Arnold4", userAfterInsert.getUsername());
    }

    /**
     *
     * Tests that you can delete user.
     */
    @Test
    void deleteUser() {
        User userToDelete = userDao.getUserById(3);
        userDao.deleteUser(userToDelete);

        assertNull(userDao.getUserById(3));
    }

    /**
     * Tests that you can get all users.
     */
    @Test
    void getAllUser() {
        List<User> users = userDao.getAllUser();
        assertEquals(3, users.size());
    }
}