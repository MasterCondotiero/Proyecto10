package com.Alvarocampos.Proyecto10.Ejercicio06;

public enum Formato{
    CD, DVD, BLURAY, ARCHIVO;

    public static Formato comprobarFormato(String formato) {
        return Formato.valueOf(formato.trim().toUpperCase());
    }
}
