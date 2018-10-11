package com.btk.repository;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.btk.domain.Compte;

public class TestComptesRepositoryImpl_Hibernate {

	private IComptesRepository underTest;

	@Before
	public void setUp() throws Exception {
		underTest = new ComptesRepositoryImpl_Hibernate();
	}

	@After
	public void tearDown() throws Exception {
		underTest = null;
	}

	@Test
	public final void testCreate() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testFindById() {
		String id ="C1000";
		// ARRANGE
		//Compte expected = new Compte("C1000", "Nizar", new BigDecimal("1000.000"));
		Compte expected = new Compte();
		// ACT
		Compte actual = underTest.findById(id);

		// assert
		assertEquals(expected, actual);
		
	
	}

	@Test
	public final void testFindAll() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testUpdate() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testDelete() {
		fail("Not yet implemented"); // TODO
	}

}
