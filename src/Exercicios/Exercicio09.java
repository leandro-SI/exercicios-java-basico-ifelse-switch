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
public class Exercicio09 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3;
        
        System.out.println("Digite o primeiro numero: ");
        num1 = scan.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = scan.nextInt();
        System.out.println("Digite o terceiro numero: ");
        num3 = scan.nextInt();
        
        if(num1 > num2 && num2 > num3){
            System.out.println("Ordem: " + num1 + num2 + num3);
        }else if(num1 > num3 && num3 > num2){
            System.out.println("Ordem: " + num1 + num3 + num2);
        }else if(num2 > num1 && num1 > num3){
            System.out.println("Ordem: " + num2 + num1 + num3);
        }else if(num2 > num3 && num3 > num1){
            System.out.println("Ordem: " + num2 + num3 + num1);
        }else if(num3 > num1 && num1 > num2){
            System.out.println("Ordem: " + num3 + num1 + num2);
        }else if(num3 > num2 && num2 > num1){
            System.out.println("Ordem: " + num3 + num2 + num1);
        }
        
    }
    
}
