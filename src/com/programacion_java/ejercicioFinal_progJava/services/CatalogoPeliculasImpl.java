package com.programacion_java.ejercicioFinal_progJava.services;

import com.programacion_java.ejercicioFinal_progJava.datos.AccesoDatos;
import com.programacion_java.ejercicioFinal_progJava.datos.AccesoDatosImpl;
import com.programacion_java.ejercicioFinal_progJava.entidades.Pelicula;
import com.programacion_java.ejercicioFinal_progJava.excepciones.AccesoDatosException;
import com.programacion_java.ejercicioFinal_progJava.excepciones.EscrituraDatosException;
import com.programacion_java.ejercicioFinal_progJava.excepciones.LecturaDatosException;

import java.util.List;


public class CatalogoPeliculasImpl implements CatalogoPeliculas{
    private AccesoDatos datos;

    public CatalogoPeliculasImpl() {
        datos=new AccesoDatosImpl();
    }

    @Override
    public void agregarPelicula(String nombrePelicula) {
        boolean anexar=false;
        try {
            anexar=datos.existe(NOMBRE_RECURSO);
            datos.escribir(new Pelicula(nombrePelicula),NOMBRE_RECURSO,anexar);
        } catch (EscrituraDatosException e) {
            e.printStackTrace();
        } catch (AccesoDatosException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void buscarPelicula(String buscar) {
        try {
            String resultado =datos.buscar(NOMBRE_RECURSO,buscar);
            System.out.println("resultado = " + resultado);
        } catch (LecturaDatosException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void iniciarArchivo() {
        try {
            if (datos.existe(NOMBRE_RECURSO)){
                datos.borrar(NOMBRE_RECURSO);
                datos.crear(NOMBRE_RECURSO);
            }else {
                datos.crear(NOMBRE_RECURSO);
            }
        } catch (AccesoDatosException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void listarPeliculas() {
        try {
            List<Pelicula> peliculas=datos.listar(NOMBRE_RECURSO);
            peliculas.forEach(pelicula -> {
                System.out.println("pelicula = " + pelicula);
            });
        } catch (LecturaDatosException e) {
            e.printStackTrace();
        }
    }
}
