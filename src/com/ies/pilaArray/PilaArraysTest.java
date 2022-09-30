package com.ies.pilaArray;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PilaArraysTest {
	PilaArrays<Integer> pila;

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
		assertEquals(true,pila);
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
	void testExtraer() {
		fail("Not yet implemented");
	}

	@Test
	void testPrimero() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testMain() {
		fail("Not yet implemented");
	}

}
