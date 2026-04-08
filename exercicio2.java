/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ado4;

import java.util.Scanner;

/**
 *
 * @author luan.vpcastro
 */
public class exercicio2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        int num = leia.nextInt();
        
        for(int i = 1; i <= num; i++){
            if (i%2==0){
                int resultado = i + i + i;
                System.out.println("Este é o resultado" + resultado);
            }
        }
            
    }
}
