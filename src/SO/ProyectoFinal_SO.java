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
public class ProyectoFinal_SO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<Proceso> procesos = new ArrayDeque();
        procesos.add(new Proceso("A", 8, 1, 7));
        procesos.add(new Proceso("B",14, 2, 7));
        procesos.add(new Proceso("C",18, 3, 4));
        procesos.add(new Proceso("D", 6, 4, 6));
        procesos.add(new Proceso("E",14, 5, 5));
        
        
        ArrayList<AreaLibre> TAL = new ArrayList();
        AreaLibre.setTAL(TAL);
        
    }
    
}
