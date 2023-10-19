/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import java.util.Scanner;

/**
 *
 * @author Yancarlos
 */
public class Animal {

    int a;
    String nombre;
    boolean v;

    Scanner entrada = new Scanner(System.in);

    public void ingresarDatos() {

        System.out.println("ingresa el numero");
        a = entrada.nextInt();
        System.out.println("ingresa el nombre");
        nombre = entrada.next();
        System.out.println("ingresar el valor booleano");
        v = entrada.nextBoolean();
    }

    public void mostrarDatos() {
        System.out.println("el numero es " + a
                + "nel texto es " + nombre
                + "El valor bolleano es : " + v);

    }

    void ingresarNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
