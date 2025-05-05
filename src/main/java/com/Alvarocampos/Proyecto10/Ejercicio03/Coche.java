package com.Alvarocampos.Proyecto10.Ejercicio03;

public class Coche {
    private String matricula;
    private int velocidadActual;
    private int marchaActual;
    protected int[] marchasMaximas; // velocidad máxima por marcha

    public Coche(String matricula, int[] marchasMaximas) {
        this.matricula = matricula;
        this.velocidadActual = 0;
        this.marchaActual = 0;
        this.marchasMaximas = marchasMaximas;
    }

    // Getters y setters
    public String getMatricula() {
        return matricula;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public int getMarchaActual() {
        return marchaActual;
    }

    public void setVelocidadActual(int velocidad) {
        this.velocidadActual = Math.max(0, velocidad);
    }

    public void setMarchaActual(int marcha) {
        if (marcha >= 0 && marcha < marchasMaximas.length) {
            this.marchaActual = marcha;
        }
    }

    public int[] getMarchasMaximas() {
        return marchasMaximas;
    }

    // Acelerar
    public void acelerar(int incremento) {
        if (marchaActual > 0) {
            int max = marchasMaximas[marchaActual - 1];
            velocidadActual = Math.min(velocidadActual + incremento, max);
        }
    }

    // Frenar
    public void frenar(int decremento) {
        velocidadActual = Math.max(0, velocidadActual - decremento);
    }

    // cambiarMarcha: solo accesible por clases del mismo paquete
    void cambiarMarcha(int nuevaMarcha) {
        if (nuevaMarcha >= 1 && nuevaMarcha <= marchasMaximas.length) {
            marchaActual = nuevaMarcha;
        }
    }

    // toString
    @Override
    public String toString() {
        return "Matrícula: " + matricula +
                " | Velocidad: " + velocidadActual + " km/h" +
                " | Marcha: " + marchaActual;
    }
}
