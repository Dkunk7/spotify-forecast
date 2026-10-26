package edu.matc.persistence;

import edu.matc.entity.Playlist;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;

import java.util.List;

/**
 * The Playlist Data Access Object
 */
public class PlaylistDao {

    private final Logger logger = LogManager.getLogger(this.getClass());
    /**
     * The Session factory.
     */
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();


    /**
     * Gets playlist by id.
     *
     * @param id the id
     * @return the playlist by id
     */
    public Playlist getPlaylistById(Integer id) {
        Session session = sessionFactory.openSession();
        Playlist playlist = (Playlist) session.get(Playlist.class, id);
        session.close();
        return playlist;
    }

    /**
     * Update playlist.
     *
     * @param playlist the playlist
     */
    public void updatePlaylist(Playlist playlist) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.merge(playlist);
        transaction.commit();
        session.close();
    }

    /**
     * Insert playlist int.
     *
     * @param playlist the playlist
     * @return the int
     */
    public int insertPlaylist(Playlist playlist) {
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(playlist);
        transaction.commit();
        id = playlist.getId();
        session.close();
        return id;
    }

    /**
     * Delete playlist.
     *
     * @param playlist the playlist
     */
    public void deletePlaylist(Playlist playlist) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(playlist);
        transaction.commit();
        session.close();
    }

    /**
     * Gets all playlists.
     *
     * @return the all playlists
     */
    public List<Playlist> getAllPlaylists() {
        Session session = sessionFactory.openSession();

        HibernateCriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Playlist> criteriaQuery = builder.createQuery(Playlist.class);
        Root<Playlist> root = criteriaQuery.from(Playlist.class);
        List<Playlist> playlists = session.createQuery(criteriaQuery).getResultList();
        logger.info("playlists: " + playlists);
        session.close();

        return playlists;
    }

}
