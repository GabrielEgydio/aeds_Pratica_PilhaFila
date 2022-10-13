/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aeds_Pratica_PilhaFila.Agenda;

import java.util.Scanner;

/**
 *
 * @author Gabriel_Egydio
 */
public class RegistrosAgenda {
    private static final Scanner input = new Scanner(System.in);
    private static final Pilha agendas = new Pilha(1);
    
    public static void main(String[] args) {
        while(true) {
            int opcao = menu();
            
            switch(opcao) {
                case 0 -> System.exit(0);
                case 1 -> inserirItem();
                case 2 -> removerItem();
                case 3 -> imprimirTamanho();
                case 4 -> imprimirItemTopo();
            }            
        }
    }
    
    private static void inserirItem() {
        System.out.println("Inserir Item");
        
        System.out.print("Nome: ");
        String nome = input.next();
        System.out.println();
        
        System.out.print("Telefone: ");
        long telefone = input.nextLong();
        System.out.println();
        
        Agenda novoItem = new Agenda(nome, telefone);
        
        agendas.push(novoItem);
      
        System.out.println("Item cadastrado.");
        System.out.println();
    }
    
    private static void removerItem() {
        System.out.println("Remover Item");
        
        if(agendas.empty()) {
            System.out.println("Agenda vazia. Não é possível remover item.");
            System.out.println();
            return;
        }
        
        agendas.pop();
        
        System.out.println("Último item foi removido.");
        System.out.println();
    }
    
    private static void imprimirTamanho() {
        System.out.println("Imprimir Tamanho");
        
        if(agendas.empty()) {
            System.out.println("Agenda vazia. Não é possível imprimir item.");
            System.out.println();
            return;
        }
                
        System.out.println( "O tamanho é: " + agendas.size() + ".");        
        System.out.println();
    }
    
    private static void imprimirItemTopo() {
        System.out.println("Imprimir Item Topo");
        
        if(agendas.empty()) {
            System.out.println("Agenda vazia. Não é possível imprimir item.");
            System.out.println();
            return;
        }
        
        Agenda itemTopo = agendas.top();
        
        System.out.println("Item Topo:");
        System.out.println("Nome: " + itemTopo.nome);
        System.out.println("Telefone: " + itemTopo.tel);
        System.out.println();        
    }
    
    private static int menu() { 
        int opcao = -1;
        
        while (opcao < 0 || opcao > 4) {            
            System.out.println("PROGRAMA PILHA");
            System.out.println("0: Sair");
            System.out.println("1: Inserir Itens");
            System.out.println("2: Remover Itens");
            System.out.println("3: Imprimir Tamanho");
            System.out.println("4: Imprimir Item Topo");
            System.out.print("Entre com a opção desejada: ");
            
            opcao = input.nextInt();
            
            System.out.println();
        }
        
        return opcao;
    }
}
