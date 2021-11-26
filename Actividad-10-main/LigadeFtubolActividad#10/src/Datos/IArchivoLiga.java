/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Entidades.LigaEspañola;
import java.io.IOException;
import java.util.List;


public interface IArchivoLiga {
    public LigaEspañola eliminar(String Equipo) throws IOException;
    public LigaEspañola buscar(String Equipo) throws IOException;
    public List<LigaEspañola> leer() throws IOException;
    public boolean escribir(LigaEspañola LE) throws IOException;
}
