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
public class exercicio1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual número você quer saber a tabuada até o 10?");
        int num = leia.nextInt();
        
        for(int i = 0; i <= 10; i++){
            int resultado = num * i;
            System.out.println(num + " X " + i + " = " + resultado);
        }
        }
    }
