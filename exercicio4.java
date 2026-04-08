/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ado4;

import java.util.Scanner;

/**
 *
 * @author luan.vpcastro
 */
public class exercicio4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Quantos alunos tem na turma?");
        int turma = leia.nextInt();
        
        float media, mediaTurma = 0;
        int notaTurma;
        for(int i = 1; i <= turma; i++){
            System.out.println("Qual o nome do aluno?");
            String nomeAluno = leia.next();
            System.out.println("Qual a nota 1?");
            int nota1 = leia.nextInt();
            System.out.println("Qual a nota 2?");
            int nota2 = leia.nextInt();
            
            media = (nota1 + nota2) / 2;
            notaTurma = nota1 + nota2;
            
            if(media >= 7){
                System.out.println(nomeAluno + " => Média: " + media + "=> Aprovado");
            } else if (media < 7){
                System.out.println(nomeAluno + " => Média:" + media + "=> Reprovado");
            } else {
                System.out.println("Erro");
            }
            
            mediaTurma = mediaTurma + media;
        }
        
        mediaTurma = mediaTurma / turma;
            System.out.println("Média da turma:" + mediaTurma);
    }
}
