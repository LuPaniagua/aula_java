/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leonildo19042026;

/**
 *
 * @author 1silv
 */
public class Exercicio6 {
    public static void main(String[] args) {

        int[][] matriz = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int[] par = new int[9];
        int[] impar = new int[9];

        int p = 0, im = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                int valor = matriz[i][j];
                System.out.print(valor + " ");

                if (valor % 2 == 0) {
                    par[p++] = valor;
                } else {
                    impar[im++] = valor;
                }
            }
            System.out.println();
        }

        System.out.print("Pares: ");
        for (int i = 0; i < p; i++) System.out.print(par[i] + " ");

        System.out.print("\nÍmpares: ");
        for (int i = 0; i < im; i++) System.out.print(impar[i] + " ");
    }
}