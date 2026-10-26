package edu.matc.persistence;

import edu.matc.entity.Playlist;
import edu.matc.entity.User;
import edu.matc.testUtils.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for PlaylistDao
 */
class PlaylistDaoTest {

    PlaylistDao playlistDao;

    /**
     * Repopulates the database before each test
     */
    @BeforeEach
    void setUp() {
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");

        playlistDao = new PlaylistDao();
    }


    /**
     * Tests that you can get a playlist by id
     */
    @Test
    void getPlaylistById() {
        Playlist playlist = playlistDao.getPlaylistById(1);

        assertEquals("My cool playlist", playlist.getPlaylistName());
    }

    /**
     * Tests that you can update a playlist
     */
    @Test
    void updatePlaylist() {
        Playlist playlist = playlistDao.getPlaylistById(1);
        playlist.setPlaylistName("My LAME playlist");
        playlistDao.updatePlaylist(playlist);

        Playlist retrievedPlaylist = playlistDao.getPlaylistById(1);
        assertEquals("My LAME playlist", retrievedPlaylist.getPlaylistName());
    }

    /**
     * Tests that you can insert a playlist
     */
    @Test
    void insertPlaylist() {
        UserDao userDao = new UserDao();
        User user = userDao.getUserById(1);

        Playlist playlist = new Playlist("Dance Tunes", "spotify.com/playlist1", user);
        int playlistId = playlistDao.insertPlaylist(playlist);

        Playlist retrievedPlaylist = playlistDao.getPlaylistById(playlistId);
        assertEquals("Dance Tunes", retrievedPlaylist.getPlaylistName());
    }

    /**
     * Tests that you can delete a playlist
     */
    @Test
    void deletePlaylist() {
        Playlist playlist = playlistDao.getPlaylistById(1);
        playlistDao.deletePlaylist(playlist);

        assertNull(playlistDao.getPlaylistById(1));
    }

    /**
     * Tests that you can get all playlists
     */
    @Test
    void getAllPlaylists() {
        List<Playlist> playlists = playlistDao.getAllPlaylists();
        assertEquals(3, playlists.size());
    }
}