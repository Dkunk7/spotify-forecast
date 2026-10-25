package com.spotify;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlaylistResult {

	@JsonProperty("playlists")
	private Playlist playlists;

	public void setPlaylists(Playlist playlists){
		this.playlists = playlists;
	}

	public Playlist getPlaylists(){
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