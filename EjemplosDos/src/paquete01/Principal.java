/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete02.DatoPersonal;
import paquete03.DatosUbicacion;
import paquete04.DatoAcademico;
import paquete05.DatoFinal;
import paquete02.DatoTrabajo;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        String nombre;
        String ciudad;
        String apellidoRetornado;
        String acumulador;
        String nombreE;
        String direccion;

        double[] misNotas;
        double promedio;
        
        direccion = DatoTrabajo.obtenerDireccion();
        nombreE = DatoTrabajo.obtenerEmpresa();
        nombre = DatoPersonal.obtenerNombre();
        apellidoRetornado = DatoPersonal.obtenerApellido();
        ciudad = DatosUbicacion.obtenerCiudad();
        misNotas = DatoAcademico.obtenerNotas(4);
        promedio = DatoFinal.obtenerPromedio(misNotas);

        acumulador = String.format("Los datos ingresados son:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Ciudad: %s\n"
                + "Promedio: %.2f\n"
                + "Nombre Empresa: %s\n"
                + "Dirección: %s\n",
                nombre,
                apellidoRetornado,
                ciudad,
                promedio,
                nombreE,
                direccion);
        for (int i = 0; i < misNotas.length; i++) {
            acumulador = String.format("%s\nNotas %s: %.2f",
                    acumulador, i + 1,
                    misNotas[i]);

        }
        acumulador = String.format("%s\nPromedio: %.2f", acumulador,
                promedio);
        System.out.printf("%s",acumulador);
    }
   
}