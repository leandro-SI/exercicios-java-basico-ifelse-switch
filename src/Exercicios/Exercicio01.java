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
public class Exercicio01 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Digite o primeiro numero: ");
        num1 = scan.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = scan.nextInt();
        
        if(num1 > num2){
            System.out.println("Maior numero: " + num1);
        }else{
            System.out.println("Maior numero: " + num2);
        }
    }
}
