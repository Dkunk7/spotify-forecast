package edu.matc.controller;

import edu.matc.entity.User;
import edu.matc.entity.WeatherReport;
import edu.matc.persistence.UserDao;
import edu.matc.persistence.WeatherReportDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/weather")
public class WeatherServlet extends HttpServlet {

    private UserDao userDao;
    private WeatherReportDao weatherDao;

    private final Logger logger = LogManager.getLogger(this.getClass());


    @Override
    public void init() throws ServletException {
        userDao = new UserDao();
        weatherDao = new WeatherReportDao();
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Send all users and all weather reports to weather.jsp
        List<User> users = userDao.getAllUser();
        request.setAttribute("users", users);

        List<WeatherReport> weatherReports = weatherDao.getAllWeatherReport();
        request.setAttribute("weatherReports", weatherReports);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/weather.jsp");

        dispatcher.forward(request, response);
    }

}
