package com.programacion_java.java_beans;

import java.io.Serializable;
//para conciderar una clase como java beans, esta debe implementar
// la interfaz Serializable, tener un constructor publico vacio, tener atributos privados y
// tener los get y set de todos los atributos privatos presentes
public class PersonaBean implements Serializable {//Serializable quiere decir que el objeto se convierte en bits,
    // cuando se envia por la red, se usa para poder transferir el objeto de manera automatica por la red
    private String nombre;
    private String apellido;

    public PersonaBean() {
    }
    public PersonaBean(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "PersonaBean{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
