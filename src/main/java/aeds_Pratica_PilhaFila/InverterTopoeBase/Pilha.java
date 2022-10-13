/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aeds_Pratica_PilhaFila.InverterTopoeBase;

/**
 *
 * @author Gabriel_Egydio
 */
public class Pilha {
    private int[] itens;
    private int	topo;
    private int tam_max;

    public Pilha(int n)	{
        itens = new int[n];
        tam_max	= n;
        topo = 0;
    }
    
    public void	push(int valor) {
        if (full()){
            increaseSize();
        }
        
        itens[topo] = valor;
        topo++;
    }
    
    private void increaseSize() {
        tam_max += tam_max;
        int[] pilhaAumentada = new int[tam_max];
        
        System.arraycopy(itens, 0, pilhaAumentada, 0, itens.length);
        
        itens = pilhaAumentada;
    }
    
    public void	pop() {
        topo--;
    }
    
    public int top() {
        return itens[topo - 1];
    }

    public boolean empty() {
        return (topo ==	0);
    }
    
    public boolean full() {
        return (topo ==	tam_max);
    }
    
    public int size() {
        return topo;
    }
    
    public void invert() { 
        int topoPilha = top();
        int basePilha = itens[0];
        
        itens[0] = topoPilha;
        itens[topo - 1] = basePilha;
    }
    
     public void print() { 
        for (int i = 0; i < itens.length; i++) {
            int item = itens[i];       
            System.out.println(item);
        }
    }
}