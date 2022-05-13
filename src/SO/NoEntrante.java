/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SO;

/**
 *
 * @author braul
 */
public class NoEntrante extends Estado {

    @Override
    public String toString() {
        return "No entrante";
    }

    @Override
    public void procesar(Proceso p) {
        p.setE(new Procesando());
    }


    
}
