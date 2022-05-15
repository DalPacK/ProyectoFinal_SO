
package SO;

import SO.Estados.NoEntrante;
import SO.Estados.Estado;
import Tablas.Particion;

/**
 *
 * @author braul
 */
public class Proceso {
    private final String nombre;
    private final int tamaño;
    private final int tiempoLlegada;
    private int duracion;
    private Estado e;
    private int localidad;

    public Proceso(String nombre, int tamanio, int tiempoLlegada, int duracion) {
        this.nombre = nombre;
        this.tamaño = tamanio;
        this.tiempoLlegada = tiempoLlegada;
        this.duracion = duracion;
        e = new NoEntrante();
        localidad =0;
    }
    
    public void Procesar(){
        duracion--;
        e.procesar(this);
    }
    
    public void eliminar(){
        Particion.TP.remove(this);
    }
    
    //Geters y Seters
    public String getNombre() {
        return nombre;
    }
    public int getTamaño() {
        return tamaño;
    }
    public int getTiempoLlegada() {
        return tiempoLlegada;
    }
    public int getDuracion() {
        return duracion;
    }
    public Estado getE() {
        return e;
    }
    public void setE(Estado e) {
        this.e = e;
    }
    public int getLocalidad() {
        return localidad;
    }
    public void setLocalidad(int localidad) {
        this.localidad = localidad;
    }
    //Fin Geneters Setters
    
    @Override
    public String toString(){
        String retornar = String.valueOf(localidad);
        retornar+= " | "+ String.valueOf(tamaño);
        retornar+= " | "+ e.toString();
        retornar+= " | "+ nombre;
        return retornar;
    }
 
}
