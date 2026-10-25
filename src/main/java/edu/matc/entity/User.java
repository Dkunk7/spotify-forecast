package edu.matc.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a user in the Spotify Forecast application. It stores a user's details, including username,
 * email, saved playlists, and saved weather information.
 */
public class User {

    private Integer id;
    private String username;
    private String email;

    // Check that "user" is correct here
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL,  orphanRemoval = true, fetch = FetchType.EAGER)
    // Playlist list only needs to be a list of links, I think
    private List<Playlist> playlists = new ArrayList<>();

    /**
     * Gets id.
     *
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets username.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets username.
     *
     * @param username the username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets playlists.
     *
     * @return the playlists
     */
    public List<Playlist> getPlaylists() {
        return playlists;
    }

    /**
     * Sets playlists.
     *
     * @param playlists the playlists
     */
    public void setPlaylists(List<Playlist> playlists) {
        this.playlists = playlists;
    }

    /**
     * Add playlist.
     *
     * @param playlist the playlist
     */
    public void addPlaylist(Playlist playlist) {
        playlists.add(playlist);
    }

    /**
     * Remove playlist.
     *
     * @param playlist the playlist
     */
    public void removePlaylist(Playlist playlist) {
        playlists.remove(playlist);
    }

    /**
     * Instantiates a new User.
     */
    public User() {

    }

    /**
     * Instantiates a new User.
     *
     * @param username the username
     * @param email    the email
     */
    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

}
