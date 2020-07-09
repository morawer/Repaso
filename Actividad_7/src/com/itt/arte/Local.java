package com.itt.arte;

public class Local {

    private String domicilio;
    private int metros;
    private int accesos;

    public Local() {
    }
    

    public Local(String domicilio, int metros, int accesos) {
        this.domicilio = domicilio;
        this.metros = metros;
        this.accesos = accesos;
    }

    public String getDomicilio() {
        
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }

    public int getAccesos() {
        return accesos;
    }

    public void setAccesos(int accesos) {
        this.accesos = accesos;
    }

    @Override
    public String toString() {
        return "local [accesos=" + accesos + ", domicilio=" + domicilio + ", metros=" + metros + "]";
    }

    
    
    
}