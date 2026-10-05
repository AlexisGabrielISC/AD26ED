/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

import java.util.Iterator;

/**
 *
 * @author paveg
 */
public class IteradorLista<T> implements Iterator<T>{
    private TDALista.Nodo actual;
    
    public IteradorLista(Lista<T> lista){
        actual=lista.primero;
    }
    
    @Override
    public boolean hasNext() {
        //return actual.siguiente!=null;
        return actual!=null;
    }

    @Override
    public T next() {
        T valor=(T)actual.dato;
        actual=actual.siguiente;
        return valor;
    }
    
}
