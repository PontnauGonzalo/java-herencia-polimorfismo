package ar.com.bank.test;

public class TestMain {
	
	public static void main(String[] args) {	// [] -> array
		
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		
		int edad = 20;
		int edad2 = 15;
		int edad3 = 67;
		
		// indices			  0   1   2    3   4
		//          		[ 0 | 0 | 30 | 0 | 0 ]
		
		int[] edades = new int[5];
		edades[2] = 30;
		
		System.out.println(edades[2]);
		System.out.println(edades[0]);
		
		int sizeArray = edades.length;
		System.out.println(sizeArray);
		
		for (int i = 0; i < edades.length; i++) {
			System.out.println(edades[i]);
		}

	}
}
