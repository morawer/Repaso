package com.itt.fiestas;

public class fiesta {

    private String tipo;
    private String fechaHora;
    private String direccion;
    private int bebidas;
    private int bocadillos;
    private int invitados = 0;
    public static int acum = 0;

    public fiesta(String tipo, String fechaHora, String direccion, int bebidas, int bocadillos) {
        this.tipo = tipo;
        this.fechaHora = fechaHora;
        this.direccion = direccion;
        this.bebidas = bebidas;
        this.bocadillos = bocadillos;
        acum++;
    }

    public static String acumulado() {
        return "El numero de fiestas creadas es de: " + fiesta.acum;
    }
   

    public fiesta() {
    }

    public String getTipo() {
        return tipo;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getBebidas() {
        return bebidas;
    }

    public int getBocadillos() {
        return bocadillos;
    }

    public int getInvitados() {
        return invitados;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setBebidas(int bebidas) {
        this.bebidas = bebidas;
    }

    public void setBocadillos(int bocadillos) {
        this.bocadillos = bocadillos;
    }

    public void setInvitados(int invitados) {
        this.invitados = invitados;
    }
    
    public void invitar() {
        this.invitados++;
    }

    public void cancelarInvitacion() {
        this.invitados--;
    }

    public int precioFiesta() {
        return ((this.invitados * 5) + (this.bebidas * 2) + (this.bocadillos * 3));
    }

    @Override
    public String toString() {
        return "fiesta [bebidas=" + bebidas + ", bocadillos=" + bocadillos + ", direccion=" + direccion + ", fechaHora="
                + fechaHora + ", invitados=" + invitados + ", tipo=" + tipo + "]";
    }
}