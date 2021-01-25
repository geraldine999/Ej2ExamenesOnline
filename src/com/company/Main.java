package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// 2 - exámenes online
        //Crear un sistema que permita asignar exámenes a alumnos.
        //Alumnos y docentes tienen nombre, dni y una lista de asignaturas.--
        //Cada alumno tiene un examen.--
        //Cada examen tiene una nota.--
        //Cada examen conoce al docente que va a corregirlo.--
        //Hay exámenes multiple choice y exámenes con--
        // preguntas a desarrollar. También existen exámenes mixtos.--
        //Los exámenes multiple-choice tienen una lista de consignas, --
        // cada consigna con opciones que pueden ser correctas o incorrectas.--
        //Los exámenes con preguntas a desarrollar tienen una lista de consignas.--
        // No se guarda la respuesta correcta, el docente debe corregirlas manualmente.

        List<Asignatura> asignaturasGeraldine = new ArrayList<>();
        asignaturasGeraldine.add(new Asignatura("Quimica"));
        asignaturasGeraldine.add(new Asignatura("Programacion"));

        List <Asignatura> asignaturasPablo = new ArrayList<>();
        asignaturasPablo.add(new Asignatura("Quimica"));
        asignaturasPablo.add(new Asignatura("Programacion"));


        //instancio un alumno y un docente
        Alumno  geraldine = new Alumno("Geraldine", "40396507", asignaturasGeraldine);
        Docente pablo = new Docente("Pablo", "33456784", asignaturasPablo);

        //creo un examen mixto
        List <String> listaDeOpcionesConsigna1 = new ArrayList<>();
        listaDeOpcionesConsigna1.add(0, "A) algo");
        listaDeOpcionesConsigna1.add(1, "B) otro algo");
        listaDeOpcionesConsigna1.add(2,"C) otro otro algo");

        List <String> listaVacia = new ArrayList<>();

        List <String> listaDeOpcionesConsigna3 = new ArrayList<>();
        listaDeOpcionesConsigna3.add("Oslo");
        listaDeOpcionesConsigna3.add("Paris");
        listaDeOpcionesConsigna3.add("Asuncion");


        List <Consigna> listaDeConsignas= new ArrayList<>();
        listaDeConsignas.add(new Consigna("Elegir la opcion correcta", listaDeOpcionesConsigna1));
        listaDeConsignas.add(new Consigna("Esta es una consigna a desarrollar", listaVacia));
        listaDeConsignas.add(new Consigna("Cual es la capital de Noruega?", listaDeOpcionesConsigna3));

        Examen examenFinal =  new Examen("Examen Final", pablo, listaDeConsignas, "mixto");

        //veo como quedo el examen creado

        examenFinal.verExamen();

        //pablo le asigna el examenFinal a geraldine
        pablo.asignarExamen(examenFinal, geraldine);

        //me fijo si se asigno el examen a geraldine

        System.out.println("Se le asigno el "+ geraldine.getExamen().getNombre() + " a Geraldine");

        //pablo corrige el examen
        pablo.corregirExamen(examenFinal, 9.0);

        //veo si se cambio la nota
        System.out.println("La nota de Geraldine es de " + examenFinal.getNota());


    }
}
