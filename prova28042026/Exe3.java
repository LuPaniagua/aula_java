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
public class Exe3 {
    public static void main(String[] args) {
        // Luan Victor Paniagua Castro
        // Kauan Souza Felicíssimo
        Scanner leia = new Scanner(System.in);
        int escolha= 0;
        double liquido = 0;
        double liquota = 0;
        do{
            System.out.println("Qual o seu salário?");
            double sal = leia.nextDouble();
            
            if(sal <= 1903.98){
                System.out.printf("Você não paga imposto de renda. Seu salário é => %.2f " , sal);
            } else if (sal > 1903.98 && sal <= 2826.65){
                liquota = sal * 0.075;
                liquido = sal - liquota;
                System.out.printf("Com base no seu salário %.2f.\nVocê irá pagar R$%.2f de aliquota.\nO valor com desconto deu R$%.2f" , sal , liquota ,liquido);
            } 
             else if (sal > 2826.65 && sal <= 3751.05){
                liquota = sal * 0.15;
                liquido = sal - liquota;
                System.out.printf("Com base no seu salário %.2f.\nVocê irá pagar R$%.2f de aliquota.\nO valor com desconto deu R$%.2f" , sal , liquota ,liquido);
            } 
             else if (sal > 3751.05 && sal <= 4664.68 ){
                liquota = sal * 0.225;
                liquido = sal - liquota;
                System.out.printf("Com base no seu salário %.2f.\nVocê irá pagar R$%.2f de aliquota.\nO valor com desconto deu R$%.2f" , sal , liquota ,liquido);
            } 
             else if (sal > 4664.68){
                liquota = sal * 0.275;
                liquido = sal - liquota;
                System.out.printf("Com base no seu salário %.2f.\nVocê irá pagar R$%.2f de aliquota.\nO valor com desconto deu R$%.2f" , sal , liquota ,liquido);
            } 
            System.out.println("\nDeseja fazer um novo cálculo ou cancelar o processo? (1 para sim e qualquer número para não)");
             escolha = leia.nextInt();
        } while(escolha == 1);
}
}