package com.programacion_java.casteo;

public class Gerente extends Empleado{
    private String departamento;

    public Gerente(String nombre, Double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    @Override
    public String obtenerDetalle() {
        return super.obtenerDetalle() +", departamento: "+ departamento;
    }
}
