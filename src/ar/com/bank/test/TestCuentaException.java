package ar.com.bank.test;
import ar.com.bank.model.Cuenta;
import ar.com.bank.model.CuentaAhorros;
import ar.com.bank.model.SaldoInsuficienteException;

public class TestCuentaException {
    public static void main(String[] args) /*throws SaldoInsuficienteException*/ {  //mala praxis 
        Cuenta cuenta = new CuentaAhorros (123, 456);
        cuenta.deposita(200);
        try {
            cuenta.saca(200);
            cuenta.saca(100);
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        }
    }
}
