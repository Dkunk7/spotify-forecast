package com.openMeteo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Current{

	@JsonProperty("wind_speed_10m")
	private Object windSpeed10m;

	@JsonProperty("temperature_2m")
	private Object temperature2m;

	@JsonProperty("interval")
	private int interval;

	@JsonProperty("time")
	private String time;

	public void setWindSpeed10m(Object windSpeed10m){
		this.windSpeed10m = windSpeed10m;
	}

	public Object getWindSpeed10m(){
		return windSpeed10m;
	}

	public void setTemperature2m(Object temperature2m){
		this.temperature2m = temperature2m;
	}

	public Object getTemperature2m(){
		return temperature2m;
	}

	public void setInterval(int interval){
		this.interval = interval;
	}

	public int getInterval(){
		return interval;
	}

	public void setTime(String time){
		this.time = time;
	}

	public String getTime(){
		return time;
	}

	@Override
 	public String toString(){
		return 
			"Current{" + 
			"wind_speed_10m = '" + windSpeed10m + '\'' + 
			",temperature_2m = '" + temperature2m + '\'' + 
			",interval = '" + interval + '\'' + 
			",time = '" + time + '\'' + 
			"}";
		}
}