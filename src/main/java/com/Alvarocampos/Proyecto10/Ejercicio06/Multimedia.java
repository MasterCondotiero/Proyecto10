package com.Alvarocampos.Proyecto10.Ejercicio06;

public class Multimedia {
    protected Formato formato;
    protected String titulo;
    protected String autor;
    protected int anyoPublicacion;

    protected  Multimedia (String titulo, String autor, Formato formato, int anyoPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.anyoPublicacion = anyoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public Formato getFormato() {
        return formato;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnyoPublicacion() {
        return anyoPublicacion;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Autor: " + autor + ", Formato: " + formato + ", Año: " + anyoPublicacion;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Multimedia that = (Multimedia) obj;
        return titulo.equals(that.titulo) && autor.equals(that.autor);
    }
}
