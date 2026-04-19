/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leonildo19042026;

import java.util.Scanner;

/**
 *
 * @author 1silv
 */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int linhas = leia.nextInt();

        System.out.print("Digite a quantidade de colunas: ");
        int colunas = leia.nextInt();

        int[][] matriz1 = new int[linhas][colunas];
        int[][] matriz2 = new int[linhas][colunas];
        int[][] matriz3 = new int[linhas][colunas];
        
        System.out.println("\n--- Preenchendo a Matriz 1 ---");
        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                System.out.printf("Matriz 1 - Posição [%d][%d]: ", i, j);
                matriz1[i][j] = leia.nextInt();
            }
        }
        System.out.println("\n--- Preenchendo a Matriz 2 ---");
        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                System.out.printf("Matriz 2 - Posição [%d][%d]: ", i, j);
                matriz2[i][j] = leia.nextInt();
            }
        }

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }


        System.out.println("Resultado da Matriz Soma:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz3[i][j] + "\t"); 
            }
            System.out.println();
        }
        
        leia.close(); 
    }
}
