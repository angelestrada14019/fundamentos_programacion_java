package com.programacion_java.ejercicioFinal_progJava.datos;

import com.programacion_java.ejercicioFinal_progJava.entidades.Pelicula;
import com.programacion_java.ejercicioFinal_progJava.excepciones.AccesoDatosException;
import com.programacion_java.ejercicioFinal_progJava.excepciones.EscrituraDatosException;
import com.programacion_java.ejercicioFinal_progJava.excepciones.LecturaDatosException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AccesoDatosImpl implements AccesoDatos{

    @Override
    public boolean existe(String nombreArchivo) throws AccesoDatosException {
        File archivo=new File(nombreArchivo);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosException {
        File archivo=new File(nombreArchivo);
        List<Pelicula> peliculas=new ArrayList<>();
        try {
            BufferedReader entrada=new BufferedReader(new FileReader(archivo));
            String linea=null;
            linea=entrada.readLine();
            while (linea != null){
                peliculas.add(new Pelicula(linea));
                linea=entrada.readLine();
            }
            entrada.close();
            System.out.println("se lee correctamente el archivo");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new LecturaDatosException("No se pudieron listar las peliculas\n"+e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            throw new LecturaDatosException("No se pudieron listar las peliculas\n"+e.getMessage());
        }
        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosException {
        File archivo=new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo,anexar));
            salida.println(pelicula.toString());
            salida.close();
            System.out.println("se ha anexado informacion al archivo");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new  EscrituraDatosException("No se pudo ingresar la pelicula"+e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            throw new  EscrituraDatosException("No se pudo ingresar la pelicula"+e.getMessage());
        }
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosException {
        File archivo=new File(nombreArchivo);
        String resultado=null;

        try {
            BufferedReader entrada=new BufferedReader(new FileReader(archivo));
            String linea=null;
            linea=entrada.readLine();
            int indiceLinea=1;
            while (linea != null){
                if (buscar !=null && buscar.equalsIgnoreCase(linea)){//se usa ese equals para que ignore entre mayusculas y minusculas
                    resultado="Pelicula: "+linea+", en el indice: "+indiceLinea;
                    break;
                }
                linea=entrada.readLine();
                indiceLinea++;
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new LecturaDatosException("No se pudo encontrar la pelicula\n"+e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            throw new LecturaDatosException("No se pudo encontrar la pelicula\n"+e.getMessage());
        }
        return resultado;
    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosException {
        File archivo=new File(nombreArchivo);//crear objeto tipo file en memoria y darle un nombre

        PrintWriter salida = null;
        try {
            salida = new PrintWriter(archivo);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new AccesoDatosException("No se pudo crear el archivo "+e.getMessage());
        }
        salida.close();
        System.out.println("se ha creado el archivo");

    }

    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosException {
        File archivo =new File(nombreArchivo);
        if (archivo.exists()){
            archivo.delete();
        }
        System.out.println("Se ha borrado el archivo");
    }
}
