/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_jafetmorel;

import java.io.Serializable;

/**
 *
 * @author 24661
 */
public class Astronautas implements Serializable{
    private int id;
    private String nombre, apellido, nacionalidad, titun, context;
    private int peso, misiones=0;

    public Astronautas() {
    }

    public Astronautas(int id, String nombre, String apellido, String nacionalidad, String titun, String context, int peso) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.titun = titun;
        this.context = context;
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTitun() {
        return titun;
    }

    public void setTitun(String titun) {
        this.titun = titun;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getMisiones() {
        return misiones;
    }

    public void setMisiones(int misiones) {
        this.misiones = misiones;
    }

    @Override
    public String toString() {
        return nombre + " "+ apellido;
    }
    
}
