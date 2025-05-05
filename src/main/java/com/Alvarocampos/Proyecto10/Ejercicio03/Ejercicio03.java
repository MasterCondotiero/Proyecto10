package com.Alvarocampos.Proyecto10.Ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la matrícula del coche: ");
        String matricula = scanner.nextLine();

        System.out.print("¿El coche es automático? (s/n): ");
        boolean automatico = scanner.nextLine().trim().equalsIgnoreCase("s");

        int[] marchasMax = {30, 50, 80, 120, 160}; // ejemplo: 5 marchas

        Coche coche;
        if (automatico) {
            coche = new CocheCambioAutomatico(matricula, marchasMax);
        } else {
            coche = new CocheCambioManual(matricula, marchasMax);
        }

        System.out.println("\nInformación inicial del coche:");
        System.out.println(coche);

        // Acelerar a 60 km/h
        coche.acelerar(60);

        // Si es manual, cambiar a tercera marcha
        if (coche instanceof CocheCambioManual) {
            ((CocheCambioManual) coche).cambiarMarcha(3);
        }

        System.out.println("\nInformación después de acelerar:");
        System.out.println(coche);

        scanner.close();
    }
}
