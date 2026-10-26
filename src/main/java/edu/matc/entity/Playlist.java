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

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    /**
     * Instantiates a new Playlist.
     */
    public Playlist() {}


    /**
     * Instantiates a new Playlist.
     *
     * @param playlistName the playlist name
     * @param playlistLink the playlist link
     * @param user         the user
     */
    public Playlist(String playlistName, String playlistLink, User user) {
        this.playlistName = playlistName;
        this.playlistLink = playlistLink;
        this.user = user;
    }

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
     * Gets user.
     *
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets user.
     *
     * @param user the user
     */
    public void setUser(User user) {
        this.user = user;
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
