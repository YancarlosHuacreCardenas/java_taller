/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

/**
 *
 * @author Yancarlos
 */
public class Taller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Animal objA = new Animal();

        objA.ingresarDatos();

        objA.mostrarDatos();
        
        
        objA.ingresarNombre();
        objA.mostrarDatos();
    }

}
