package com.programacion_java.manejo_archivos;

import java.io.*;

public class ManejoArchivos {

    public static void crearArchivo(String nombreArchivo){
        File archivo=new File(nombreArchivo);//crear objeto tipo file en memoria y darle un nombre
        try {
            PrintWriter salida = new PrintWriter(archivo);//se abre el archivo, se usa para guardar el archivo
            // en el disco duro,escribe informacion en el disco duro
            salida.close();//en este momento se crea el archivo
            System.out.println("se ha creado el archivo");
        }catch (Exception e){
            e.printStackTrace(System.out);
        }
    }
    public static void escribirArchivo(String nombreArchivo,String contenido){
        File archivo=new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            salida.close();
            System.out.println("se ha ingresado informacion al archivo");
        }catch (Exception e){
            e.printStackTrace(System.out);
        }
    }
    public static void anexarInformacion(String nombreArchivo,String contenido){
        File archivo=new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo,true));//se anexa informacion y no se sobre escribe
            salida.println(contenido);
            salida.close();
            System.out.println("se ha anexado informacion al archivo");
        }catch (Exception e){
            e.printStackTrace(System.out);
        }
    }
    public static void leerArchivo(String nombreArchivo){
        File archivo=new File(nombreArchivo);
        try {
            BufferedReader entrada=new BufferedReader(new FileReader(archivo));//leer lineas completas del archivo
            String lectura=entrada.readLine();
            while (lectura!=null){
                System.out.println("lectura: "+lectura);
                lectura= entrada.readLine();
            }
            entrada.close();
            System.out.println("se lee correctamente el archivo");
        }catch (Exception e){
            e.printStackTrace(System.out);
        }
    }
}
