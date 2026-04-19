/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leonildo19042026;

/**
 *
 * @author 1silv
 */
public class Exercicio4 {
    public static void main(String[] args) {
        int[][] numeros = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25},
        };
        
        int valor1 = 0;
        int valor2 = 0;
        int valor3 = 0;
        int valor4 = 0;
        int valor5 = 0;

        int[] vetor = new int[5];
        
        for(int i = 0; i < numeros.length; i++){
            valor1 += numeros[i][0];
            vetor[0] = valor1; 
            valor2 += numeros[i][1];
            vetor[1] = valor2; 
            valor3 += numeros[i][2];
            vetor[2] = valor3; 
            valor4 += numeros[i][3];
            vetor[3] = valor4; 
            valor5 += numeros[i][4];
            vetor[4] = valor5; 
        }
        for (int i = 0; i < vetor.length; i++) {
       System.out.println("O valor das somas da coluna foram estes: " + vetor[i]);
}
    }
}
