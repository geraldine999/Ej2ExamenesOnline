package com.company;

import java.util.List;

public class Consigna {
    private String enunciado;
    private  List <String> opciones;

    public Consigna(String enunciado, List<String> opciones) {
        this.enunciado = enunciado;
        this.opciones = opciones;
    }

    // si la consigna es a desarrollar entonces la lista de opciones queda vacia.


    public String getEnunciado() {
        return enunciado;
    }

    public List<String> getOpciones() {
        return opciones;
    }
}
