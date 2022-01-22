package com.programacion_java.clase_object;

public class TestClaseObject {

    public static void main(String[] args) {
       Empleado empleado1= new Empleado("Angel",4000.0);
       Empleado empleado2= new Empleado("dfvd",4000.0);
        System.out.println(empleado1==empleado2); //comparacion en memoria
        System.out.println(empleado1.equals(empleado2)); //comparacion en contenido
        System.out.println(empleado1.hashCode()==empleado2.hashCode()); //comparacion en contenido
        System.out.println(empleado1.nombre.equals(empleado2.nombre));

    }
}
