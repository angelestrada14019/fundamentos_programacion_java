package com.programacion_java.excepciones;

public class Aritmetica {

    public static int division(int num,int deno) throws OperacionExcepcion{
        if (deno==0){
            throw new OperacionExcepcion("se esta dividiendo por 0");
        }
        return num/deno;
    }
}
