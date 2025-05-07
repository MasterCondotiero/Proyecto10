package com.Alvarocampos.Proyecto10.Ejercicio06;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler {
    private Socio socio;
    private Multimedia item;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private boolean devuelto;

    public Alquiler(Socio socio, Multimedia item) {
        this.socio = socio;
        this.item = item;
        this.fechaAlquiler = LocalDate.now();
        this.devuelto = false;
    }

    public void devolver() {
        this.fechaDevolucion = LocalDate.now();
        this.devuelto = true;
        long diasAlquilado = ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion);

        double precio = 4.0;
        if ((item instanceof Pelicula && item.getAnyoPublicacion() < 2012) || (item instanceof Videojuego && item.getAnyoPublicacion() < 2010)) {
            precio -= 1.0;
        }

        if (diasAlquilado > 3) {
            double recargo = (diasAlquilado - 3) * 2.0;
            socio.anyadirRecargo(recargo);
        }
    }

    public boolean estaDentroDelPlazo() {
        return ChronoUnit.DAYS.between(fechaAlquiler, LocalDate.now()) <= 3;
    }

    public Socio getSocio() { return socio; }
    public Multimedia getItem() { return item; }
    public LocalDate getFechaAlquiler() { return fechaAlquiler; }
    public LocalDate getFechaDevolucion() { return fechaDevolucion; }
    public boolean isDevuelto() { return devuelto; }
}
