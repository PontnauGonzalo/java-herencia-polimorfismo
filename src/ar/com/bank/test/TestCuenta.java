package ar.com.bank.test;
import ar.com.bank.model.CuentaAhorros;
import ar.com.bank.model.CuentaCorriente;

public class TestCuenta {
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(1,1);
        CuentaAhorros ca = new CuentaAhorros(2, 3);
        cc.deposita(2000);
        cc.transfiere(1000, ca);

        System.out.println(cc.getSaldo());
        System.out.println(ca.getSaldo());
    }
}