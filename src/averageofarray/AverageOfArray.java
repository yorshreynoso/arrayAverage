/*
 * Promedio de calificaciones utilizando un array
 */
package averageofarray;

import java.util.Scanner;

/**
 *
 * @author YORSH
 */
public class AverageOfArray {

    static double promedio = 0;
    static final int NO_MATERIAS = 5;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[] calificaciones = new double[NO_MATERIAS];
        final String[] MATERIAS;
        MATERIAS = new String[]{"Calculo", "Fisica", "Ecuaciones diferenciales",
            "electronica", "programacion"};

        Scanner teclado = new Scanner(System.in);
        for (int index = 0; index < MATERIAS.length; index++) {
            double calificacion;
            System.out.println("dame la materia de " + MATERIAS[index]);
            calificaciones[index] = teclado.nextDouble();

        }

        promedio = getPromedio(calificaciones);

        imprimirPromedio(promedio);
    }

    private static double getPromedio(double[] calificaciones) {

        for (int index = 0; index < calificaciones.length; index++) {
            promedio += calificaciones[index];

        }
        promedio = (promedio / NO_MATERIAS);
        return promedio;
    }

    private static void imprimirPromedio(double promedio) {
        System.out.println("el promedio es " + promedio);
    }

}
