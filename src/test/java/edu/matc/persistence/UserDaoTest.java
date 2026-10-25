package edu.matc.persistence;

import edu.matc.testUtils.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    @BeforeEach
    void setUp() {
        Database database = Database.getInstance();
        database.runSQL(cleandb.sql);
    }

    @Test
    void getUserById() {
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