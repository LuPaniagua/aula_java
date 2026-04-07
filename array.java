/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Scanner;

/**
 *
 * @author luan.vpcastro
 */
public class array {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        
        System.out.println("Quantas idades você quer saber?");
        int quantidade = leia.nextInt();
        int maior, menor;
        
//        Lendo as idades
        int[] idade = new int[quantidade];
        for (int i = 0; i < quantidade; i++){
        System.out.println("Digite a idade do aluno " + (i+1) + " =>");
        idade[i] = leia.nextInt();
        }
        
//   Identificar a maior e menor idade

            maior = idade[0];
            menor = idade[0];
            for(int i = 0; i < idade.length; i++){
                if (idade[i] > maior){
                    maior = idade[i]; 
                }
                if (idade[i] < menor){
                    menor = idade[i];
                }
            }
        
            System.out.println("A maior idade é => " + maior);
            System.out.println("A menor idade é => " + menor);
        
//        Imprimindo as idades
        for (int i = 0; i < quantidade; i++){
            System.out.println("A idade do aluno é => " + idade[i]);
        }
    }
}