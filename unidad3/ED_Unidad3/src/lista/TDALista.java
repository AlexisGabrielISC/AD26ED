/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;


import java.util.NoSuchElementException;


/**
 *
 * @author paveg
 */
public abstract class TDALista<T>  {
    Nodo<T> primero;
    Nodo<T> ultimo;
            
    public abstract void agregar(T dato);
    public abstract T quitar() throws ColaVaciaException;
    public abstract T consultarPrimero() throws NoSuchElementException;
    public abstract T consultarUltimo() throws NoSuchElementException;
    public abstract int tamanio();
    public abstract boolean estaVacia();
    
    class Nodo<T>{
        T dato;
        Nodo<T> siguiente;
        Nodo<T> anterior;
        
        public Nodo(T dato){
            this.dato=dato;
        }
    }
}
