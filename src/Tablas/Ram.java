/*

 */
package Tablas;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author picar
 */
public class Ram implements Comparable{
    public static ArrayList<Ram> TRAM;
    
    protected int localidad;
    protected int tamaño;
    protected String nombre;

    public Ram(int localidad, int tamaño, String nombre) {
        this.localidad = localidad;
        this.tamaño = tamaño;
        this.nombre = nombre;
    }
    
    //Geters y Setters
    public int getLocalidad() {
        return localidad;
    }
    public void setLocalidad(int localidad) {
        this.localidad = localidad;
    }
    public int getTamaño() {
        return tamaño;
    }
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public static void setTRAM(ArrayList<Ram> TRAM) {
        Ram.TRAM = TRAM;
    }
    //Fin Geters Setters
    
    public static void imprimir(){
        Collections.sort(TRAM);
        for(Ram r: TRAM){
            String imprimir = String.valueOf(r.getLocalidad());
            imprimir += " -> " +String.valueOf(r.getLocalidad() +r.getTamaño());
            System.out.println(r.nombre +" | " +imprimir);
        }
    }

    @Override
    public int compareTo(Object o) {
        int otro = ((Ram)o).getLocalidad();
        return Integer.compare(this.localidad, otro);
    }
    
}
