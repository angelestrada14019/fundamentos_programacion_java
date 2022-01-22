package com.programacion_java.bloques_codigo_inicio;

public class Persona {
    private  final int id;
    private static int contPersona;

    static { //bloque de codigo estatico, se inicia antes que el contructor, es decir, cuando esta clase se carga en memoria
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contPersona;
    }

    {//bloque de inicializacion no estatico, se inicia antes que el contructor pero despues del estatico,
        // se ejecuta cada vez que se crea un objeto de la clase
        System.out.println("ejecucion bloque no estatico");
        this.id=contPersona++;
    }

    public Persona(){
        System.out.println("ejecucion del constructor");
    }

    public int getId() {
        return id;
    }
}
