/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

import java.util.Scanner;

/**
 *
 * @author Leandro
 */
public class Exercicio02 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int valor;
        
        System.out.println("Digite um valor: ");
        valor = scan.nextInt();
        
        if(valor > 0){
            System.out.println("Valor positivo!");
        }else{
            System.out.println("Valor negativo");
        }
    }
}
