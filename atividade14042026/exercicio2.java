/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgwhile.atividade14042026;

/**
 *
 * @author luan.vpcastro
 */
public class exercicio1 {
    public static void main(String[] args) {
        int inicio = 1; int soma = 1; int i = 1;
        
        while(i <= 100){
            inicio = inicio + soma;
            soma++;
            System.out.println(soma);
            i++;
        } 
        System.out.println(inicio);
    }
}
