package com.mbpk.hibernate.hibernate_intro;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mbpk.hibernate.entity.Music;
import com.mbpk.hibernate.hibernate_utility.HibernateUtility;

public class ReadSong {

	public static void main(String[] args) {
		
		SessionFactory sf = HibernateUtility.getSessionFactory();
		
		if (sf != null) {
			Session session = sf.openSession();
			Music song = session.get(Music.class, 1);// can use load
			System.out.println(song);
		}
		else {
			System.out.println("Session is null...");
		}
			
	}

}
