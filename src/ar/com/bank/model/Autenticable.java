package ar.com.bank.model;

public /*abstract*/ interface Autenticable {    //toda interface es abstract, no hace falta ponerlo

    public void setClave(String clave);

    public boolean iniciarSesion(String clave);
}
