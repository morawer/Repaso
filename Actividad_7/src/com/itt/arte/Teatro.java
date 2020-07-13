package com.itt.arte;

public class Teatro extends Local implements Sala {

    private Obra obra;
    private double precio;
    private Espectador[][] localidades;

    public Teatro() {
    }

    public Teatro(final String domicilio, final int metros, final int accesos, final Obra obra, final double precio) {
        super(domicilio, metros, accesos);
        this.obra = obra;
        this.precio = precio;
        this.localidades = new Espectador[5][10];
    }

    public Teatro(final Obra obra, final double precio) {
        this.obra = obra;
        this.precio = precio;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(final Obra obra) {
        this.obra = obra;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(final double precio) {
        this.precio = precio;
    }

    public Espectador[][] getLocalidades() {
        return localidades;
    }

    public void setLocalidades(final Espectador[][] localidades) {
        this.localidades = localidades;
    }

    @Override
    public double calcularRecaudacion() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String cancelarLocalidad(final int fila, final int butaca) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String consultarLocalidad(final int fila, final int butaca) {

        return null;

    }

    @Override
    public String verLocalidades() {

        System.out.println();

        for (int i = 0; i < localidades.length; i++) {

            for (int j = 0; j < localidades[i].length; j++) {

                if (localidades[i][j] == null) {

                    System.out.print(" " + i + "." + j + " " + "Libre");
                } else {

                    System.out.print(" " + i + "." + j + " " + "Ocupado");

                }

            }

            System.out.println();

        }
        return null;

    }

    @Override
    public String verLocalidadesOcupadas() {

        System.out.println();

        for (int i = 0; i < localidades.length; i++) {

            for (int j = 0; j < localidades[i].length; j++) {

                if (localidades[i][j] != null) {

                    System.out.print(i + "." + j + " " + localidades[i][j].getNombre() + ", " + "tlf: "
                            + localidades[i][j].getTlf() + ", " + "tipo: " + rangoEdad(localidades[i][j].getEdad()));

                }

            }

            System.out.println();

        }

        return null;
    }

    public String rangoEdad(final int edad) {

        String rango = null;

        if (edad >= 0 && edad <= 12) {

            rango = "INFANTIL";

        } else if (edad >= 13 && edad <= 17) {

            rango = "MENOR";

        } else if (edad >= 18 && edad <= 64) {

            rango = "MAYOR";

        } else if (edad >= 65) {

            rango = "JUBILADO";
        }

        return rango;

    }

    @Override
    public String venderLocalidad(int fila, int butaca, Espectador e) {

        

        return null;
    }

    @Override
    public String verProgramacion() {

        return obra.toString();
    }

}