package edu.matc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * Represents a playlist from the Spotify API.
 */
@Entity(name = "Playlist")
@Table(name = "playlist")
public class Playlist {
    // Find out what else I need here
    private String playlistName;
    private String playlistLink;

    /**
     * Gets playlist link.
     *
     * @return the playlist link
     */
    public String getPlaylistLink() {
        return playlistLink;
    }

    /**
     * Sets playlist link.
     *
     * @param playlistLink the playlist link
     */
    public void setPlaylistLink(String playlistLink) {
        this.playlistLink = playlistLink;
    }

    /**
     * Gets playlist name.
     *
     * @return the playlist name
     */
    public String getPlaylistName() {
        return playlistName;
    }

    /**
     * Sets playlist name.
     *
     * @param playlistName the playlist name
     */
    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

}
