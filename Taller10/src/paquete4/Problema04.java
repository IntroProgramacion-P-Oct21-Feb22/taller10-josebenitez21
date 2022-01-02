/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[][] datos = new double[2][2];
        String cadenaFinal = " ";

        for (int fila = 0; fila < datos.length; fila++) {
            cadenaFinal = String.format("%s\n", cadenaFinal);

            for (int col = 0; col < datos.length; col++) {
                System.out.println("Ingrese el valor a ser registrado");

                datos[fila][col] = entrada.nextDouble();

                cadenaFinal = String.format("%s%.3f ",
                        cadenaFinal,
                        datos[fila][col]);
            }

        }
        System.out.println(cadenaFinal);
    }
}
