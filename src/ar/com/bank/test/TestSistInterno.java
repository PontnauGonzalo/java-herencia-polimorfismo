package ar.com.bank.test;
import ar.com.bank.model.Administrador;
import ar.com.bank.model.Gerente;
import ar.com.bank.model.SistemaInterno;

public class TestSistInterno {
    public static void main(String[] args) {

        SistemaInterno sistema = new SistemaInterno();
        Gerente gerente1 = new Gerente();
        Administrador admin = new Administrador();

        sistema.autentica(gerente1);
        sistema.autentica(admin);
    }
}
