package ar.com.bank.model;

public class SistemaInterno {

    private String clave = "Hola1234";

    public boolean autentica (Autenticable gerente) {
        
        boolean puedeInisiarSesion = gerente.iniciarSesion(clave);
        
        if(puedeInisiarSesion) {
            System.out.println("Login exitoso");
            return true;
        } else {
            System.out.println("Error en login");
            return false;
        }
    }
}
