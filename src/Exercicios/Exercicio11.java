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
public class Exercicio11 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double salario, aumento, porcentual;
        
        System.out.println("Digite seu salário: ");
        salario = scan.nextDouble();
        
        if(salario < 280){
            aumento = (salario * 0.20);
            porcentual = 20;
        }else if(salario >= 280 && salario < 700){
            aumento = (salario * 0.15);
            porcentual = 15;
        }else if(salario >= 700 && salario < 1500){
            aumento = (salario * 0.10);
            porcentual = 10;
        }else{
            aumento = (salario * 0.05);
            porcentual = 5;
        }
        
        System.out.println("Salario antes do reajuste: " + salario);
        System.out.println("Porcentual do aumento aplicado: " + porcentual + "%");
        System.out.println("Valor do aumento: " + aumento);
        System.out.println("Salário após aumento: " + (salario + aumento));
        
    }
    
}
