/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.*;

/**
 *
 * @author reroes
 */
public class DatoTrabajo {

    // método que permita preguntar al usuario el nombre de la empresa
    public static String obtenerEmpresa() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombreE;
        System.out.println("Ingrese el nombre de la Empresa");
        nombreE = entrada.nextLine();
        return nombreE;
    }

    // método que permita preguntar al usuario la dirección de la empresa
    public static String obtenerDireccion() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String direccion;
        System.out.println("Ingrese la dirección de la empresa");
        direccion = entrada.nextLine();
        return direccion;
    }
}
