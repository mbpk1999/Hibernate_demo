package com.mbpk.hibernate.hibernate_intro;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.mbpk.hibernate.entity.Music;
import com.mbpk.hibernate.hibernate_utility.HibernateUtility;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class ReadSong2 {

	public static void main(String[] args) {
		
		SessionFactory sf = HibernateUtility.getSessionFactory();
		
		if (sf != null) {
			Session session = sf.openSession();
			CriteriaBuilder criteriabuilder = session.getCriteriaBuilder();
			CriteriaQuery<Music> criteriaquery = criteriabuilder.createQuery(Music.class);
			Root<Music> rt = criteriaquery.from(Music.class);
			criteriaquery.select(rt);
			//criteriaquery.where(criteriabuilder.equal(rt.get("Songid"),2));
			
			Query<Music> q1 = session.createQuery(criteriaquery);
			List<Music> list1 = q1.list();
			for (Music song : list1) {
				System.out.println(song);
			}
		}
		else {
			System.out.println("Session is null...");
		}
			
	}

}
