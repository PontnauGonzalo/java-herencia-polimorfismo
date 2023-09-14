package ar.com.bank.test;
import ar.com.bank.model.Contador;
import ar.com.bank.model.ControlBonif;
import ar.com.bank.model.Funcionario;
import ar.com.bank.model.Gerente;

public class TestControlBonif {
    public static void main(String[] args) {

        Funcionario Juan =  new Contador(); //Funcionario es abstract => debemos poner cotador 
        Juan.setSalario(2000);      // la cual es una clase hija fisica
     
        Gerente Juana = new Gerente();
        Juana.setSalario(10000);

        Contador alexis = new Contador();
        alexis.setSalario(5000);

        ControlBonif controlBonificacion = new ControlBonif();

        controlBonificacion.registrarSalario(Juan);
        controlBonificacion.registrarSalario(Juana); 
        controlBonificacion.registrarSalario(alexis); 
    }
}
