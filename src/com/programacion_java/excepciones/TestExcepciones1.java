package com.programacion_java.excepciones;

public class TestExcepciones1 {
    public static void main(String[] args) {
        int a=0;
        try {
            a=Aritmetica.division(3,0);
        }catch (OperacionExcepcion e){
            System.out.println("Error tipo OperacionExepcion: "+e.getMessage());
        }catch (Exception e){
            //e.printStackTrace(System.out);//imprimir la pila de excepciones, el listado de todas las excepciones
            System.out.println("Error tipo Exception: "+e.getMessage());
        }finally {//Este bloque siempre se va a ejecutar independiente si se da la excecion o no
            //Se puede usar para cerrar recursos
            System.out.println("se reviso la division");
        }
        System.out.println("Resultado: "+a);
    }
}
