package com.programacion_java.collections;

import java.util.*;

public class TestCollections {
    public static void main(String[] args) {
        //tipo List.................................................................
        List<Object> miLista=new ArrayList<>();
        miLista.add("hola");
        miLista.add(234);
        miLista.add("hola");
        miLista.add(234);
        List<String> miListaString=new ArrayList<>();//unicamente string
        /*for (Object element: miLista) {
            System.out.println(element);
        }*/
        //miLista.forEach(System.out::println);
        //imprimir(miLista);
        //.......................................................................
        //Tipo Set no mantiene un orden...............................................
        Set<Object> miSet=new HashSet<>(); //operaciones mas rapidas, no se pueden duplicar elementos
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        //imprimir(miSet);
        //............................................................................
        //Map concepto llave-valor.......................................................
        Map<Object,Object> miMapa=new HashMap<>();
        miMapa.put(1,"valor1");
        miMapa.put(2,"valor2");
        miMapa.put(3,"valor3");

        //System.out.println(miMapa.get(2));
        //imprimir(miMapa.keySet());
        //imprimir(miMapa.values());
        miMapa.forEach((i,e)->{
            System.out.println("clave: "+i+", valor: "+e);
        });

    }
    public static void imprimir(Collection collection){
        collection.forEach(element->{
            System.out.println("element: "+element);
        });
    }
}
