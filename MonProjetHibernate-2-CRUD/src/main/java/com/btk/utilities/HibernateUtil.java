package com.btk.utilities;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory factory;

	static {
		try {
			factory = new Configuration().configure().buildSessionFactory();

		} catch (HibernateException e) {
			System.out.println("LOG - Attention, il y a eu l'exception " + e + "lors de la création de la factory");
		}

	}

	public static SessionFactory getSessionFactory() {
		return factory;
	}

}
