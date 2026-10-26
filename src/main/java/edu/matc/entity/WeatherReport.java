package edu.matc.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.Objects;

/**
 * Represents a weather report in the Spotify Forecast application. It uses an entered location name and matches it to
 * latitude and longitude coordinates to search for the actual weather report.
 */
@Entity(name = "WeatherReport")
@Table(name = "weather")
public class WeatherReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @GenericGenerator(name = "native")
    private int id;

    @Column(name = "location_name")
    private String locationName;

    private String latitude;
    private String longitude;

    @ManyToOne
    private User user;

    /**
     * Instantiates a new Weather report.
     */
    public WeatherReport() {
    }

    /**
     * Instantiates a new Weather report.
     *
     * @param locationName the location name
     * @param latitude     the latitude
     * @param longitude    the longitude
     */
    public WeatherReport(String locationName, String latitude, String longitude, User user) {
        this.locationName = locationName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.user = user;
    }

    /**
     * Gets user.
     *
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets user.
     *
     * @param user the user
     */
    public void setUser(User user) {
        this.user = user;
    }


    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets latitude.
     *
     * @return the latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Sets latitude.
     *
     * @param latitude the latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * Gets longitude.
     *
     * @return the longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Sets longitude.
     *
     * @param longitude the longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * Gets location name.
     *
     * @return the location name
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Sets location name.
     *
     * @param locationName the location name
     */
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        WeatherReport that = (WeatherReport) o;
        return id == that.id && Objects.equals(locationName, that.locationName) && Objects.equals(latitude, that.latitude) && Objects.equals(longitude, that.longitude) && Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, locationName, latitude, longitude, user);
    }
}

