package com.btk.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.btk.domain.Compte;

public class App {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();

		
		Compte compte = session.get(Compte.class, "C1000");
		
		//Compte compte = session.load(Compte.class, "C1000");
		//System.out.println(compte);

		factory.close();

		session.close();
	}
}
