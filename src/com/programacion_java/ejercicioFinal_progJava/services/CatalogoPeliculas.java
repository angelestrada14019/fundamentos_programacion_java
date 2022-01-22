package com.programacion_java.ejercicioFinal_progJava.services;

public interface CatalogoPeliculas {
    String NOMBRE_RECURSO="peliculas.txt";
    void agregarPelicula(String nombrePelicula);
    void buscarPelicula(String buscar);
    void iniciarArchivo();
    void listarPeliculas();
}
