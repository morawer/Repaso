package com.itt.arte;

public class Teatro extends Local implements Sala {

    private Obra obra;
    private double precio;
    private Espectador[][] localidades;



    public Teatro() {
    }

    public Teatro(String domicilio, int metros, int accesos, Obra obra, double precio) {
        super(domicilio, metros, accesos);
        this.obra = obra;
        this.precio = precio;
        this.localidades = new Espectador[5][10];
    }

    public Teatro(Obra obra, double precio) {
        this.obra = obra;
        this.precio = precio;
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

    @Override
    public double calcularRecaudacion() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String cancelarLocalidad(int fila, int butaca) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String consultarLocalidad(int fila, int butaca) {

        return null;

    }

    @Override
    public String verLocalidades() {

        for (int i = 0; i < localidades.length; i++) {

            for (int j = 0; i < localidades[i].length; j++) {

                System.out.print(" F: " + i + " B: " + j + " " + localidades[i][j]);
            }

        }
        return null;

    }

    @Override
    public String verLocalidadesOcupadas() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String verderLocalidad(int fila, int butaca, Espectador e) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String verProgramacion() {

        return obra.toString();
    }

   

}