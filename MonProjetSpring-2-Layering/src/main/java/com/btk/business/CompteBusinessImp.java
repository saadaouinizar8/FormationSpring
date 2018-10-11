package com.btk.business;

import java.math.BigDecimal;

import com.btk.dataaccess.IComptesRepository;
import com.btk.domain.Compte;

public class CompteBusinessImp implements ICompteBusiness {

	private IComptesRepository repository;

	@Override
	public BigDecimal consulterSolde(String numero) {

		//Simulons une règle de gestion qui stipule que les compte "C" sont bonifiés de 10%

		Compte compte = repository.findById(numero);

		return (compte.getNumero().startsWith("C")) ? compte.getSolde().multiply(new BigDecimal("1.1"))
				: compte.getSolde();
	}

	public IComptesRepository getRepository() {
		return repository;
	}

	public void setRepository(IComptesRepository repository) {
		this.repository = repository;
	}
	
	// expression conditionnel ()? :

}
