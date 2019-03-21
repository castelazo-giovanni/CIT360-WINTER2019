/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate_spoke;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.*;

/**
 *
 * @author Giovanni
 */
public class SpokeDAO {
   SessionFactory factory = null;
    Session session = null;

    private static SpokeDAO single_instance = null;

    private SpokeDAO()
    {
        factory = HibernateUtils.getSessionFactory();
    }

    /** This is what makes this class a singleton.  You use this
     *  class to get an instance of the class. */
    public static SpokeDAO getInstance()
    {
        if (single_instance == null) {
            single_instance = new SpokeDAO();
        }

        return single_instance;
    }

    /** Used to get more than one customer from database
     *  Uses the OpenSession construct rather than the
     *  getCurrentSession method so that I control the
     *  session.  Need to close the session myself in finally.*/
    public List<Registration> getRegistrations() {

        try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from hibernate_spoke.Registration";
            List<Registration> cs = (List<Registration>)session.createQuery(sql).getResultList();
            session.getTransaction().commit();
            return cs;

        } catch (Exception e) {
            e.printStackTrace();
            // Rollback in case of an error occurred.
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }

    }

    /** Used to get a single customer from database */
    public Registration getRegistration(int id) {

        try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from hibernate_spoke.Registration where id=" + Integer.toString(id);
            Registration c = (Registration)session.createQuery(sql).getSingleResult();
            session.getTransaction().commit();
            return c;

        } catch (Exception e) {
            e.printStackTrace();
            // Rollback in case of an error occurred.
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }

}
