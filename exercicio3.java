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
public class exercicio3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        int num = leia.nextInt();
        
        for(int i = num; num >= 0; num--){
            System.out.println(num);
        }
    }
}
