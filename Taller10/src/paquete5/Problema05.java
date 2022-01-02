/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author reroes
 */
public class Problema05 {

    public static void main(String[] args) {

        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };
        String[] inicialesExclu = {"S", "P", "T"};
        String cadenaFinal = " ";
        char nombre;
        String inicial;

        for (int fila = 0; fila < estudiantes.length; fila++) {
            for (int columnas = 0; columnas < estudiantes[0].length; columnas++) {

                nombre = estudiantes[fila][columnas].charAt(0);
                inicial = String.valueOf(nombre);

                for (int i = 0; i < inicialesExclu.length; i++) {

                    if (inicial.equals(inicialesExclu[i])) {
                        cadenaFinal = String.format("%s\n%s",
                                cadenaFinal, estudiantes[fila][columnas]);
                    }
                }
            }
        }
        System.out.println(cadenaFinal);

    }
}
