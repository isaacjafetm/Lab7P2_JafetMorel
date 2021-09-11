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
public class Destino implements Serializable{
    private String nombre;
    private int distancia;
    private String superficie;
    private int saturacion;

    public Destino(String nombre, int distancia, String superficie, int saturacion) {
        this.nombre = nombre;
        this.distancia = distancia;
        this.superficie = superficie;
        this.saturacion = saturacion;
    }

    public Destino() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    public int getSaturacion() {
        return saturacion;
    }

    public void setSaturacion(int saturacion) {
        this.saturacion = saturacion;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
