/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;
import Entidades.LigaEspañola;
import java.io.*;
import java.util.List;

   
 public class ArchivoLigaBina implements IArchivoLiga {
    private File archivo;
    private FileInputStream aLectura;
    private FileOutputStream aEscritura;

    public ArchivoLigaBina() {
        this.archivo = new File("PosicionesLigaObjetos.dat");
    }
    
    
    private void guardarList(ListaEquipos lista) throws IOException{
        
        this.aEscritura = new FileOutputStream(this.archivo);
        ObjectOutputStream escritor = new ObjectOutputStream(this.aEscritura);
        escritor.writeObject(lista);
        escritor.close();
        this.aEscritura.close();
        
    }
    
    private ListaEquipos leerLista()throws IOException{
        
        if(this.archivo.exists()){
            this.aLectura = new FileInputStream(this.archivo);
            ObjectInputStream lector = new ObjectInputStream(this.aLectura);
            try {
                ListaEquipos lista = (ListaEquipos)lector.readObject();
                return lista;
            } catch (ClassNotFoundException ex) {
                throw new IOException("Error en el contenido del achivo");
            }
            finally{
                lector.close();
                this.aLectura.close();
            }
        }
        else{
            return new ListaEquipos();
        }
        
    }
    
    
    @Override
    public LigaEspañola eliminar(String name) throws IOException {
        ListaEquipos lista = this.leerLista();
        LigaEspañola eliminado = lista.eliminar(name);
        this.guardarList(lista);
        return eliminado;
    }

    @Override
    public LigaEspañola buscar(String name) throws IOException {
       ListaEquipos lista = this.leerLista();
       return lista.buscar(name);
    }

    @Override
    public List<LigaEspañola> leer() throws IOException {
        ListaEquipos lista = this.leerLista();
        return lista.leer();
    }

    @Override
    public boolean escribir(LigaEspañola LE) throws IOException {
        ListaEquipos lista = this.leerLista();
        lista.escribir(LE);
        this.guardarList(lista);
        return true;
    }

    /**
     * @return the archivo
     */
    public File getArchivo() {
        return archivo;
    }

    /**
     * @param archivo the archivo to set
     */
    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    /**
     * @return the aLectura
     */
    public FileInputStream getaLectura() {
        return aLectura;
    }

    /**
     * @param aLectura the aLectura to set
     */
    public void setaLectura(FileInputStream aLectura) {
        this.aLectura = aLectura;
    }

    /**
     * @return the aEscritura
     */
    public FileOutputStream getaEscritura() {
        return aEscritura;
    }

    /**
     * @param aEscritura the aEscritura to set
     */
    public void setaEscritura(FileOutputStream aEscritura) {
        this.aEscritura = aEscritura;
    }
}   
    

