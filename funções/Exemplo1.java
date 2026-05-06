/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funções;

import java.util.Scanner;

/**
 *
 * @author luan.vpcastro
 */
public class Exemplo1 {
    
    public static void digaOla(String nome){
        for (int i =1; i <= 3; i++){
            System.out.println("Olá, " + nome);
        }
    }
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //Declarar função: public static <retorno> (void, int, float) <nome> () <= parâmetros {
        digaOla("Johnny");
        digaOla("Gyro");
        digaOla("Funny");
    }
}