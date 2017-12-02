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
public class Exercicio07 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3;
        
        System.out.println("Digite o primeiro numero: ");
        num1 = scan.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = scan.nextInt();
        System.out.println("Digite o terceiro numero: ");
        num3 = scan.nextInt();
        
         if(num1 > num2 && num1 > num3){
            System.out.println("Numero maior: " + num1);
        }else if(num2 > num1 && num2 > num3){
            System.out.println("Numero maior: " + num2);
        }else{
            System.out.println("Numero maior: " + num3);
        }
         
         if(num1 < num2 && num1 < num3){
             System.out.println("Numero menor: " + num1);
         }else if(num2 < num1 && num2 < num3){
             System.out.println("Numero menor: " + num2);
         }else{
             System.out.println("Numero menor: " + num3);
         }
        
    }
}
