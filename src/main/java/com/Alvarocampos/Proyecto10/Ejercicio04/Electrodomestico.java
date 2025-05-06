package com.Alvarocampos.Proyecto10.Ejercicio04;

public class Electrodomestico {
    protected double precioBase;
    protected Color color;
    protected ConsumoEnergetico consumoEnergetico;
    protected double peso;

    //Constantes
    protected static final double PRECIO_DEF = 100;
    protected static final double PESO_DEF = 5;
    protected static final Color COLOR_DEF = Color.BLANCO;
    protected static final ConsumoEnergetico CONSUMO_DEF = ConsumoEnergetico.F;

    //Constructores
    public Electrodomestico() {
        this(PRECIO_DEF, PESO_DEF, COLOR_DEF, CONSUMO_DEF);
    }

    public Electrodomestico(double precioBase, double peso) {
        this(precioBase, peso, COLOR_DEF, CONSUMO_DEF);
    }

    public Electrodomestico(double precioBase, double peso, Color color, ConsumoEnergetico consumoEnergetico) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
    }

    //Metodos
    public double precioFinal() {
        double precioFinal = precioBase + consumoEnergetico.getPrecioExtra();

        if (peso < 20) {
            precioFinal += 10;
        } else if (peso < 50) {
            precioFinal += 50;
        } else if (peso < 80) {
            precioFinal += 80;
        } else {
            precioFinal += 100;
        }

        return precioFinal;
    }

    //Get y Set
    public double getPrecioBase() { return precioBase; }
    public Color getColor() { return color; }
    public ConsumoEnergetico getConsumoEnergetico() { return consumoEnergetico; }
    public double getPeso() { return peso; }

}
