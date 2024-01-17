/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class DatoPersonal {

    public static String obtenerNombre(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre de persona");
        String nombrePersona = entrada.nextLine();
        
        return nombrePersona;
    }
    
    public static String obtenerApellido(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese apellido de persona");
        String apellidoP = entrada.nextLine();
        
        return apellidoP;
    }
}
