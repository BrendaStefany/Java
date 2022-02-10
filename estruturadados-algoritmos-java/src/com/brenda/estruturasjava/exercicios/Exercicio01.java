package com.brenda.estruturasjava.exercicios;

import com.brenda.estruturasjava.Lista;

public class Exercicio01 {
	public static void main(String[] args) {
		Lista<String> letters = new Lista<String>(3);
		
		
		letters.adiciona("A");
		letters.adiciona("B");
		letters.adiciona("C");
		letters.adiciona("D");
		letters.adiciona("E");
		
		System.out.println(letters.contem("A"));
		
	}

}