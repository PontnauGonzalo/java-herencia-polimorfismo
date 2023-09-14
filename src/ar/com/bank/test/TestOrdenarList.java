package ar.com.bank.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ar.com.bank.model.Cuenta;
import ar.com.bank.model.CuentaAhorros;
import ar.com.bank.model.CuentaCorriente;
import ar.com.bank.model.Cliente; 

public class TestOrdenarList {
	public static void main(String[] args) {
		
		Cuenta cc1 = new CuentaCorriente(62, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNombre("Diego");
		cc1.setTitular(clienteCC1);
		cc1.deposita(333.0);

		Cuenta cc2 = new CuentaAhorros(32, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNombre("Renato");
		cc2.setTitular(clienteCC2);
		cc2.deposita(222.0);
		
		Cuenta cc3 = new CuentaCorriente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNombre("Liam");
		cc3.setTitular(clienteCC3);
		cc3.deposita(111.0);

		Cuenta cc4 = new CuentaAhorros(2, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNombre("Noel");
		cc4.setTitular(clienteCC4);
		cc4.deposita(222.0); 

//		Cuenta cc1 = new CuentaCorriente(22, 33);
//		cc1.deposita(333.0);
//		
//		Cuenta cc2 = new CuentaAhorros(22, 44);
//		cc2.deposita(222.0);
//		
//		Cuenta cc3 = new CuentaCorriente(22, 11);
//		cc3.deposita(111.0);
//		
//		Cuenta cc4 = new CuentaAhorros(22, 22);
//		cc4.deposita(222.0);
//				
		List<Cuenta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4); 

		System.out.println("Antes de ordenar");
		for(Cuenta cuenta : lista) { 
			System.out.println(cuenta);
		}
		
		// Ordenar las cuentas
		//				Cualquier clase hija de cuenta
		// Comparator <? extends Cuenta> 
//		Comparator<Cuenta> comparator = new OrdenadorPorNumeroCuenta();
//		lista.sort(comparator);
		
		lista.sort(new Comparator <Cuenta>() {

			@Override
			public int compare(Cuenta o1, Cuenta o2) {
				return Integer.compare(o1.getNumero(), o2.getNumero());
			}});
		
		System.out.println("Despues de ordenar");
		for(Cuenta cuenta : lista) { 
			System.out.println(cuenta);
		}
		
//		Comparator<Cuenta> comparatorNombreTitular = new OrdenadorPorNombreTitular();
//		lista.sort(new OrdenadorPorNombreTitular());
		
		// Forma antigua de ordenar
		Collections.sort(lista, new Comparator<Cuenta>() { // implem de la interfaz

			@Override
			public int compare(Cuenta o1, Cuenta o2) {
				return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
			}}); 
		
		System.out.println("Despues de ordenar por nombre titular");
		for(Cuenta cuenta : lista) { 
			System.out.println(cuenta);
		}
		
		Collections.sort(lista);

		System.out.println("Despues de ordenar por orden natural");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
	}
}

class OrdenadorPorNumeroCuenta implements Comparator<Cuenta> {

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		// Forma basica
//		if (o1.getNumero() == o2.getNumero()) {
//			return 0;
//		} else if (o1.getNumero() > o2.getNumero()) {
//			return 1;
//		} else {
//			return -1;
//		}
		
		// Forma intermedia
//		return o1.getNumero() - o2.getNumero();
		
		// Forma Wrapper
		return Integer.compare(o1.getNumero(), o2.getNumero());
	}
}


class OrdenadorPorNombreTitular implements Comparator<Cuenta> {

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
	}	
}



