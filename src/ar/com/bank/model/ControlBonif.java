package ar.com.bank.model;

public class ControlBonif {
    
    private double suma;

    /*public double registrarSalario(Funcionario funcionario) {   //FUNCIONARIO

        this.suma = funcionario.getBonificacion() + this.suma;
        System.out.println("Total en bonificaciones: " + this.suma);       

        return this.suma;
    }
    public double registrarSalario(Gerente gerente) {       //GERENTE

        this.suma = gerente.getBonificacion() + this.suma;
        System.out.println("Total en bonificacioens: " + this.suma);       

        return this.suma;
    }
    public double registrarSalario(Contador contador) {     //CONTADOR

        this.suma = contador.getBonificacion() + this.suma;
        System.out.println("Total en bonificacioens: " + this.suma);       

        return this.suma;
    }*/

    
    // EL POLIMORFISMO SIGNIFICA QUE PODEMOS HACER LO MISMO SOLO USANDO EL GENERICO(funcionario):
    public double registrarSalario(Funcionario funcionario) { 

        this.suma = funcionario.getBonificacion() + this.suma;
        System.out.println("Total en bonificaciones: " + this.suma);       

        return this.suma;
    }

}
