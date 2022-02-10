package com.brenda.estruturasjava.exercicios;

import java.util.ArrayList;

public class Exercicio02 {
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		
		lista.add("A");
		lista.add("B");
		lista.add("C");
		
		System.out.println(lista.lastIndexOf("B"));
		
	}

}