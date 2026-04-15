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
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Qual tabuada você deseja saber?");
        int tabuada = leia.nextInt();
        
        int base = 1;
        
        while(base <= 10){
            System.out.println("5 X " + base + " = " + tabuada*base);
            base++;
        }
        
    }
}
