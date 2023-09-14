package ar.com.bank.model;

public class CuentaAhorros extends Cuenta {     //CuentaAhorros es clase hija de Cuenta
    
    public CuentaAhorros(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        this.saldo = this.saldo + valor;   //se puede acceder a saldo ya es protected
    }
    
    @Override
    	public String toString() {
    		// TODO Auto-generated method stub
    		return super.toString();
    	}
}
