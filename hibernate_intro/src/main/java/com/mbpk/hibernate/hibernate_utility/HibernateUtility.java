package com.mbpk.hibernate.hibernate_utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mbpk.hibernate.entity.Music;

public class HibernateUtility {

	private static SessionFactory sf = null;

	public static SessionFactory getSessionFactory() {

		if (sf == null) {
			Configuration config = new Configuration();
			config.configure("hibernate.cfg.xml");
			config.addAnnotatedClass(Music.class);
			SessionFactory sf = config.buildSessionFactory();
		}
		return sf;
	}
}
