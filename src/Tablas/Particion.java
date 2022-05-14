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

    public void setTP(ArrayList<Proceso> TP) {
        Particion.TP = TP;
    }
    
    public void eliminar(Proceso proceso){
        TP.remove(proceso);
    }
    public int getNumero(Proceso proceso){
        return TP.lastIndexOf(proceso);
    }

}
