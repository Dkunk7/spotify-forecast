package com.geoCode;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Location{

	@JsonProperty("generationtime_ms")
	private Object generationtimeMs;

	@JsonProperty("results")
	private List<ResultsItem> results;

	public void setGenerationtimeMs(Object generationtimeMs){
		this.generationtimeMs = generationtimeMs;
	}

	public Object getGenerationtimeMs(){
		return generationtimeMs;
	}

	public void setResults(List<ResultsItem> results){
		this.results = results;
	}

	public List<ResultsItem> getResults(){
		return results;
	}

	@Override
 	public String toString(){
		return 
			"Location{" + 
			"generationtime_ms = '" + generationtimeMs + '\'' + 
			",results = '" + results + '\'' + 
			"}";
		}
}