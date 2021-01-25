package com.company;

import java.util.List;

public class Examen {
    private String nombre; // lo agregue para confirmar la asignacion de examen
    private Double nota;
    private Docente docente;
    private List<Consigna> consignas;
    private String tipoDeExamen; //desarrollar, multiple choice, mixto

    public Examen(String nombre, Docente docente, List<Consigna> consignas, String tipoDeExamen) {
        this.nombre = nombre;
        this.docente = docente;
        this.consignas = consignas;
        this.tipoDeExamen = tipoDeExamen;
    }

    public String getNombre() {
        return nombre;
    }

    //un alumno o docente puede consultar la nota
    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }


    //se puede consultar el docente que va a corregir el examen
    public Docente getDocente() {
        return docente;
    }

    public String verExamen() {
        for (int i = 0; i < consignas.size(); i++) {
            System.out.println(consignas.get(i).getEnunciado());
            System.out.println(consignas.get(i).getOpciones());
            }
        return null;
    }
}