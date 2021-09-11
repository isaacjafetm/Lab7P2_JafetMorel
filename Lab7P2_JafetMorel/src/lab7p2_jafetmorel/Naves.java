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
public class Naves implements Serializable{
    private String nombre, iden;
    private int maxcant, despegue, aterrizaje, veloc, maxdist, gasto, combprin, combres;

    public Naves() {
    }

    public Naves(String nombre, String iden, int maxcant, int despegue, int aterrizaje, int veloc, int maxdist, int gasto, int combprin, int combres) {
        this.nombre = nombre;
        this.iden = iden;
        this.maxcant = maxcant;
        this.despegue = despegue;
        this.aterrizaje = aterrizaje;
        this.veloc = veloc;
        this.maxdist = maxdist;
        this.gasto = gasto;
        this.combprin = combprin;
        this.combres = combres;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIden() {
        return iden;
    }

    public void setIden(String iden) {
        this.iden = iden;
    }

    public int getMaxcant() {
        return maxcant;
    }

    public void setMaxcant(int maxcant) {
        this.maxcant = maxcant;
    }

    public int getDespegue() {
        return despegue;
    }

    public void setDespegue(int despegue) {
        this.despegue = despegue;
    }

    public int getAterrizaje() {
        return aterrizaje;
    }

    public void setAterrizaje(int aterrizaje) {
        this.aterrizaje = aterrizaje;
    }

    public int getVeloc() {
        return veloc;
    }

    public void setVeloc(int veloc) {
        this.veloc = veloc;
    }

    public int getMaxdist() {
        return maxdist;
    }

    public void setMaxdist(int maxdist) {
        this.maxdist = maxdist;
    }

    public int getGasto() {
        return gasto;
    }

    public void setGasto(int gasto) {
        this.gasto = gasto;
    }

    public int getCombprin() {
        return combprin;
    }

    public void setCombprin(int combprin) {
        this.combprin = combprin;
    }

    public int getCombres() {
        return combres;
    }

    public void setCombres(int combres) {
        this.combres = combres;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
