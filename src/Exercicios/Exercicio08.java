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
public class Exercicio08 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double preco1, preco2, preco3;
        
        System.out.println("Digite o preco do produto 1: ");
        preco1 = scan.nextDouble();
        System.out.println("Digite o preco do produto 2: ");
        preco2 = scan.nextDouble();
        System.out.println("Digite o preco do produto 3: ");
        preco3 = scan.nextDouble();
        
        if((preco1 < preco2) && (preco1 < preco3)){
            System.out.println("Comprar produto 1");
        }else if((preco2 < preco1) && (preco2 < preco3)){
            System.out.println("Comprar produto 2");
        }else{
            System.out.println("Comprar produto 3");
        }
    }
    
}
