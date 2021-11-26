/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Entidades.LigaEspañola;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaEquipos implements IArchivoLiga, Serializable {

   private List<LigaEspañola> lista;

    public ListaEquipos() {
        this.lista = new ArrayList();
    }
    
    
    
    @Override
    public LigaEspañola eliminar(String name) throws IOException {
        
        Iterator<LigaEspañola> i = this.lista.iterator();
        while(i.hasNext()){
            LigaEspañola LE = i.next();
            if(LE.getnombreEquipo().equals(name)){
                i.remove();
                return LE;
            }
        }
        return null;
    }

    @Override
    public LigaEspañola buscar(String name) throws IOException {
        
        for(LigaEspañola LE : this.lista){
            if(LE.getnombreEquipo().equals(name)){
                return LE;
            }
        }
        return null;
    }

    @Override
    public List<LigaEspañola> leer() throws IOException {
        return this.lista;
    }

    @Override
    public boolean escribir(LigaEspañola LE) throws IOException {
        
        return this.lista.add(LE);
    }
}