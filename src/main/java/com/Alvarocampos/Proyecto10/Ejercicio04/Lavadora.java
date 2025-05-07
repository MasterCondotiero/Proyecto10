package com.Alvarocampos.Proyecto10.Ejercicio04;

public class Lavadora extends Electrodomestico {
    private int carga;
    private static final int CARGA_DEF = 5;

    public Lavadora() {
        this(PRECIO_DEF, PESO_DEF, COLOR_DEF, CONSUMO_DEF, CARGA_DEF);
    }

    public Lavadora(double precioBase, double peso) {
        this(precioBase, peso, COLOR_DEF, CONSUMO_DEF, CARGA_DEF);
    }

    public Lavadora(double precioBase, double peso, Color color, ConsumoEnergetico consumoEnergetico, int carga) {
        super(precioBase, peso, color, consumoEnergetico);
        this.carga = carga;
    }
    //Get
    public int getCarga() { return carga; }

    @Override
    public double precioFinal() {
        double precio = super.precioFinal();
        if (carga > 30) {
            precio += 50;
        }
        return precio;
    }
}