package ar.com.bank.model;

public class GuardaCuentas {

	// Crear un obj para guardar muchas cuentas
	// Permitirnos agregar cuentas con un metodo
	// guardaCuentas.adiciona(cuentas);
	// Obtener, renover, etc.
	
	Cuenta[] cuenta = new Cuenta[10];
	int indice = 0;

	//					[  X |   |   |   | .. |  ]
	public void adicionar(Cuenta cc) {
		cuenta[indice] = cc;
		indice++;
	}
	
	public Cuenta obtener(int indice) {
		return cuenta[indice];
	}
}
