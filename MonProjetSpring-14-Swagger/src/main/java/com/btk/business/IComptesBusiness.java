package com.btk.business;

import java.math.BigDecimal;
import java.util.List;

import com.btk.domain.Compte;

public interface IComptesBusiness {

	void ouvrirCompte(Compte c) throws Exception;

	List<Compte> tousLesComptes();

	BigDecimal consulterSolde(String numero);

	void cloturerCompte(String numero);

}
