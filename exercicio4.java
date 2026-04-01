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
public class exercicio4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o número da placa");
        int placa = leia.nextInt();
        System.out.println("Qual dia da semana é? 1 = Segunda, 2 = terça, 3 = quarta, 4 = quinta, 5 = sexta");
        int dia = leia.nextInt();
        
        switch(dia) {
        case 1:
            if (placa == 1 || placa == 2){
                System.out.println("O veículo não pode circular hoje");
            } else {
                System.out.println("Seu veículo está permitido circular hoje.");
        } break;
        case 2:
            if (placa == 3 || placa == 4){
                System.out.println("O veículo não pode circular hoje");
            } else {
                System.out.println("Seu veículo está permitido circular hoje.");
        } break;
        case 3:
            if (placa == 5 || placa == 6){
                System.out.println("O veículo não pode circular hoje");
            } else {
                System.out.println("Seu veículo está permitido circular hoje.");
        } break;
        case 4:
            if (placa == 7 || placa == 8){
                System.out.println("O veículo não pode circular hoje");
            } else {
                System.out.println("Seu veículo está permitido circular hoje.");
        } break;
        case 5:
            if (placa == 9 || placa == 0){
                System.out.println("O veículo não pode circular hoje");
            } else {
                System.out.println("Seu veículo está permitido circular hoje.");
        } break;
    }
        
    }
}
