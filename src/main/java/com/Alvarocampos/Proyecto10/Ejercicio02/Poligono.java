package com.Alvarocampos.Proyecto10.Ejercicio02;

import java.util.List;

public class Poligono {
    private List<Punto> vertices;

    public Poligono(List<Punto> vertices) {
        this.vertices = vertices;
    }

    public void traslada(double dx, double dy) {
        for (Punto p : vertices) {
            p.setX(p.getX() + dx);
            p.setY(p.getY() + dy);
        }
    }
    public double perimetro() {
        double total = 0;
        for (int i = 0; i < vertices.size(); i++) {
            Punto actual = vertices.get(i);
            Punto siguiente = vertices.get((i + 1) % vertices.size()); // conexión última con primera
            total += actual.distancia(siguiente);
        }
        return total;
    }

    public int numVertices() {
        return vertices.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Punto p : vertices) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }
}
