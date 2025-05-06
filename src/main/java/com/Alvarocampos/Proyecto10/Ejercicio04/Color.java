package com.Alvarocampos.Proyecto10.Ejercicio04;

public enum Color {
    BLANCO, NEGRO, ROJO, AZUL, GRIS;

    public static Color comprobarColor(String color) {
        try {
            return Color.valueOf(color.trim().toUpperCase());
        } catch (IllegalArgumentException e) {
            return BLANCO;
        }
    }
}