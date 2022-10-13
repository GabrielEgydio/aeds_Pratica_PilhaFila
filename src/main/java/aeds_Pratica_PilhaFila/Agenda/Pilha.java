/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aeds_Pratica_PilhaFila.Agenda;

/**
 *
 * @author Gabriel_Egydio
 */
public class Pilha {
    private Agenda[] itens;
    private int	topo;
    private int tam_max;

    public Pilha(int n)	{
        itens = new Agenda[n];
        tam_max	= n;
        topo = 0;
    }
    
    public void	push(Agenda valor) {
        if (full()){
            increaseSize();
        }
        
        itens[topo] = valor;
        topo++;
    }
    
    private void increaseSize() {
        tam_max += tam_max;
        Agenda[] pilhaAumentada = new Agenda[tam_max];
        
        System.arraycopy(itens, 0, pilhaAumentada, 0, itens.length);
        
        itens = pilhaAumentada;
    }
    
    public void	pop() {
        topo--;
    }
    
    public Agenda top() {
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
}
