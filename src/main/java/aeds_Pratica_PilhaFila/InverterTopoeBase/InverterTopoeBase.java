/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aeds_Pratica_PilhaFila.InverterTopoeBase;

/**
 *
 * @author Gabriel_Egydio
 */
public class InverterTopoeBase {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(3);
        
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        
        System.out.println("Pilha com Topo e Base normais:");
        pilha.print();
        
        pilha.invert();
        
        System.out.println("Pilha com Topo e Base INVERTIDOS:");
        pilha.print();
    }
}