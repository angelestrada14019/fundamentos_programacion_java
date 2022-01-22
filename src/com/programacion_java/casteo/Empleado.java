package com.programacion_java.casteo;

public class Empleado {
    protected String nombre;
    protected Double sueldo;

    public Empleado(String nombre, Double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String obtenerDetalle(){
        return "nombre: "+ nombre+ ", sueldo: "+sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
