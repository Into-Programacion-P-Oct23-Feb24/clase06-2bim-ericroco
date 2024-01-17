/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class DatosUbicacion {
    
    public static String obtenerCiudad(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre de ciudad");
        String nombreCiudad = entrada.nextLine();
        
        return nombreCiudad;
    }
}
