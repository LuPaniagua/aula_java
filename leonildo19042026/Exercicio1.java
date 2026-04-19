/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leonildo19042026;

import java.security.SecureRandom;

/**
 *
 * @author 1silv
 */
public class Exercicio1 {
    public static void main(String[] args) {
        int[][] numeros ={
        {1,2,3},
        {4,5,6},
        {7,8,9},
    }; 
    int soma = 0;
    
    for(int i = 0; i < numeros.length; i++){
        for(int j = 0; j <numeros[0].length; j++){
                soma += numeros[i][j];
        }
    }
        System.out.println("A soma da matriz e:" + soma);
    }
}