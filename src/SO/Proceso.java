/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SO;

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
    
    
    
    
    
}
