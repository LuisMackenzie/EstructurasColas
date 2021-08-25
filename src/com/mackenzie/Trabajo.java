package com.mackenzie;

public class Trabajo {

    private String titulo;
    private String autor;
    private boolean impreso;

    public Trabajo(String titulo, String autor, boolean impreso) {
        this.titulo = titulo;
        this.autor = autor;
        this.impreso = impreso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isImpreso() {
        return impreso;
    }

    public void setImpreso(boolean impreso) {
        this.impreso = impreso;
    }
}
