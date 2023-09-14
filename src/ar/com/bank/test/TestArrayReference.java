package ar.com.bank.test;
import ar.com.bank.model.Cliente;
import ar.com.bank.model.Cuenta;
import ar.com.bank.model.CuentaCorriente;
import ar.com.bank.model.CuentaAhorros;

public class TestArrayReference {
	
	public static void main (String[] args) {
		
		Object[] referencias = new Object[5];

		CuentaCorriente cc = new CuentaCorriente(23, 44);
	
		//			[ new | cc | null | null | null ]
		
		referencias[1] = cc;
	
		Cliente cliente = new Cliente();
		referencias[4] = cliente;
		
		//		Cast = Este obj es un cliente
		Cliente obtenido = (Cliente) referencias[4];
		
		CuentaAhorros ca = new CuentaAhorros(44, 45);
		referencias[3] = ca;
	
		referencias[0] = new CuentaCorriente(11, 99);
		System.out.println(referencias[0]);
		
		// Cast
		CuentaCorriente cuenta = (CuentaCorriente) referencias[1];
		System.out.println(cuenta);
		
		for (int i = 0; i < referencias.length; i++) {
			System.out.println(referencias[i]);
		}
	}
}
