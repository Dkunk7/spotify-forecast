package edu.matc.persistence;

import edu.matc.entity.WeatherReport;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;

import java.util.List;

public class WeatherReportDao {


    private final Logger logger = LogManager.getLogger(this.getClass());
    /**
     * The Session factory.
     */
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    /**
     * Get weather report by id
     *
     * @param id the id
     * @return the weather report
     */
    public WeatherReport getWeatherReportById(Integer id){
        Session session = sessionFactory.openSession();
        WeatherReport weatherReport = session.get(WeatherReport.class, id);
        session.close();
        return weatherReport;
    }

    /**
     * Update weatherReport.
     *
     * @param weatherReport the weatherReport
     */
    public void updateWeatherReport(WeatherReport weatherReport){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.merge(weatherReport);
        transaction.commit();
        session.close();
    }

    /**
     * Insert weatherReport
     *
     * @param weatherReport the weatherReport
     * @return the weatherReport id
     */
    public int insertWeatherReport(WeatherReport weatherReport){
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(weatherReport);
        transaction.commit();
        id = weatherReport.getId();
        session.close();
        return id;
    }

    /**
     * Delete weatherReport.
     *
     * @param weatherReport the weatherReport
     */
    public void deleteWeatherReport(WeatherReport weatherReport){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(weatherReport);
        transaction.commit();
        session.close();
    }

    /**
     * Get all weatherReport list.
     *
     * @return the list
     */
    public List<WeatherReport> getAllWeatherReport(){

        Session session = sessionFactory.openSession();

        HibernateCriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<WeatherReport> criteriaQuery = builder.createQuery(WeatherReport.class);
        Root<WeatherReport> root = criteriaQuery.from(WeatherReport.class);
        List<WeatherReport> weatherReports = session.createQuery(criteriaQuery).getResultList();
        logger.info("weatherReports: " + weatherReports);
        session.close();

        return weatherReports;
    }

}
}
