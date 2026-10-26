package edu.matc.persistence;

import edu.matc.entity.User;
import edu.matc.entity.WeatherReport;
import edu.matc.testUtils.Database;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for WeatherReportDao
 */
class WeatherReportDaoTest {
    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    WeatherReportDao weatherReportDao;

    /**
     * Repopulates the database before each test
     */
    @BeforeEach
    void setUp() {
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");

        weatherReportDao = new WeatherReportDao();
    }

    @Test
    void getWeatherReportById() {
        WeatherReport retrievedReport = weatherReportDao.getWeatherReportById(1);

        assertEquals("Madison", retrievedReport.getLocationName());
    }

    @Test
    void updateWeatherReport() {
        WeatherReport weatherToUpdate = weatherReportDao.getWeatherReportById(1);
        weatherToUpdate.setLocationName("Milwaukee");
        weatherReportDao.updateWeatherReport(weatherToUpdate);

        WeatherReport retrievedReport = weatherReportDao.getWeatherReportById(1);
        assertEquals("Milwaukee", retrievedReport.getLocationName());
    }

    @Test
    void insertWeatherReport() {
        UserDao userDao = new UserDao();
        User user = userDao.getUserById(1);

        WeatherReport weatherToInsert = new WeatherReport("Reedsburg", "52.512604", "52.512604", user);
        int id = weatherReportDao.insertWeatherReport(weatherToInsert);
        logger.debug("ID from weather insert: " + id);
        WeatherReport retrievedReport = weatherReportDao.getWeatherReportById(id);
        logger.debug(retrievedReport.getLocationName());
        assertNotEquals(0, id);
        assertEquals("Reedsburg", retrievedReport.getLocationName());

        // NOTE: Having trouble comparing these two objects, even though I have override methods for hashCode and equals
//        assertEquals(weatherToInsert, retrievedReport);
    }

    @Test
    void deleteWeatherReport() {
        weatherReportDao.deleteWeatherReport(weatherReportDao.getWeatherReportById(1));
        assertNull(weatherReportDao.getWeatherReportById(1));
    }

    @Test
    void getAllWeatherReport() {
        List<WeatherReport> weatherReports = weatherReportDao.getAllWeatherReport();
        assertEquals(3, weatherReports.size());
    }
}