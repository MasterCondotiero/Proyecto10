package com.Alvarocampos.Proyecto10.Ejercicio03;

public class CocheCambioAutomatico extends Coche {

    public CocheCambioAutomatico(String matricula, int[] marchasMaximas) {
        super(matricula, marchasMaximas);
    }

    @Override
    public void acelerar(int incremento) {
        super.setVelocidadActual(getVelocidadActual() + incremento);
        ajustarMarcha();
    }

    @Override
    public void frenar(int decremento) {
        super.setVelocidadActual(getVelocidadActual() - decremento);
        ajustarMarcha();
    }
    private void ajustarMarcha() {
        int velocidad = getVelocidadActual();
        int nuevaMarcha = 0;
        for (int i = 0; i < marchasMaximas.length; i++) {
            if (velocidad <= marchasMaximas[i]) {
                nuevaMarcha = i + 1;
                break;
            }
        }
        if (nuevaMarcha == 0) nuevaMarcha = marchasMaximas.length;
        setMarchaActual(nuevaMarcha);
    }
}
