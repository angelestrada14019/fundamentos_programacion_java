package com.programacion_java.casteo;

public class TestCasteo {

    public static void main(String[] args) {
        Empleado empleado=new Escritor("Angel",999999.0,TipoEscritura.CLASICO);
        //System.out.println("empleado = " + empleado);
        System.out.println("empleado = " +((Escritor)empleado).getTipoEscritura());//downcasting convertir clase padre a una clase hija

        Escritor escritor = (Escritor) empleado;//convertir empleado(tipo empleado) a un tipo escritor
    }
}
