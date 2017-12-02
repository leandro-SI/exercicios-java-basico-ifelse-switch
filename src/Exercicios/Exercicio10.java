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
public class Exercicio10 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        char turno = 0;
        
        System.out.println("Digite seu turno: M-matutino / V-vespertino ou N-noturno: ");
        turno = (char) scan.next().charAt(turno);
        
        switch(turno){
            case 'M':
                System.out.println("Bom Dia!");
                break;
            case 'V':
                System.out.println("Boa Tarde!");
                break;
            case 'N':
                System.out.println("Boa Noite!");
                break;
            default:
                System.out.println("Opcao Inválida!");
                break;
        }
        
    }
    
}
