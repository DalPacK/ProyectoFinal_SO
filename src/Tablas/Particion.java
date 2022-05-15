/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tablas;

import SO.Proceso;
import java.util.ArrayList;

/**
 *
 * @author braul
 */
public class Particion{
    public static ArrayList<Proceso> TP;

    public static void setTP(ArrayList<Proceso> TP) {
        Particion.TP = TP;
    }
    
    public void eliminar(Proceso proceso){
        TP.remove(proceso);
    }
    public static int getNumero(Proceso proceso){
        return TP.lastIndexOf(proceso) +1;
    }
    
    public static void Imprimir(){
        for(Proceso p: TP){
            System.out.print(String.valueOf(Particion.getNumero(p)) +" | ");
            System.out.println(p);
        }
    }
    

}
