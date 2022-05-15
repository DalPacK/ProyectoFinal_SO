/*

 */
package Tablas;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author picar
 */
public class RAM implements Comparable{
    public static ArrayList<RAM> TRAM;
    
    protected int localidad;
    protected int tamaño;
    protected String nombre;
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

    public static void setTRAM(ArrayList<RAM> TRAM) {
        RAM.TRAM = TRAM;
    }
    
    public static void imprimir(){
        Collections.sort(TRAM);
        for(RAM r: TRAM){
            System.out.println(r);
        }
    }

    @Override
    public int compareTo(Object o) {
        int otro = ((RAM)o).getLocalidad();
        return Integer.compare(this.localidad, otro);
    }
    
}
