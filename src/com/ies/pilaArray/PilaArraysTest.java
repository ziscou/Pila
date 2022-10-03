package com.ies.pilaArray;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.jupiter.api.Assertions.*;


import org.hamcrest.core.StringContains;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PilaArraysTest {
	static PilaArrays<Integer> pila;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		pila = new PilaArrays<>();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testPilaArrays() {
		assertEquals(true,pila instanceof PilaArrays );
	}
	
	@Test
	void testEsVaciar() {
		assertEquals(true,pila.esVaciar());
	}
	@Test
	void testAniadir() {
		pila.aniadir(1);
		assertEquals(false, pila.esVaciar());
		assertEquals(1,pila.primero());
	}
	@Test
	void testExtraerPilaLlena() {
		pila.aniadir(1);
		assertEquals(false, pila.esVaciar());
		assertEquals(1,pila.extraer());
	}


	@Test
	void testPrimero() {
		pila.aniadir(1);
		assertEquals(false, pila.esVaciar());
		assertEquals(1,pila.primero());
	}

	@Test
	void testToString() {
		pila.aniadir(1);
		assertEquals(true, pila.toString().contains("1"));;
	}


}
