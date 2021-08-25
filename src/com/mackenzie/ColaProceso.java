package com.mackenzie;

public interface ColaProceso {

    public abstract void encolar(Trabajo t);
    public abstract void eliminar();
    public abstract Trabajo obtener();

}
