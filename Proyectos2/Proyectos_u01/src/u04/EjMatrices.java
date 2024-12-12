package u04;

import java.util.Scanner;

public class EjMatrices {

    // Esquema de la entrada: caso de prueba que marca el final

    static Scanner in;

    public static boolean casoDePrueba() {

        // LEER CASO DE PRUEBA
        int dim = in.nextInt();

        if (dim == 0) {
            return false;
        } else {
            // CÓDIGO PRINCIPAL AQUÍ
            int[][] matriz = new int[dim][dim];
            for (int i = 0; i < dim; i++) {
                for (int j = 0; j < dim; j++) {
                    matriz[i][j] = in.nextInt();
                }
            }

            // Comprobar si es triangular superior o inferior
            boolean esTriangularSuperior = true;
            boolean esTriangularInferior = true;

            for (int i = 0; i < dim; i++) {
                for (int j = 0; j < dim; j++) {
                    if (i > j && matriz[i][j] != 0) {
                        esTriangularSuperior = false;
                    }
                    if (i < j && matriz[i][j] != 0) {
                        esTriangularInferior = false;
                    }
                }
            }

            // Imprimir resultado
            if (esTriangularSuperior || esTriangularInferior) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

            return true;
        }

    } // casoDePrueba

    public static void main(String[] args) {

        in = new Scanner(System.in);

        while (casoDePrueba())
            ;

    } // main

}
