/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;

import java.util.Scanner;

/**
 *
 * @author luan.vpcastro
 */
public class Exe1 {
    public static void main(String[] args) {
        // Luan Victor Paniagua Castro
        // Kauan Souza Felicíssimo 
        Scanner leia = new Scanner(System.in);
        
        double gas = 5.79;
        double eta = 3.65;
        double resultado = 0;
        double descontado = 0;
        
        System.out.println("Qual combustível você quer abastecer? (1 é etanol e 2 para gasolina");
        int combus = leia.nextInt();
        
        
        while (combus != 3){
        switch(combus){
            case 1:
                System.out.println("Quantos litros de etanol você quer abastecer ?");
                int litro = leia.nextInt();
                if(litro >= 1 && litro <= 5){
                    resultado = litro * eta;
                    System.out.printf("O valor deu => %.2f" ,resultado);
                } else if (litro > 5){
                    resultado = litro * eta;
                    descontado = resultado - (resultado * 0.05);
                    System.out.printf("O valor deu => %.2f " , descontado);
                } else {
                    System.out.println("Escolha um número maior que 0");
                }
                break;
                case 2:
                System.out.println("Quantos litros de gasolina você quer abastecer ?");
                litro = leia.nextInt();
                if(litro >= 1 && litro <= 10){
                    resultado = litro * gas;
                    descontado = resultado -(resultado * 0.05);
                    System.out.printf("O valor deu => %.2f " , descontado);
                } else if (litro > 10){
                    resultado = litro * gas;
                    descontado =resultado - (resultado * 0.07);
                    System.out.printf("O valor deu => %.2f" , descontado);
                } else {
                    System.out.println("Escolha um número maior que 0");
                }
                break;
                case 4:
                case 5:    
                case 6:
                case 7:
                case 8:
                case 9:
                case 0:
                    System.out.println("Escolha uma opção válida");
                    break;
                    
                    
        }
        System.out.println("\nQuer refazer um novo reabastecimento(1 para etanol , 2 para gasolina e 3 para cancelar");
                    combus = leia.nextInt();
        }
        
    }
}
