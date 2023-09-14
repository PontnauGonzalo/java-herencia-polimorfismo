package ar.com.bank.model;

public class CuentaCorriente extends Cuenta {
    
    public CuentaCorriente(int agencia, int numero) {
        super(agencia, numero);
    }

    //metodo nuevo que viene del padre
    @Override
    public void saca (double valor) throws SaldoInsuficienteException { // firma del metodo
        double comision = 0.2;
        super.saca(valor + comision);
    }

    @Override
    public void deposita(double valor) {
    }
}
  