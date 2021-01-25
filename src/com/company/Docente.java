package com.company;

import java.util.List;

public class Docente extends Persona {
    public Docente(String nombre, String dni, List<Asignatura> asignaturas) {
        super(nombre, dni, asignaturas);
    }

    public void asignarExamen(Examen examen, Alumno alumno){
        alumno.setExamen(examen);
    }

    public void corregirExamen(Examen examen, Double nota){
        examen.setNota(nota);
    }
}
