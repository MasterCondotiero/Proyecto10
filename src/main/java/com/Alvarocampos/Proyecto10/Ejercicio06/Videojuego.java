package com.Alvarocampos.Proyecto10.Ejercicio06;

public class Videojuego extends Multimedia {
    private final String plataforma;

    public Videojuego(String titulo, String autor, Formato formato, int anyoPublicacion, String plataforma) {
        super(titulo, autor, formato, anyoPublicacion);
        this.plataforma = plataforma;
    }

    public String getPlataforma() { return plataforma; }

    @Override
    public String toString() {
        return super.toString() + ", Plataforma: " + plataforma;
    }
}
