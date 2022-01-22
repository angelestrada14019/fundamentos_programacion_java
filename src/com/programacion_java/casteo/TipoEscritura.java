package com.programacion_java.casteo;

public enum TipoEscritura {
    CLASICO("Escritura a mano"),
    MODERNO("Escritura digital");
    private final String descripcion;


    TipoEscritura(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
