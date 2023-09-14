package ar.com.bank.test;

import java.util.ArrayList;
import java.util.List;

import ar.com.bank.model.Cliente;
import ar.com.bank.model.Cuenta;
import ar.com.bank.model.CuentaCorriente;

public class TestArrayList {
	
	public static void main(String[] args) {
		
		// <> Forzando a que acepte solo un tipo de objeto
//		List<Cliente> listaClientes = new LinkedList<>();
		
		List<Cuenta> lista = new ArrayList<>();
		
		Cuenta cc = new CuentaCorriente(11, 22);
		Cuenta cc2 = new CuentaCorriente(13, 42);
		Cuenta cc3 = new CuentaCorriente(11, 22);
		
		lista.add(cc);
		lista.add(cc2);
		lista.add(cc3);
		
//		Cliente cliente = new Cliente();
//		lista.add(cliente);
		
		Cuenta obtenerCuenta = (Cuenta) lista.get(0);
		System.out.println(obtenerCuenta);
		
		for(int i = 0; i < lista.size(); i++) {	// .size retorna la cant de parametros del array
			System.out.println(lista.get(i));	// es decir los espacios que ya estan llenos
		}
		
		// Por cada cuenta : lista
		for(Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		boolean contiene = lista.contains(cc3);

		if(contiene) {	
			System.out.println("Si");	// Por referencia
		}
		
		if(cc.esIgual(cc3)) {
			System.out.println("Si son iguales");	// Por valores
		}
	}
}

