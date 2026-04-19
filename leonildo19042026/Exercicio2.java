/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leonildo19042026;

/**
 *
 * @author 1silv
 */
public class Exercicio2 {
    public static void main(String[] args) {
        int[][] numeros ={
        {1,2,3},
        {4,5,6},
        {7,8,9},
    }; 
    int somaColuna = 0;
    
    for(int i = 0; i < numeros.length; i++){
        somaColuna += numeros[i][2];
    }
        System.out.println("A soma da matriz e:" + somaColuna);
    }
}