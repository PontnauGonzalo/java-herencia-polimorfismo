package ar.com.bank.model;

public class GuardaReferencias {
	
	// Crear un obj para guardar muchas cuentas
	// Permitirnos agregar cuentas con un metodo
	// guardaCuentas.adiciona(cuentas);
	// Obtener, renover, etc.
	
	Object[] referencia = new Object[10];
	int indice = 0;
	
	//				[  X |   |   |   | .. |  ]
	public void adicionar(Object cc) {
		referencia[indice] = cc;
		indice++;
	}

	public Object obtener(int indice) {
		return referencia[indice];
	}
}