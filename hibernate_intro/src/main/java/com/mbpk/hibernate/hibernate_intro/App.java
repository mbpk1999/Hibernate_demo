package com.mbpk.hibernate.hibernate_intro;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mbpk.hibernate.entity.Music;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration config = new Configuration();
    	config.configure("hibernate.cfg.xml");
    	config.addAnnotatedClass(Music.class);
    	SessionFactory sf = config.buildSessionFactory();
    	Session session = sf.openSession();
    	
        Music song = new Music();
        song.setSongid(4);
        song.setSongName("What a Karuvad");
        song.setSinger("Dhanush");
        
        session.beginTransaction();
        session.persist(song);
        session.getTransaction().commit();
        
        System.out.println("Song added to the library....");
        
    }
}
