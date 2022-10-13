/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aeds_Pratica_PilhaFila.FilasPareImpar;

import java.util.Scanner;

/**
 *
 * @author Gabriel_Egydio
 */
public class FilasPareImpar {
    private static final Pilha pilha1 = new Pilha(1); // Pares
    private static final Pilha pilha2 = new Pilha(1); // Impares
    
    public static void main(String[] args) {

        final Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            verificarNumero(input.nextInt());
        }
              
        System.out.println("Pilha Par");
        pilha1.print();
        
        System.out.println("Pilha Impar");
        pilha2.print();
    }  
    
    private static void verificarNumero(int numero) {
        if (numero % 2 == 0){
            pilha1.push(numero);
        }else{
            pilha2.push(numero);
        }
    }
}