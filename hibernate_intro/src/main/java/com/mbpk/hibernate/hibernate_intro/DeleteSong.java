package com.mbpk.hibernate.hibernate_intro;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mbpk.hibernate.entity.Music;
import com.mbpk.hibernate.hibernate_utility.HibernateUtility;

public class DeleteSong {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtility.getSessionFactory();
		Session session = sf.openSession();
		
		Music song = session.get(Music.class, 1);
		System.out.println(song);
		
		session.beginTransaction();
		session.remove(song); // can use delete but it is deprecated
		session.getTransaction().commit();
		System.out.println("Deleted the song....");
		
	}

}
