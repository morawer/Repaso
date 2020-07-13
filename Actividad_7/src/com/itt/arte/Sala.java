package com.itt.arte;

interface Sala {



    abstract String verProgramacion();

    abstract String verLocalidades();

    abstract String verLocalidadesOcupadas();

    abstract String venderLocalidad(int fila, int butaca, Espectador e);

    abstract String cancelarLocalidad(int fila, int butaca);

    abstract String consultarLocalidad(int fila, int butaca);

    abstract double calcularRecaudacion();

    }