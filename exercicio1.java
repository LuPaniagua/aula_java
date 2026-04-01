/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio;

import java.util.Scanner;

/**
 *
 * @author luan.vpcastro
 */
public class exercicio1 {
    public static void main(String[] args) {
        System.out.println("Digite um número entre 1 e 7");
        Scanner leia = new Scanner(System.in);
        int dia = leia.nextInt();
        
        switch(dia){
            case 1:
            case 7:
                System.out.println("É final de semana.");
            break;
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("É dia comercial.");
            break;
            default:
                System.out.println("Dia inválido.");
        }
        
    }
    
}
