/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SO;

import Tablas.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 *
 * @author braul
 */
public class ProyectoFinalSO {
    static ArrayList<AreaLibre> TAL;
    static ArrayList<Proceso> TP;
    static Queue<Proceso> procesos;
    static int paso =0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        procesos = new ArrayDeque();
        procesos.add(new Proceso("A", 8, 1, 7));
        procesos.add(new Proceso("B",14, 2, 7));
        procesos.add(new Proceso("C",18, 3, 4));
        procesos.add(new Proceso("D", 6, 4, 6));
        procesos.add(new Proceso("E",14, 5, 5));
        
        //Tabla de Areas Libres
        TAL = new ArrayList();
        AreaLibre.setTAL(TAL);
        AreaLibre.insertar(new AreaLibre(10, 54));

        //Tabla de Particiones
        TP = new ArrayList();
        TP.add(procesos.remove());
        Particion.setTP(TP);
        AreaLibre.Imprimir();
        System.out.println();
        Particion.Imprimir();
        
        
        
        
        System.out.println("Chinga tu mare pot");
    }
    
    public void Paso(){
        paso++;
        if(procesos.peek().getTiempoLlegada() == paso){
            Proceso actual = procesos.remove();
            int i=0;
            AreaLibre checar = TAL.get(i);
            while(actual.getTamaño()> checar. )
            
        }
    }
    
}
