package com.company;

import java.util.List;

public abstract class Persona {
    String nombre;
    String dni;
    List<Asignatura> asignaturas;

    public Persona(String nombre, String dni, List<Asignatura> asignaturas) {
        this.nombre = nombre;
        this.dni = dni;
        this.asignaturas = asignaturas;
    }
}
