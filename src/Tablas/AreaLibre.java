/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tablas;

import java.util.ArrayList;

/**
 *
 * @author braul
 */
public class AreaLibre {
    public  static ArrayList<AreaLibre> TAL;
    private static short cantidad;
    private int numero;
    private int localidad;
    private int tamaño;
    private String estado;

    public AreaLibre(int numero, int localidad, int tamaño, String estado) {
        this.numero = numero;
        this.localidad = localidad;
        this.tamaño = tamaño;
        this.estado = estado;
    }
    
    
    public void eliminar(){
        
        TAL.remove(this);
    }
    

    public static void setTAL(ArrayList<AreaLibre> TAL) {
        AreaLibre.TAL = TAL;
    }
    
    
    
    
}
