package com.Alvarocampos.Proyecto10.Ejercicio06;

import java.time.LocalDate;
import java.time.Period;

public class Socio {
    private final String nif;
    private final String nombre;
    private final LocalDate fechaNacimiento;
    private String poblacion;
    private double recargoPendiente;
    private final int edadAceptada = 18;

    public Socio(String nif, String nombre, LocalDate fechaNacimiento, String poblacion) {
        this.nif = nif;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.poblacion = poblacion;
        this.recargoPendiente = 0;

        if (!esMayorDeEdad()) {
            throw new IllegalArgumentException("El socio tiene que ser mayor de edad.");
        }
    }

    public boolean esMayorDeEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears() >= edadAceptada;
    }

    public String getNif() { return nif; }
    public String getNombre() { return nombre; }
    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public String getPoblacion() { return poblacion; }
    public double getRecargoPendiente() { return recargoPendiente; }

    public void anyadirRecargo(double cantidad) {
        recargoPendiente += cantidad;
    }

    public void pagarRecargo() {
        recargoPendiente = 0;
    }

    public boolean puedeAlquilar() {
        return recargoPendiente == 0;
    }

    @Override
    public String toString() {
        return "NIF: " + nif + ", Nombre: " + nombre + ", Fecha de nacimiento: " + fechaNacimiento + ", Poblacion: " + poblacion + ", Recargo pendiente: " + recargoPendiente + "€";
    }
}