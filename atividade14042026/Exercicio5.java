/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgwhile.atividade14042026;

import java.util.Scanner;

/**
 *
 * @author luan.vpcastro
 */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int certo = 7;
        int tentativa = 0;
        System.out.println("Digite um número");
        int chute = leia.nextInt();
        
        if(chute != certo){
         while(chute != certo){
            System.out.println("ERROOOOOOU! Tente de novo");
            chute = leia.nextInt();
            tentativa++;
         }
        } else if(chute == certo){
            System.out.println("ACERTOU!");
        }
        System.out.println("Você levou " + tentativa + " tentativas");
    }
}