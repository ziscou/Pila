package com.ies.pila;

import java.util.LinkedList;

public class Pila<T> {
	private LinkedList<T> lista;

	public Pila() {
		lista = new LinkedList<>();
	}
	
	public boolean estaVacia() {
		return lista.isEmpty();
	}
	public T extraer() {
		return	lista.removeLast();
	}
	public T primero() {
		return lista.getFirst();
	}
	public void aniadir(T ob) {
		lista.addLast(ob);
	}

	@Override
	public String toString() {
		String devolver = "Pila: \n";
		
		for (T t : lista) {
			devolver += t.toString()+"\n";
		}
		return devolver;
	}
	
}
