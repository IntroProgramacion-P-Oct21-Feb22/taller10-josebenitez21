/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[][] arreglo1 = {{9, 10, 7, 8},
        {10, 5, 7, 9},
        {7, 9.4, 10, 9},};
        String[] estudiantes = {"Jerry Ponce", "Gabriela Lewis", "David Bell"};
        double suma;
        double valor;
        double[] promedio = new double[3];
        String cadenaFinal = " ";
        for (int fila = 0; fila < arreglo1.length; fila++) {
            suma = 0;
            for (int col = 0; col < arreglo1[0].length; col++) {
                suma = suma + arreglo1[fila][col];

            }
            promedio[fila] = suma / arreglo1[0].length;
        }

        for (int i = 0; i < estudiantes.length; i++) {
            cadenaFinal = String.format("%s\nEstudiante: %s tiene un promedio de"
                    + " " + "%.2f",
                    cadenaFinal, estudiantes[i], promedio[i]);
        }
        System.out.println(cadenaFinal);
    }
}
