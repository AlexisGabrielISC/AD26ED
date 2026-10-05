/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

import java.util.Iterator;
import java.util.NoSuchElementException;


/**
 *
 * @author paveg
 */
public class Lista<T> extends TDALista<T> implements Iterable<T> {

    @Override
    public void agregar(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);

        if (estaVacia()) { // Primer elemento de la cola
            primero = nuevoNodo;
            ultimo = nuevoNodo;
        } else { // Ya hay al menos un elemento en la cola
            ultimo.siguiente = nuevoNodo; // El último actual apunta al nuevo
            ultimo = nuevoNodo;           // El nuevo nodo ahora es el último oficial
        }

    }

    @Override
    public T quitar() throws ColaVaciaException {
        if (estaVacia()) {
            throw new ColaVaciaException();
        }

        T datoRetornado = (T) primero.dato; // Respaldamos el dato a devolver antes de perder  // la referencia
        primero = primero.siguiente;       // Avanzamos el primero al siguiente nodo

        // Si el primero pasa a ser null, la cola se vació por completo
        if (primero == null) {
            ultimo = null;
        }

        return datoRetornado;

    }

    @Override
    public T consultarPrimero() throws NoSuchElementException {
        if (estaVacia()) {
            throw new NoSuchElementException("Colección vacía");
        }

        return (T) primero.dato;
    }
    @Override
    public T consultarUltimo() throws NoSuchElementException {
        if (estaVacia()) {
            throw new NoSuchElementException("Colección vacía");
        }

        return (T) ultimo.dato;
    }

    @Override
    public boolean estaVacia() {
        if (primero == null) {
            return true;
        } else {
            return false;
        }
        //return primero==null;
    }

    @Override
    public Iterator<T> iterator() {
        return new IteradorLista<>(this);
    }

    @Override
    public int tamanio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
