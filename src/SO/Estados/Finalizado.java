/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SO.Estados;

import SO.Proceso;

/**
 *
 * @author braul
 */
public class Finalizado extends Estado {

    @Override
    public String toString() {
        return "D";
    }

    @Override
    public void procesar(Proceso p) {
        p.eliminar();
    }
    
}