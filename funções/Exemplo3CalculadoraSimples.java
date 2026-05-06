/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funções;

import java.util.Scanner;

/**
 *
 * @author luan.vpcastro
 */
public class Exemplo3CalculadoraSimples {
    
    public static int menu(){
            System.out.println("--- Menu ---");
            Scanner leia = new Scanner(System.in);
            
            int opcao;
            do{
              System.out.println("1 - adição\n2 - subtração\n3 - multiplicação\n4 - divisão");
            System.out.println("Opcao: (1-4)");
            opcao = leia.nextInt();
            if (opcao < 1 || opcao > 4){
                System.out.println("Digite uma opcao valida.");
            }
            } while (opcao < 1 || opcao > 4);
            return opcao; 
            
    }
    public static double entradaDados(){
        System.out.println("--- Entrada de Dados ---");
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um numero");
        double numero = leia.nextDouble();
        return numero;
    }
    
    public static double add(double n1, double n2){
        System.out.println("--- Adicao ---");
        return n1+n2;
    }
    public static double sub(double n1, double n2){
        System.out.println("--- Subtracao ---");
        return n1-n2;
    }
    public static double multi(double n1, double n2){
        System.out.println("--- Multiplicacao ---");
        return n1*n2;
    }
    public static double div(double n1, double n2){
        System.out.println("--- Divisao ---");
        return n1/n2;
    }
    
    public static void imprimir(double resultado){
        System.out.println("--- Imprimir ---");
        System.out.println("O resultado foi => " + resultado);
    }
    
    public static double controlador(int opcao, double n1, double n2){
        System.out.println("--- Controlador ---");
        
        double resultado;
        switch(opcao){
            case 1:
                resultado = add(n1, n2);
                break;
            case 2:
                resultado = sub(n1,n2);
                break;
            case 3:
                resultado = multi(n1,n2);
                break;
            case 4:
                resultado = div(n1,n2);
                break;
        }
        resultado = 0;
        return resultado;
    }
    
    public static void main(String[] args) {
        System.out.println("--- Main ---");
        
        int op = menu();
        double n1 = entradaDados();
        double n2 = entradaDados();
        double result = controlador(op, n1, n2);
        imprimir(result);
    }
}