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
public class Exercicio03 {
    
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         
         char letra;
         
         System.out.println("Digite seu sexo -> F(feminino) ou M(masculino): ");
         letra = (char) scan.next().charAt(0);
         
         switch(letra){
             
             case 'F': System.out.println("Sexo Feminino!"); break;
             case 'M': System.out.println("Sexo Masculino!"); break;
             default: System.out.println("Sexo inválido!"); break;
        }
    }
}
