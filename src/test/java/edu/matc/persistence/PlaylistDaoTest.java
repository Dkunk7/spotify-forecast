package edu.matc.persistence;

import edu.matc.entity.Playlist;
import edu.matc.testUtils.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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


    @Test
    void getPlaylistById() {
        Playlist playlist = playlistDao.getPlaylistById(1);

        assertEquals("My cool playlist", playlist.getPlaylistName());
    }

    @Test
    void updatePlaylist() {
        Playlist playlist = playlistDao.getPlaylistById(1);
        playlist.setPlaylistName("My LAME playlist");
        playlistDao.updatePlaylist(playlist);

        Playlist retrievedPlaylist = playlistDao.getPlaylistById(1);
        assertEquals("My LAME playlist", retrievedPlaylist.getPlaylistName());
    }

    @Test
    void insertPlaylist() {
    }

    @Test
    void deletePlaylist() {
    }

    @Test
    void getAllPlaylists() {
    }
}