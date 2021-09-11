/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_jafetmorel;

import java.util.ArrayList;

/**
 *
 * @author 24661
 */
public class Mision {
    private Naves nave;
    private ArrayList<Astronautas> a = new ArrayList();
    private Destino d;

    public Mision() {
    }

    public Mision(Naves nave, Destino d) {
        this.nave = nave;
        this.d = d;
    }

    public Naves getNave() {
        return nave;
    }

    public void setNave(Naves nave) {
        this.nave = nave;
    }

    public ArrayList<Astronautas> getA() {
        return a;
    }

    public void setA(ArrayList<Astronautas> a) {
        this.a = a;
    }

    public Destino getD() {
        return d;
    }

    public void setD(Destino d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Mision{" + "nave=" + nave + ", a=" + a + ", d=" + d + '}';
    }
    
    
}
