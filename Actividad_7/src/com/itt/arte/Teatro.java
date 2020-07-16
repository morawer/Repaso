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

        System.out.println();

        double recaudacion = 0;

        for (int i = 0; i < localidades.length; i++) {

            for (int j = 0; j < localidades[i].length; j++) {

                if (localidades[i][j] != null) {

                    if (rangoEdad(localidades[i][j].getEdad()) == "INFANTIL") {

                        precio = 9 - (9 * 0.5);

                        recaudacion += precio;

                    } else if (rangoEdad(localidades[i][j].getEdad()) == "MENOR") {

                        precio = 9 - (9 * 0.2);
                        recaudacion += precio;

                    } else if (rangoEdad(localidades[i][j].getEdad()) == "MAYOR") {

                        precio = 9;
                        recaudacion += precio;

                    } else if (rangoEdad(localidades[i][j].getEdad()) == "JUBILADO") {

                        precio = 9 - (9 * 0.66);
                        recaudacion += precio;

                    }

                }

            }

        }

        System.out.println("La recaudacion es de: " + recaudacion + " euros.");

        return 0;
    }

    @Override
    public String cancelarLocalidad(int fila, int butaca) {

        if (localidades[fila][butaca] != null) {

            localidades[fila][butaca] = null;

            System.out.println("La reserva " + fila + "." + butaca + " ha sido cancelada.");

        } else {

            System.out.println("No puedes cancelar esta reserva puesto que la butaca no esta reservada.");

        }

        return null;

    }

    @Override
    public String consultarLocalidad(int fila, int butaca) {

        if (localidades[fila][butaca] != null) {

            if (rangoEdad(localidades[fila][butaca].getEdad()) == "INFANTIL") {

                precio = 9 - (9 * 0.5);

            } else if (rangoEdad(localidades[fila][butaca].getEdad()) == "MENOR") {

                precio = 9 - (9 * 0.2);

            } else if (rangoEdad(localidades[fila][butaca].getEdad()) == "MAYOR") {

                precio = 9;

            } else if (rangoEdad(localidades[fila][butaca].getEdad()) == "JUBILADO") {

                precio = 9 - (9 * 0.66);

            }

            System.out.println("La reserva esta a nombre de " + localidades[fila][butaca].getNombre() + " por "
                    + precio + " euros.");

        } else {

            System.out.println("Esta butaca no tiene reserva.");

        }

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

                    System.out.println(i + "." + j + " " + localidades[i][j].getNombre() + ", " + "tlf: "
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

        if (localidades[fila][butaca] == null) {

            if (rangoEdad(e.getEdad()) == "INFANTIL") {

                precio = 9 - (9 * 0.5);

            } else if (rangoEdad(e.getEdad()) == "MENOR") {

                precio = 9 - (9 * 0.2);

            } else if (rangoEdad(e.getEdad()) == "MAYOR") {

                precio = 9;

            } else if (rangoEdad(e.getEdad()) == "JUBILADO") {

                precio = 9 - (9 * 0.66);

            }

            localidades[fila][butaca] = e;

            System.out.println("La butaca ha sido reservada a " + localidades[fila][butaca].getNombre() + " por "
                    + precio + " euros.");

        } else {

            System.out.println("Butaca ocupada");

        }

        return null;
    }

    @Override
    public String verProgramacion() {

        return obra.toString();
    }

}