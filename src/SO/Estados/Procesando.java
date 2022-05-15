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
public class Procesando extends Estado {

    @Override
    public String toString() {
        return "A";
    }

    @Override
    public void procesar(Proceso p) {
        if(p.getDuracion()<=1){
            p.setE(new Finalizado());
        }
    }
    
}
