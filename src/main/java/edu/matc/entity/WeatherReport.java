package edu.matc.entity;

/**
 * Represents a weather report in the Spotify Forecast application. It uses an entered location name and matches it to
 * latitude and longitude coordinates to search for the actual weather report.
 */
public class WeatherReport {
    // Gonna need to use open meteo's geocoding api to convert searched location to coordinates for the actual weather retrieval.
    // What else goes here?
    private String locationName;
    private String latitude;
    private String longitude;


    /**
     * Instantiates a new Weather report.
     */
    public WeatherReport() {}

    /**
     * Instantiates a new Weather report.
     *
     * @param locationName the location name
     */
    public WeatherReport(String locationName) {
        this.locationName = locationName;
        // Use location name to search for coords
        // Use coords to get weather
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


}
