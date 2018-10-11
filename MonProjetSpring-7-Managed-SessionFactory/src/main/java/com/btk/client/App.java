package com.btk.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.btk.domain.Compte;

public class App {
	public static void main(String[] args) {
		
		
		//démarrer le conteneur Spring
		
		ConfigurableApplicationContext ctxt = new ClassPathXmlApplicationContext("beans.xml");
		
		//obtenir la session factory à partir de la configuration
		
		try (SessionFactory factory = ctxt.getBean(SessionFactory.class)){
			
			//travailler sur les objets persistant via la session 
			Session session = factory.openSession();
			
			Compte compte = session.load(Compte.class, "C1000");
			
			System.out.println(compte);

			
			//close la session
			session.close();
		} 
		
		
		
		
		
		
		
	}
}
