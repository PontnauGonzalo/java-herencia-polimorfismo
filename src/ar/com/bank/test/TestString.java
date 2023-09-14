package ar.com.bank.test;

import ar.com.bank.model.CuentaAhorros;

public class TestString {
	
	public static void main(String[] args) {
		
		String nombre = "Samarrita";
		// No utilizada en el mundo real
		// String nombre2 = new String("samarrita");
		
		System.out.println("Antes del metodo: " + nombre);
		
		// nombre.replace("S", "s");
		nombre = nombre.replace("S", "s");
		// nombre.concat(" es mi apodo");
		nombre = nombre.concat(" es mi apodo");
		nombre = nombre.toUpperCase(); // mayuscula
		nombre = nombre.toLowerCase(); // minuscula
		  // 01234
		char letra = nombre.charAt(3); // no imprime nada
		int indice = nombre.indexOf("e");
		
//		System.out.println("Despues del metodo: " + nombre);
//		System.out.println("Despues del metodo: " + letra);
//		System.out.println("Indice encontrado: " + indice); 
		
		Object cuenta = new CuentaAhorros(344, 544);
		
		printLine(nombre);
		printLine(letra);
		printLine(indice);
		printLine(new CuentaAhorros(200, 300));
	}
	
	public static void printLine (Object valor) {
		System.out.println(valor.toString());
	}
//	public static void printLine (String valor) {
//		System.out.println(valor);
//	}
//	public static void printLine (char valor) {
//		System.out.println(valor);
//	}
}
