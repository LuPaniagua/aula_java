/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leonildo19042026;

/**
 *
 * @author 1silv
 */
public class Exercicio3 {
    public static void main(String[] args) {
        int[][] numeros = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25},
        };
        
        int somaLinha3 = 0;
        int somaColuna4 = 0;
        int somaDiagonal1 = 0;
        int somaDiagonal2 = 0;
        int somaMatriz = 0;
        
        for(int i = 0; i < numeros.length; i++){
            somaLinha3 += numeros[2][i];
        }
        System.out.println("Soma da linha 3 :" +  somaLinha3);
        
       for(int i = 0; i < numeros.length; i++){
           somaColuna4 += numeros[i][3];
       }
        System.out.println("Soma da coluna 4:" + somaColuna4);
        
        for(int i = 0; i < numeros.length; i++){
            somaDiagonal1 += numeros[i][i];
        }
        System.out.println("Soma da diagonal: " + somaDiagonal1);
        
        for(int i = 0; i < numeros.length; i++){
            somaDiagonal2 += numeros[i][numeros.length - 1 - i];
        }
        System.out.println("Soma da diagonal invertida " + somaDiagonal2);
        
        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros.length; j++){
                somaMatriz += numeros[i][j];
            }
        }
        System.out.println("A soma de tudo na matriz é: " + somaMatriz);
    }
    
}
