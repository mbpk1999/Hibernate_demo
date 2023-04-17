package com.mbpk.hibernate.hibernate_intro;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mbpk.hibernate.entity.Music;
import com.mbpk.hibernate.hibernate_utility.HibernateUtility;

/**
 * Hello world!
 *
 */
public class CreateSong 
{
    public static void main( String[] args )
    {
    	SessionFactory sf = HibernateUtility.getSessionFactory();
    	Session session = sf.openSession();
    	
        Music song = new Music();
        song.setSongid(1);
        song.setSongName("Wolves");
        song.setSinger("Selena");
        
        session.beginTransaction();
        session.persist(song);//can use save but deprecated
        session.getTransaction().commit();
        
        System.out.println("Song added to the library....");
        
    }

	
}
