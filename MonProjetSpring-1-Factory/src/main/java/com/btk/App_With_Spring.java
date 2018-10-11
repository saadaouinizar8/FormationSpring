package com.btk;



import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.btk.domain.Compte;

/**
 * Hello world!
 *
 */
public class App_With_Spring 
{
    public static void main( String[] args )
    {
    	//démarrer le conteneur (le contexte) Spring
    	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	
    	
    	//Demander l'objet au conteneur
    	Compte c = context.getBean("compte0", Compte.class);
    	
    	//travailler avec l'objet
        System.out.println("Obtenu à partir de la factory de spring"+c);
        
        //arrêter le conteneur
        context.close();
    }
}
