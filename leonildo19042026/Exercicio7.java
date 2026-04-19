/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leonildo19042026;

/**
 *
 * @author 1silv
 */
public class Exercicio7 {
    public static void main(String[] args) {

        int[][] matriz = {
            {9, 3, 5},
            {1, 8, 2},
            {7, 4, 6}
        };

        int linhas = matriz.length;
        int colunas = matriz[0].length;

        System.out.println("Original:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        for (int i1 = 0; i1 < linhas; i1++) {
            for (int j1 = 0; j1 < colunas; j1++) {
                for (int i2 = 0; i2 < linhas; i2++) {
                    for (int j2 = 0; j2 < colunas; j2++) {
                        if (matriz[i1][j1] < matriz[i2][j2]) {
                            int temp = matriz[i1][j1];
                            matriz[i1][j1] = matriz[i2][j2];
                            matriz[i2][j2] = temp;
                        }
                    }
                }
            }
        }

        System.out.println("Ordenada:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}