/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dery
 */
public class Nodos {
    Nodos anterior;
    Nodos siguiente;
    Nodos izquierda;
    Nodos derecha;
    String dato;
    int dato1;
    int x;
    int y;
    
    
    public void Nodo (String dato)
    {
       this.dato = dato;
       this.anterior = null;
       this.siguiente = null;
    }
    
    public String getDato() {
        return dato;
    }

    public void setDato(String valor) {
        this.dato = valor;
    }

    public int getValor() {
        return dato1;
    }

    public void setValor(int valor) {
        this.dato1 = valor;
    }

    public Nodos getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodos siguiente) {
        this.siguiente = siguiente;
    }

    public Nodos getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodos izquierda) {
        this.izquierda = izquierda;
    }

    public Nodos getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodos derecha) {
        this.derecha = derecha;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Nodos getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodos anterior) {
        this.anterior = anterior;
    }

    
}
