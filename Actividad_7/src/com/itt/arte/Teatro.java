package com.itt.arte;

public class Teatro extends Local implements Sala {

    private Obra obra;
    private double precio;
    private Espectador [][] localidades;

    public Teatro() {
    }

    public Teatro(Obra obra, double precio) {
        this.obra = obra;
        this.precio = precio;
        this.localidades = new Espectador [5][10];
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Espectador[][] getLocalidades() {
        return localidades;
    }

    public void setLocalidades(Espectador[][] localidades) {
        this.localidades = localidades;
    }

    

    
    
    
}