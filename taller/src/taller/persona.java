/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import javax.swing.JOptionPane;

/**
 *
 * @author Yancarlos
 */
public class persona {
    
    String nombre;
    
    public void ingresarNombre(){
        nombre = JOptionPane.showInputDialog("ingresa el nombre");
    }
            
     public void mostrarDatos(){
         JOptionPane.showMessageDialog(null, "el nombre es " + nombre);
     }   
}
