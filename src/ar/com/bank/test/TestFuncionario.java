package ar.com.bank.test;
import ar.com.bank.model.Contador;
import ar.com.bank.model.Funcionario;

public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario martin = new Contador();  
        martin.setDocumento("Martin"); 
        martin.setDocumento("18230289");
        martin.setSalario(2000);
        martin.setTipo(0);

        System.out.println(martin.getSalario());
        System.out.println(martin.getBonificacion());
    }
}
