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
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int inicio = 1;
        int numAnter = 0;
        
        while(inicio !=0){
            System.out.println("Digite um numero (digite 0 para parar)");
            inicio = leia.nextInt();
            numAnter = numAnter + inicio;
        }
        System.out.println(numAnter);
    }
}
