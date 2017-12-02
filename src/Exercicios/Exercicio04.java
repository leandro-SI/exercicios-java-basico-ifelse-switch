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
public class Exercicio04 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        char letra;
        
        System.out.println("Digite uma letra: ");
        letra = (char) scan.next().charAt(0);
        
        switch(letra){
            
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Letra digitada é vocal");
                break;
            default:
                 System.out.println("Letra digitada é consoante");
                break;
        }
        
    }
}
