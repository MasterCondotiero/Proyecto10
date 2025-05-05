package com.Alvarocampos.Proyecto10.Ejercicio02;

import java.util.Arrays;
import java.util.List;

public class Ejercicio02 {
    public static void main(String[] args) {
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(2, 0);
        Punto p3 = new Punto(2, 2);
        Punto p4 = new Punto(0, 2);

        List<Punto> puntos = Arrays.asList(p1, p2, p3, p4);
        Poligono poligono = new Poligono(puntos);

        System.out.println("Polígono original:");
        System.out.println(poligono);
        System.out.println("Perímetro: " + poligono.perimetro());

        poligono.traslada(4, -3);

        System.out.println("\nPolígono trasladado:");
        System.out.println(poligono);
        System.out.println("Perímetro: " + poligono.perimetro());
    }
}
