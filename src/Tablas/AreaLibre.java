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
public class AreaLibre extends RAM{
    public  static ArrayList<AreaLibre> TAL;

    public AreaLibre(int localidad, int tamaño) {
        this.localidad = localidad;
        this.tamaño = tamaño;
        this.nombre ="AL";
    }
    
    public static void insertar(AreaLibre a){
        TAL.add(a);
        Collections.sort(TAL);
        if(TAL.size()>1){
        for(int i=0; i< TAL.size()-1; i++){
            AreaLibre aux = TAL.get(i);
            AreaLibre sig = TAL.get(i+1);
            int finLoc = aux.getLocalidad() +aux.getTamaño();
            if(sig.getLocalidad() == finLoc){
                aux.setTamaño(aux.getTamaño() +sig.getTamaño());
                i--;
                sig.eliminar();
            } 
        }
        }
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
