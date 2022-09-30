package com.ies.pilaArray;

import java.util.Arrays;

public class PilaArrays<T> {
	

	T[] tabla;
	int cont = 0;

	public PilaArrays() {
		tabla = (T[]) new Object[0] ;
	}
	
	public void aniadir(T t) {
		tabla= Arrays.copyOf(tabla, cont+1);
		tabla[cont] = t;
		cont++;
	}
	public boolean esVaciar() {
		return (tabla.length==0);
	}
	public T extraer() {
		T t = tabla[--cont];
		tabla=Arrays.copyOf(tabla, tabla.length-1);
		return	t;
	}
	public T primero() {
		return (tabla.length !=0)? tabla[0]:null;
	}
	@Override
	public String toString() {
		String devolver = "Pila<"+((tabla.length !=0)? tabla[0].getClass().getSimpleName():"N.D.")+">: \n";
		
		for (T t : tabla) {
			devolver += t.toString()+"\n";
		}
		return devolver;
	}
	public static void main(String[] args) {
		PilaArrays<Integer> p = new PilaArrays<>();
		p.aniadir(1);

		
		System.out.println(p.toString());
		
		System.out.println(p.extraer());

		System.out.println(p.primero());
		System.out.println(p.toString());
	}
}
