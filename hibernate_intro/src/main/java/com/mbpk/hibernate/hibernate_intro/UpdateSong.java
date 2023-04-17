package com.mbpk.hibernate.hibernate_intro;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mbpk.hibernate.entity.Music;
import com.mbpk.hibernate.hibernate_utility.HibernateUtility;

public class UpdateSong {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtility.getSessionFactory();
		Session session = sf.openSession();
		
		Music song = session.get(Music.class, 2);
		System.out.println(song);
		song.setSinger("GV Prakash");
		
		session.beginTransaction();
		session.merge(song);// can use update but it is deprecated
		session.getTransaction().commit();
		System.out.println("Updated the song....");
		
		Music song1 = session.get(Music.class, 2);
		System.out.println(song1);
	}

}
