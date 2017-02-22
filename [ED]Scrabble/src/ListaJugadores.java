

import java.applet.Applet;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Format;
import javax.swing.JOptionPane;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dery
 */
public class ListaJugadores {
    

    private Nodos primero;
    private Nodos ultimo;
    private int tamano;

    public ListaJugadores() {
        this.primero = null;
        this.ultimo = null;
        this.tamano = 0;
    }
    
    public boolean esVacia() {
        return (this.primero == null);
    }
    
    public void agregarFicha(String valor){
         Nodos nuevo = new Nodos();
        Nodos temp =  new Nodos();
        nuevo.setDato(valor);
        temp = primero;
        int y = 1;
        if (esVacia()) 
        {
            primero = nuevo;
            primero.setSiguiente(null);
            y++;
        } 
        else
        {
            while(temp.siguiente!=null)
            {
                temp = temp.siguiente;
                y++;
            }
            temp.setSiguiente(nuevo);
            nuevo.setSiguiente(null);
            nuevo.setAnterior(primero);
            
        }
        this.tamano++;
    }


//Metodo para borrar al final de la lista.
    public Nodos borrarUltimo() {
        Nodos eliminar = null;
        if(esVacia()) {
            JOptionPane.showMessageDialog(null, "La lista se encuentra vacia");
            return null;
        }
        if(primero == ultimo) {
            primero = null;
            ultimo = null;
        }
        else {
            Nodos actual = primero;
            while(actual.anterior != ultimo) {
                actual = actual.anterior;
            }
            eliminar = actual.anterior;
            actual.anterior = null;

            ultimo = actual;
        }
        this.tamano--;
        return eliminar;
    }

//Metodo que imprime el tamaño de la lista.
    public void tamano() {
        JOptionPane.showMessageDialog(null, "El tamaño es:\n " + this.tamano);
    }

//Metodo que imprime la lista y los valores ingresados.
    public void imprimir() {
        if(tamano != 0) {
            Nodos temp = primero;
            String str = "";
            for(int i = 0; i < this.tamano; i++) {
                str = str + temp.dato + "\n";
                temp = temp.anterior;
            }
            JOptionPane.showMessageDialog(null, str);
        }
    }
    public void graficar() throws IOException
    {
        String ruta = "/home/dery/NetBeansProjects";
        
    }
}
    


