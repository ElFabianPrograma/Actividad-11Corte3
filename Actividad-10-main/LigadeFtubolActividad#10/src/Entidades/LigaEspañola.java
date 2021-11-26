/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;


public class LigaEspañola implements Serializable,Comparable <LigaEspañola>{
    private String nombreEquipo;
    private int parj;
    private int parg;
    private int pare;
    private int parp;
    private int puntos;

    public LigaEspañola() {
    }

    public LigaEspañola(String nombreEquipo, int parj, int parg, int pare, int parp, int puntos) {
        this.nombreEquipo = nombreEquipo;
        this.parj = parj;
        this.parg = parg;
        this.pare = pare;
        this.parp = parp;
        this.puntos=puntos;
    }

    public String getnombreEquipo() {
        return nombreEquipo;
    }

    public void setNameEquip(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getParj() {
        return parj;
    }

    public void setPj(int parj) {
        this.parj = parj;
    }

    public int getParg() {
        return parg;
    }

    public void setPg(int parg) {
        this.parg = parg;
    }

    public int getPare() {
        return pare;
    }

    public void setPe(int pare) {
        this.pare = pare;
    }

    public int getParp() {
        return parp;
    }

    public void setPp(int parp) {
        this.parp = parp;
    }

    public int getpuntos() {
        return puntos;
    }

    public void setPoints(int puntos) {
        this.puntos = puntos;
    }

    
    
    
    public String getDatosFileText(){ 
        
        return this.nombreEquipo+";"+
               this.parj+";"+ 
               this.parg+";"+ 
               this.pare+";"+ 
               this.parp+";"+
               this.puntos;
    }

    @Override
    public int compareTo(LigaEspañola Liga) {
        return Liga.puntos - this.puntos;
    }

 
}
