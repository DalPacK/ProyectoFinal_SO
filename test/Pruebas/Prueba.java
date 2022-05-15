/*

 */
package Pruebas;

import Tablas.*;
import SO.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 *
 * @author picar
 */
public class Prueba {

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
        
        //Tabla de Areas Libres
        ArrayList<AreaLibre> TAL = new ArrayList();
        AreaLibre.setTAL(TAL);
        AreaLibre.insertar(new AreaLibre(10, 54));

        //Tabla de Particiones
        ArrayList<Proceso> TP = new ArrayList();
        TP.add(procesos.remove());
        Particion.setTP(TP);
        AreaLibre.Imprimir();
        System.out.println();
        Particion.Imprimir();
        
        
        
        
        System.out.println("Chinga tu mare pot");
    }
    
}
