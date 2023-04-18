package com.mbpk.hibernate.hibernate_utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mbpk.hibernate.entity.Music;

public class HibernateUtility {

	private static SessionFactory sf = null;

	public static SessionFactory getSessionFactory() {

		try {
			if (sf == null) {
				Configuration config = new Configuration();
				config.configure("hibernate.cfg.xml");
				config.addAnnotatedClass(Music.class);
				sf = config.buildSessionFactory();
			} 
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error in building session factory.....");
		}
		return sf;
	}
}
