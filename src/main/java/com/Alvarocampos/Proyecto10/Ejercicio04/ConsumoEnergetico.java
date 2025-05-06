package com.Alvarocampos.Proyecto10.Ejercicio04;

public enum ConsumoEnergetico {
    A(100), B(80), C(60), D(50), E(30), F(10);

    private final int precioExtra;

    ConsumoEnergetico(int precioExtra) {
        this.precioExtra = precioExtra;
    }

    public int getPrecioExtra() {
        return precioExtra;
    }

    public static ConsumoEnergetico comprobarConsumo(char letra) {
        try {
            return ConsumoEnergetico.valueOf(String.valueOf(letra).toUpperCase());
        } catch (IllegalArgumentException e) {
            return F;
        }
    }
}