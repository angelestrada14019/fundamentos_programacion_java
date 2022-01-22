package com.programacion_java.ejercicioFinal_progJava;

import com.programacion_java.ejercicioFinal_progJava.services.CatalogoPeliculas;
import com.programacion_java.ejercicioFinal_progJava.services.CatalogoPeliculasImpl;

import java.util.Scanner;

public class TestFinalFun {
    public static Scanner leer =new Scanner(System.in);
    public static int opcion=-1;
    public static boolean seguir=true;
    public static CatalogoPeliculas catalogoPeliculas;

    public static void main(String[] args) {
        catalogoPeliculas=new CatalogoPeliculasImpl();
        while (seguir){
            menu();
            System.out.println("introduzca la opcion: ");
            opcion=Integer.parseInt(leer.nextLine());
            seleccion(opcion);
        }
    }

    public static void  menu(){
        System.out.println("......................................................................");
        System.out.println("1. Iniciar Catalogo peliculas");
        System.out.println("2. Agregar pelicula");
        System.out.println("3. Listar peliculas");
        System.out.println("4. Buscar pelicula");
        System.out.println("0. Salir");
        System.out.println("......................................................................");

    }
    public static void seleccion(int opcion){

        switch (opcion){
            case 0:
                System.out.println("......................................................................");
                System.out.println("No vuelva");
                System.out.println("......................................................................");
                seguir=false;
                break;
            case 1:
                System.out.println("......................................................................");
                System.out.println("1. Iniciar Catalogo peliculas");
                catalogoPeliculas.iniciarArchivo();
                System.out.println("......................................................................");
                break;

            case 2:
                System.out.println("......................................................................");
                System.out.println("2. Agregar pelicula");
                System.out.println("Ingrese el nombre de la pelicula");
                String nombrePelicula=leer.nextLine();
                catalogoPeliculas.agregarPelicula(nombrePelicula);
                System.out.println("......................................................................");
                break;

            case 3:
                System.out.println("......................................................................");
                System.out.println("3. Listar peliculas");
                catalogoPeliculas.listarPeliculas();
                System.out.println("......................................................................");
                break;

            case 4:
                System.out.println("......................................................................");
                System.out.println("4. Buscar pelicula");
                System.out.println("Ingrese el nombre de la pelicula a buscar");
                String nombrePeliculaB=leer.nextLine();
                catalogoPeliculas.buscarPelicula(nombrePeliculaB);
                System.out.println("......................................................................");
                break;

            default:
                System.out.println("......................................................................");
                System.out.println("Ingrese un valor valido");
                System.out.println("......................................................................");
                break;
        }
    }
}
