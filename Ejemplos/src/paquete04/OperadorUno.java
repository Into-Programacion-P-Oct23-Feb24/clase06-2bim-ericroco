/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.security.SecureRandom;

/**
 *
 * @author reroes
 */
public class OperadorUno {
    
    public static int obtenerNumero(int limite) {
        // objeto generador de números aleatorios
        SecureRandom numerosAleatorios = new SecureRandom();
        
        // Returns a pseudorandom, uniformly distributed int value 
        // between 0 (inclusive) and the specified value (exclusive)
        int valorAleatorio = numerosAleatorios.nextInt(limite); // 0 - 99
                                                                // 0 - 9
        return valorAleatorio;
    }
    
}
