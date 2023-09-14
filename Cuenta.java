
package ar.com.bank.model;
/**
 * Cuenta va a crear nuevas instancias de CuentaCorriente
 * 
 * @version 1.0
 * @author pontnaugonzalo
 * 
*/

public abstract class Cuenta implements Comparable<Cuenta> {  // entidad cuenta : Es un ej de CuentaDeBanco 
    
    protected double saldo;  //protected permite acceder desde clases hijas
    private int agencia = 1;  //private es para que nadie puede acceder a ellos
    private int numero;
    public Cliente titular = new Cliente();

    private static int total;

    /**
     * Instancia una nueva cuenta sin parametros
     */
    public Cuenta() {

    }

    /**
     * Instancia una cuenta usando agencia y numero
     * @param agencia
     * @param numero
     */
    public Cuenta (int agencia , int numero) {
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estoy creando una cuenta " + numero);

        Cuenta.total ++;
    }

    public abstract void deposita(double valor);	
    
   
    
    /**
     * La función "retirar" comprueba si el saldo actual es suficiente para retirar una cantidad
     * determinada y actualiza el saldo en consecuencia.
     * 
     * @param valor El parámetro "valor" representa la cantidad de dinero que el usuario quiere retirar
     * de su cuenta.
     * @return El método devuelve un valor booleano. Devuelve verdadero si el retiro es exitoso (si el
     * saldo de la cuenta es mayor o igual al monto del retiro), y falso en caso contrario.
     */
    public boolean retirar(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;    //this.saldo -= valor
            return true;
        }           
        return false;
    }

    /**
     * La función "saca" resta un valor dado del saldo actual, pero lanza una excepción personalizada
     * si el saldo es insuficiente.
     * @param valor El parámetro "valor" representa la cantidad de dinero que se retira de una cuenta.
     * @throws SaldoInsuficienteException
     */
    public void saca(double valor) throws SaldoInsuficienteException{
        if (this.saldo < valor) {   
            throw new SaldoInsuficienteException("No tienes saldo");
        }
        this.saldo -= valor;
    } // Pueden haber varios problemas al tratar de sacar dinero

    public boolean transfiere(double valor, Cuenta cuenta) {
        if (this.saldo >= valor) {
            try {
                this.saca(valor);
            } catch (SaldoInsuficienteException e) {
                e.printStackTrace();
            }
            this.deposita(valor);
            return true;
        } else { return false;
        }
    }

    public double getSaldo() {  //por convincion se pone "get" en vez de "obtener"
        return this.saldo;
    }

    public void setAgencia (int agencia) {  
        if (agencia > 0) {
            this.agencia = agencia;
        } else {
            System.out.println("No estan permitidos los valores negativos");
        }
    }
    public int getAgencia() {
        return agencia;
    }

    public void getTitular(Cliente titular) {
        this.titular = titular;   
    }
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }  
    public static int getTotal() { //static es para que ahora el metodo getTotal es 
        return Cuenta.total;       // de la clase (Cuenta cuenta =) y no de la instancia (new Cuenta();)
    }
    public int getNumero() {
        return numero;
    }

    
    public String toString() {
    	String cuenta = "Numero: " + this.numero + ", Agencia:" + this.agencia 
    			+ ", Titular: " + this.titular.getNombre();
    	return cuenta;
    }
    
    public boolean esIgual (Cuenta cuenta) {
    	return this.agencia == cuenta.getAgencia() && 
    			this.numero == cuenta.getNumero();
    }

	@Override
    public boolean equals (Object obj) {
    	// Por referencia 
    	Cuenta cuenta = (Cuenta) obj;
    	return this.agencia == cuenta.getAgencia() && 
    			this.numero == cuenta.getNumero();
    }
	@Override
		public int compareTo(Cuenta o) {
		
			// Orden natural: Numero Agencia
			// return Integer.compare(this.agencia, o.getAgencia());
		
			// Orden natural: Saldo
			return Double.compare(this.getSaldo(), o.getSaldo());
		}
}
