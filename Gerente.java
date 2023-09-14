package ar.com.bank.model;

public class Gerente extends Funcionario implements Autenticable {  // al extender cumple con todos los campos del 2do

    //Sobre-escritura del metodo (muy util)
    public double getBonificacion() {
        System.out.println("EJECUTANDO DESDE GERENTE");
        return 2000;
        // super = de la clase superior getSalario el cual es privada
    }

    @Override
    public void setClave(String clave) {
    }
}
