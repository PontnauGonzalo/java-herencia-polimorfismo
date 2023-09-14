package ar.com.bank.test;
import ar.com.bank.model.Funcionario;
import ar.com.bank.model.Gerente;

public class TestRefernecias {
    public static void main(String[] args) {
        
        //Elemnto mas generico puede ser adaptado al elemento mas especifico
        Funcionario funcionario = new Gerente();
        funcionario.setNombre("Martin");

        Gerente gerente =  new Gerente();
        gerente.setNombre("Martina");

        funcionario.setSalario(2000);
        gerente.setSalario(10000);
    
        funcionario.iniciarSesion("Hola1234");
    }
}
