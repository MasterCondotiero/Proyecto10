package com.Alvarocampos.Proyecto10.Ejercicio03;

public class CocheCambioManual extends Coche {

    public CocheCambioManual(String matricula, int[] marchasMaximas) {
        super(matricula, marchasMaximas);
    }

    @Override
    public void cambiarMarcha(int nuevaMarcha) {
        if (nuevaMarcha >= 1 && nuevaMarcha <= getMarchasMaximas().length) {
            setMarchaActual(nuevaMarcha);
        }
    }
}
