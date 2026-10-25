package com.openMeteo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherResults {

	@JsonProperty("elevation")
	private int elevation;

	@JsonProperty("hourly_units")
	private HourlyUnits hourlyUnits;

	@JsonProperty("generationtime_ms")
	private Object generationtimeMs;

	@JsonProperty("current")
	private Current current;

	@JsonProperty("timezone_abbreviation")
	private String timezoneAbbreviation;

	@JsonProperty("current_units")
	private CurrentUnits currentUnits;

	@JsonProperty("timezone")
	private String timezone;

	@JsonProperty("latitude")
	private Object latitude;

	@JsonProperty("utc_offset_seconds")
	private int utcOffsetSeconds;

	@JsonProperty("hourly")
	private Hourly hourly;

	@JsonProperty("longitude")
	private Object longitude;

	public void setElevation(int elevation){
		this.elevation = elevation;
	}

	public int getElevation(){
		return elevation;
	}

	public void setHourlyUnits(HourlyUnits hourlyUnits){
		this.hourlyUnits = hourlyUnits;
	}

	public HourlyUnits getHourlyUnits(){
		return hourlyUnits;
	}

	public void setGenerationtimeMs(Object generationtimeMs){
		this.generationtimeMs = generationtimeMs;
	}

	public Object getGenerationtimeMs(){
		return generationtimeMs;
	}

	public void setCurrent(Current current){
		this.current = current;
	}

	public Current getCurrent(){
		return current;
	}

	public void setTimezoneAbbreviation(String timezoneAbbreviation){
		this.timezoneAbbreviation = timezoneAbbreviation;
	}

	public String getTimezoneAbbreviation(){
		return timezoneAbbreviation;
	}

	public void setCurrentUnits(CurrentUnits currentUnits){
		this.currentUnits = currentUnits;
	}

	public CurrentUnits getCurrentUnits(){
		return currentUnits;
	}

	public void setTimezone(String timezone){
		this.timezone = timezone;
	}

	public String getTimezone(){
		return timezone;
	}

	public void setLatitude(Object latitude){
		this.latitude = latitude;
	}

	public Object getLatitude(){
		return latitude;
	}

	public void setUtcOffsetSeconds(int utcOffsetSeconds){
		this.utcOffsetSeconds = utcOffsetSeconds;
	}

	public int getUtcOffsetSeconds(){
		return utcOffsetSeconds;
	}

	public void setHourly(Hourly hourly){
		this.hourly = hourly;
	}

	public Hourly getHourly(){
		return hourly;
	}

	public void setLongitude(Object longitude){
		this.longitude = longitude;
	}

	public Object getLongitude(){
		return longitude;
	}

	@Override
 	public String toString(){
		return 
			"WeatherReport{" + 
			"elevation = '" + elevation + '\'' + 
			",hourly_units = '" + hourlyUnits + '\'' + 
			",generationtime_ms = '" + generationtimeMs + '\'' + 
			",current = '" + current + '\'' + 
			",timezone_abbreviation = '" + timezoneAbbreviation + '\'' + 
			",current_units = '" + currentUnits + '\'' + 
			",timezone = '" + timezone + '\'' + 
			",latitude = '" + latitude + '\'' + 
			",utc_offset_seconds = '" + utcOffsetSeconds + '\'' + 
			",hourly = '" + hourly + '\'' + 
			",longitude = '" + longitude + '\'' + 
			"}";
		}
}