package com.spotify;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Playlist{

	@JsonProperty("playlists")
	private Playlists playlists;

	public void setPlaylists(Playlists playlists){
		this.playlists = playlists;
	}

	public Playlists getPlaylists(){
		return playlists;
	}

	@Override
 	public String toString(){
		return 
			"Playlist{" + 
			"playlists = '" + playlists + '\'' + 
			"}";
		}
}