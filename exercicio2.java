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
public class exercicio2 {
    public static void main(String[] args) {
     Scanner leia = new Scanner(System.in);
     
        System.out.println("Digite um número para saber a estação");
        int estacao = leia.nextInt();
        
        switch(estacao){
            case 12:
            case 1:
            case 2:
                System.out.println("A estação é verão!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("A estação é outono!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("A estação é inverno!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("A estação é primavera!");
                break;
            default:
                System.out.println("Mês inválido.");
                
        }
    }
}
