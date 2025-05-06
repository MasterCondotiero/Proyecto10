package com.Alvarocampos.Proyecto10.Ejercicio04;

import java.util.Random;

public class Ejercicio04 {
    public static void main(String[] args) {
        Electrodomestico[] lista = new Electrodomestico[10];
        Random rand = new Random();

        double totalElectrodomesticos = 0;
        double totalLavadoras = 0;
        double totalTelevisiones = 0;

        //Añadir color random
        for (int i = 0; i < lista.length; i++) {
            int tipo = rand.nextInt(3);
            switch (tipo) {
                case 0:
                    lista[i] = new Electrodomestico(
                            100 + rand.nextInt(400),
                            10 + rand.nextInt(80),
                            Color.comprobarColor("azul"),
                            ConsumoEnergetico.comprobarConsumo('C'));
                    break;
                case 1:
                    lista[i] = new Lavadora(
                            150 + rand.nextInt(300),
                            20 + rand.nextInt(60),
                            Color.comprobarColor("gris"),
                            ConsumoEnergetico.comprobarConsumo('B'),
                            rand.nextInt(50));
                    break;
                case 2:
                    lista[i] = new Televisor(
                            200 + rand.nextInt(300),
                            10 + rand.nextInt(40),
                            Color.comprobarColor("verde"),
                            ConsumoEnergetico.comprobarConsumo('A'),
                            30 + rand.nextInt(30),
                            rand.nextBoolean());
                    break;
            }
        }

        for (Electrodomestico e : lista) {
            double precio = e.precioFinal();
            totalElectrodomesticos += precio;

            if (e instanceof Lavadora) {
                totalLavadoras += precio;
            } else if (e instanceof Televisor) {
                totalTelevisiones += precio;
            }
        }

        System.out.println("Total Electrodomesticos: " + totalElectrodomesticos + "€");
        System.out.println("Total Lavadoras: " + totalLavadoras + "€");
        System.out.println("Total Televisiones: " + totalTelevisiones + "€");


        System.out.println("---ELectrodomesticos---");
        for (int i = 0; i < lista.length; i++) {
            Electrodomestico e = lista[i];
            System.out.println("\nElectrodoméstico " + (i + 1));
            System.out.println("Tipo: " + e.getClass().getSimpleName());
            System.out.println("Precio base: " + e.getPrecioBase() + "€");
            System.out.println("Peso: " + e.getPeso() + " kg");
            System.out.println("Color: " + e.getColor());
            System.out.println("Consumo energetico: " + e.getConsumoEnergetico());

            if (e instanceof Lavadora) {
                System.out.println("Carga: " + ((Lavadora) e).getCarga() + " kg");
            } else if (e instanceof Televisor) {
                Televisor tv = (Televisor) e;
                System.out.println("Resolucion: " + tv.getResolucion() + " pulgadas");
                System.out.println("Smart TV: " + (tv.esSmartTV() ? "Sí" : "No"));
            }

            System.out.println("Precio final: " + e.precioFinal() + "€");
        }
    }
}
