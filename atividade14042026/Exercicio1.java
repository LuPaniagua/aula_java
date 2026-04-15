/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgwhile;

import java.util.Scanner;

/**
 *
 * @author luan.vpcastro
 */
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Início:");
        int inicio = leia.nextInt();
        System.out.println("Fim:");
        int fim = leia.nextInt();
        int par = 0;
        int impar = 0;
        
        if(inicio == fim){
            System.out.println("Iguais");
        }
        
        while(inicio < fim){
            if(inicio%2==0){
                System.out.println("i e PAR : " + inicio);
                par++;
            } 
            inicio++;
        }    
        while (fim < inicio){
            if(fim%2!=0){
                System.out.println("i é ÍMPAR : " + fim);
                impar++;
            }
            
            fim++;
            
        }
        System.out.println("Quantidade de números pares: " + par);
        System.out.println("Quantidade de números primos: " + impar);
    }
    
}