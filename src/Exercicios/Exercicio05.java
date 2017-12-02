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
public class Exercicio05 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double nota1, nota2, media;
        
        System.out.println("Digite a primeira nota: ");
        nota1 = scan.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = scan.nextDouble();
        media = ((nota1 + nota2) / 2);
        
        if(media >= 7){
            System.out.println("Aprovado!");
        }else if(media < 7){
            System.out.println("Reprovado!");
        }else if(media == 10){
            System.out.println("Aprovado com Distinção");
        }
  
    }
    
}
