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
    private final int localidad;
    private final int tamaño;

    public AreaLibre(int localidad, int tamaño) {
        this.localidad = localidad;
        this.tamaño = tamaño;
    }
    
    
    public void eliminar(){
        TAL.remove(this);
    }
    
    public int getNumero(){
        return TAL.lastIndexOf(this)+ 1;
    }

    public static void setTAL(ArrayList<AreaLibre> TAL) {
        AreaLibre.TAL = TAL;
    }
    
    @Override
    public String toString(){
        String retornar = String.valueOf(this.getNumero());
        retornar += " | " +String.valueOf(localidad);
        retornar += " | " +String.valueOf(tamaño);
        retornar += " | D" ;
        return retornar;
    }
    
    public static void Imprimir(){
        for(AreaLibre al: TAL){
            System.out.println(al);
        }
    }
    
    
    
    
}
