/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tablas;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author braul
 */
public class AreaLibre implements Comparable{
    public  static ArrayList<AreaLibre> TAL;
    private int localidad;
    private int tamaño;

    public AreaLibre(int localidad, int tamaño) {
        this.localidad = localidad;
        this.tamaño = tamaño;
    }
    
    public static void insertar(AreaLibre a){
        TAL.add(a);
        Collections.sort(TAL);

    }
    
    
    public void eliminar(){
        TAL.remove(this);
    }
    
    public int getNumero(){
        return TAL.lastIndexOf(this)+ 1;
    }
    public int getTamaño() {
        return tamaño;
    }
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    public int getLocalidad() {
        return localidad;
    }
    public void setLocalidad(int localidad) {
        this.localidad = localidad;
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

    @Override
    public int compareTo(Object o) {
        int otro = ((AreaLibre)o).localidad;
        return Integer.compare(this.localidad, otro);
    }
 
}
