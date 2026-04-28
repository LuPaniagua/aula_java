/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;

import java.util.Scanner;

/**
 *
 * @author luan.vpcastro
 */
public class Exe2 {
    public static void main(String[] args) {
        // Luan Victor Paniagua Castro
        // Kauan Souza Felicíssimo
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Escolha um número");
        int num = leia.nextInt();
        
        int maior = num, menor = num;
        
        while(num > 0 )
        {
            System.out.println("Escreva mais números");
            num = leia.nextInt();
            
            if(num > maior)
            {
                maior = num;
            }
            else if(num < menor && num >= 0)
            {
                menor = num;
            }
        }
        
        System.out.println("O maior número é: " + maior + " e o menor é "+  menor);
    }
}
