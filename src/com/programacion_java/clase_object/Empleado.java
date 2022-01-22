package com.programacion_java.clase_object;

public class Empleado{
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        if (!nombre.equals(empleado.nombre)) return false;
        return sueldo.equals(empleado.sueldo);
    }
    @Override
    public int hashCode() {
        int result = nombre.hashCode();
        result = 31 * result + sueldo.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }


}
