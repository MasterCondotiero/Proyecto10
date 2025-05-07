package com.Alvarocampos.Proyecto10.Ejercicio04;

public class Televisor extends Electrodomestico {
    private int resolucion;
    private boolean smartTV;

    private static final int RESOLUCION_DEF = 20;
    private static final boolean SMART_DEF = false;

    //Constructor
    public Televisor() {
        this(PRECIO_DEF, PESO_DEF, COLOR_DEF, CONSUMO_DEF, RESOLUCION_DEF, SMART_DEF);
    }

    public Televisor(double precioBase, double peso) {
        this(precioBase, peso, COLOR_DEF, CONSUMO_DEF, RESOLUCION_DEF, SMART_DEF);
    }

    public Televisor(double precioBase, double peso, Color color, ConsumoEnergetico consumoEnergetico, int resolucion, boolean smartTV) {
        super(precioBase, peso, color, consumoEnergetico);
        this.resolucion = resolucion;
        this.smartTV = smartTV;
    }
    //Get
    public int getResolucion() { return resolucion; }
    public boolean esSmartTV() { return smartTV; }

    @Override
    public double precioFinal() {
        double precio = super.precioFinal();
        if (resolucion > 40) {
            precio += precio * 0.3f;
        }
        if (smartTV) {
            precio += 50;
        }
        return precio;
    }
}
