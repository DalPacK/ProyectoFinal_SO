
package SO;

import SO.Estados.NoEntrante;
import SO.Estados.Estado;
import Tablas.AreaLibre;
import Tablas.Particion;
import Tablas.RAM;

/**
 *
 * @author braul
 */
public class Proceso extends RAM{
    private int tiempoLlegada;
    private int duracion;
    private Estado e;

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
        AreaLibre.insertar(new AreaLibre(this.localidad, this.tamaño));
        Particion.TP.remove(this);
    }
    
    //Geters y Seters
    public String getNombre() {
        return nombre;
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
    public void setTiempoLlegada(int tiempoLlegada) {
        this.tiempoLlegada = tiempoLlegada;
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
