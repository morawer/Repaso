package com.itt.arte;

public class Espectador {

    private String nombre;
    private String tlf;
    private int edad;

    public Espectador() {
    }

    public Espectador(String nombre, String tlf, int edad) {
        this.nombre = nombre;
        this.tlf = tlf;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre( String nombre) {
        this.nombre = nombre;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Espectador [edad=" + edad + ", nombre=" + nombre + ", tlf=" + tlf + "]";
    }

    public String rangoEdad(int edad) {

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

}