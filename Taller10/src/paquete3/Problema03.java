/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {
        String[][] notasCualitativas = new String[3][3];
        double[][] notasCuantitativas = {{7.1, 8, 10}, {3, 7, 9}, {10, 9, 2.1}};
        String cadenaFinal = " ";

        for (int fila = 0; fila < notasCuantitativas.length; fila++) {
            cadenaFinal = String.format("%s\n", cadenaFinal);
            for (int col = 0; col < notasCuantitativas[0].length; col++) {

                if (notasCuantitativas[fila][col] >= 0
                        && notasCuantitativas[fila][col] <= 2.9) {
                    notasCualitativas[fila][col] = "Insuficiente";
                } else {

                    if (notasCuantitativas[fila][col] > 2.9
                            && notasCuantitativas[fila][col] <= 4.9) {
                        notasCualitativas[fila][col] = "Regular";
                    } else {

                        if (notasCuantitativas[fila][col] > 4.9
                                && notasCuantitativas[fila][col] <= 7.9) {
                            notasCualitativas[fila][col] = "Buena";
                        } else {

                            if (notasCuantitativas[fila][col] > 7.9
                                    && notasCuantitativas[fila][col] <= 9.5) {
                                notasCualitativas[fila][col] = "Muy Buena";
                            } else {

                                notasCualitativas[fila][col] = "Sobresaliente";
                            }
                        }
                    }

                }
                cadenaFinal = String.format("%s    [%d][%d]%s\t", cadenaFinal,
                        fila, col, notasCualitativas[fila][col]);
            }

        }
        System.out.println(cadenaFinal);
    }
}
