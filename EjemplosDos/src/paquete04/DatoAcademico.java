/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class DatoAcademico {

    public static double[] obtenerNotas(int n) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double[] notas = new double[n];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese su nota: ");
            notas[i] = entrada.nextDouble();
        }
        return notas;
    }
}
