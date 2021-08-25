package com.mackenzie;

public class MiCola implements ColaProceso{

    private NodoProceso cabeza, ultimo;

    private class NodoProceso {
        public Trabajo trabajo;
        public NodoProceso siguiente;

        public NodoProceso(Trabajo trabajo) {
            this.trabajo = trabajo;
        }
    }


    @Override
    public void encolar(Trabajo t) {
        NodoProceso nuevoNodo = new NodoProceso(t);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            // ultimo = nuevoNodo;
        } else {
            ultimo.siguiente = nuevoNodo;
            // ultimo = nuevoNodo;
        }
        ultimo = nuevoNodo;
    }

    @Override
    public void eliminar() {
        if (cabeza != null) {
            NodoProceso eliminar = cabeza;
            cabeza = cabeza.siguiente;
            eliminar.siguiente = null;
            if (cabeza == null) {
                ultimo = null;
            }
        }
    }

    @Override
    public Trabajo obtener() {
        if (cabeza == null) {
            return null;
        } else {
            return cabeza.trabajo;
        }

    }
}
