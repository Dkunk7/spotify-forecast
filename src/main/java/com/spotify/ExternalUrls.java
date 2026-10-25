package com.spotify;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExternalUrls{

	@JsonProperty("spotify")
	private String spotify;

	public void setSpotify(String spotify){
		this.spotify = spotify;
	}

	public String getSpotify(){
		return spotify;
	}

	@Override
 	public String toString(){
		return 
			"ExternalUrls{" + 
			"spotify = '" + spotify + '\'' + 
			"}";
		}
}