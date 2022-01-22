package com.programacion_java.clase_object;

public class Escritor extends Empleado {
    private final TipoEscritura tipoEscritura;

    public Escritor(String nombre, Double sueldo, TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    @Override
    public String obtenerDetalle() {
        return super.obtenerDetalle()+", tipo de escritura: "+tipoEscritura.getDescripcion();
    }

    @Override
    public String toString() {
        return "Escritor{" +
                super.toString()+
                ", tipoEscritura=" + tipoEscritura +
                '}';
    }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }
}
