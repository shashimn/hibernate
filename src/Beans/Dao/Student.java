package Beans.Dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Beans.Dto.StudentDto;

public class Student {
	
	public void save(StudentDto st2) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sfg = cfg.buildSessionFactory();
		Session s = sfg.openSession();
		Transaction tx = s.beginTransaction();

		try {
			s.save(st2);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			s.close();
		}

		// s.evict(atr);

	}
}