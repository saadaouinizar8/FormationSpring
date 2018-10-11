package com.btk.service;

import org.springframework.stereotype.Service;

@Service
public class Calcul {

	public int additionner(int a, int b) {
//		System.out.println(">>>> LOG : A l'entrée de additionner");
		int resultat = a + b;
//		System.out.println("<<<< LOG : A la sortie de additionner");

		return resultat;
	}

	public int diviser(int a, int b) {
//		System.out.println(">>>> LOG : A l'entrée de diviser");
		int resultat = a / b;
//		System.out.println("<<<< LOG : A la sortie de diviser");
		return resultat;
	}
}
