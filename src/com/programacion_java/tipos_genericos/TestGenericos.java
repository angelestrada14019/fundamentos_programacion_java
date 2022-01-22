package com.programacion_java.tipos_genericos;

public class TestGenericos {
    public static void main(String[] args) {
        ClaseGenerica<String> claseGenericaString=new ClaseGenerica<>("Hola");
        ClaseGenerica<Integer> claseGenericaInteger=new ClaseGenerica<>(34);
        claseGenericaString.obtenerTipo();
        claseGenericaInteger.obtenerTipo();
    }
}
