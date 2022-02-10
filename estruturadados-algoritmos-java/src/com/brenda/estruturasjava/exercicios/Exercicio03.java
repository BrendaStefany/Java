package com.brenda.estruturasjava.exercicios;

import com.brenda.estruturasjava.Lista;

public class Exercicio03 {
	public static void main(String[] args) {
		Lista<String> lista = new Lista<String>(5);
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		
		lista.remove("B");
		System.out.println(lista);
	}

}