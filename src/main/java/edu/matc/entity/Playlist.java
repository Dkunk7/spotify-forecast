package edu.matc.entity;

/**
 * Represents a playlist from the Spotify API.
 */
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
