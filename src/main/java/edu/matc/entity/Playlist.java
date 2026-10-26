package edu.matc.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

/**
 * Represents a playlist from the Spotify API.
 */
@Entity(name = "Playlist")
@Table(name = "playlist")
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @GenericGenerator(name = "native")
    private int id;

    @Column(name = "name")
    private String playlistName;
    @Column(name = "url")
    private String playlistLink;

    @ManyToOne
    private User user;


    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Instantiates a new Playlist.
     */
    public Playlist() {}

    /**
     * Instantiates a new Playlist.
     *
     * @param playlistName the playlist name
     * @param playlistLink the playlist link
     */
    public Playlist(String playlistName, String playlistLink) {
        this.playlistName = playlistName;
        this.playlistLink = playlistLink;
    }

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
