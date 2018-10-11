package com.btk.client;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.btk.business.ICompteBusiness;
import com.btk.configuration.MySpringConfiguration;

@Component
public class ClientConsole {

	@Autowired
	private ICompteBusiness business;

	public static void main(String[] args) {

		//try (ClassPathXmlApplicationContext ctxt = new ClassPathXmlApplicationContext("beans.xml")) {
		try (AnnotationConfigApplicationContext ctxt = new AnnotationConfigApplicationContext(MySpringConfiguration.class)) {
			ClientConsole client = ctxt.getBean(ClientConsole.class);
			BigDecimal solde = client.getBusiness().consulterSolde("C1000");
			System.out.println("Le solde est" + solde);
		}

	}

	public ICompteBusiness getBusiness() {
		return business;
	}

	public void setBusiness(ICompteBusiness business) {
		this.business = business;
	}

}
