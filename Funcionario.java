package ar.com.bank.model;

public abstract class Funcionario { //clase abstract = conceptual y no fisico
    
    private String nombre;
    private String documento;
    private double salario;
    private int tipo;

    public Funcionario() {
    //Constructuor -> metodo para asigar variables 
    } 

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return this.documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public double getSalario() {
        return this.salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getTipo() {
        return this.tipo;
    } 
    
    public abstract double getBonificacion();
    
    public void setTipo(int tipo) {
        this.tipo = tipo;
    } 
    public boolean iniciarSesion(String clave) { 
        return clave == "Hola1234";
    }
}