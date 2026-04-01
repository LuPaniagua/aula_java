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
public class exercicio3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in); 
        
        System.out.println("Digite o código do produto");
        int codigo = leia.nextInt();
        
        
        switch(codigo){
            case 1:
                System.out.println("Alimento não-perecível.");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Alimento perecível.");
                break;
            case 5:
            case 6:
                System.out.println("Vestuário.");
                break;
            case 7:
                System.out.println("Higiene pessoal.");
                break;
            default:
                
                System.out.println("Digite um código válido.");
        }
    }
}
