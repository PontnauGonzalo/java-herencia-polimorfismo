package ar.com.bank.test;
import java.util.ArrayList;
import java.util.List;
	
public class TestRepasoArray {
	public static void main(String[] args) {
		

		int[] numeros = new int[10];

		int numero = 40;
		// WRAPPER
//		Integer numeroObjeto = new Integer(40);
		Integer numeroObjeto = Integer.valueOf(40);
		
		List<Integer> Lista = new ArrayList<Integer>();
		
//		primitivo != object

		Lista.add(numero); // hutoboxing
		Lista.add(new Integer(40));
		Lista.add(numeroObjeto);
		
//		unboxing
//		int valorPrimitivo = numeroObjeto;
		int valorPrimitivo = numeroObjeto.intValue();
		
		byte byteInteger = numeroObjeto.byteValue();
		double doubleValue = numeroObjeto.doubleValue();
		float floatValue = numeroObjeto.floatValue();
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
	}
}





