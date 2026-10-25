package com.openMeteo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Hourly{

	@JsonProperty("wind_speed_10m")
	private List<Object> windSpeed10m;

	@JsonProperty("temperature_2m")
	private List<Object> temperature2m;

	@JsonProperty("relative_humidity_2m")
	private List<Integer> relativeHumidity2m;

	@JsonProperty("time")
	private List<String> time;

	public void setWindSpeed10m(List<Object> windSpeed10m){
		this.windSpeed10m = windSpeed10m;
	}

	public List<Object> getWindSpeed10m(){
		return windSpeed10m;
	}

	public void setTemperature2m(List<Object> temperature2m){
		this.temperature2m = temperature2m;
	}

	public List<Object> getTemperature2m(){
		return temperature2m;
	}

	public void setRelativeHumidity2m(List<Integer> relativeHumidity2m){
		this.relativeHumidity2m = relativeHumidity2m;
	}

	public List<Integer> getRelativeHumidity2m(){
		return relativeHumidity2m;
	}

	public void setTime(List<String> time){
		this.time = time;
	}

	public List<String> getTime(){
		return time;
	}

	@Override
 	public String toString(){
		return 
			"Hourly{" + 
			"wind_speed_10m = '" + windSpeed10m + '\'' + 
			",temperature_2m = '" + temperature2m + '\'' + 
			",relative_humidity_2m = '" + relativeHumidity2m + '\'' + 
			",time = '" + time + '\'' + 
			"}";
		}
}