package com.programacion_java.ejercicioFinal_progJava.datos;

import com.programacion_java.ejercicioFinal_progJava.entidades.Pelicula;
import com.programacion_java.ejercicioFinal_progJava.excepciones.AccesoDatosException;
import com.programacion_java.ejercicioFinal_progJava.excepciones.EscrituraDatosException;
import com.programacion_java.ejercicioFinal_progJava.excepciones.LecturaDatosException;

import java.util.List;

public interface AccesoDatos {
    boolean existe(String nombreArchivo) throws AccesoDatosException;
    List<Pelicula> listar(String nombreArchivo) throws LecturaDatosException;
    void escribir(Pelicula pelicula,String nombreArchivo,boolean anexar) throws EscrituraDatosException;
    String buscar(String nombreArchivo,String buscar) throws LecturaDatosException;
    void crear(String nombreArchivo) throws AccesoDatosException;
    void borrar(String nombreArchivo) throws AccesoDatosException;
}
