
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
public class ListaDiccionario {
    
    private Nodos inicio;
    private Nodos anterior;
    private Nodos ultimo;
    private int tamanio;

    public ListaDiccionario() {
        this.inicio = null;
        this.anterior = null;
        this.tamanio = 0;
    }
    
    public boolean esVacia() {
        return (this.inicio == null);
    }

     public void agregarDiccionario(String valor){
        Nodos nuevo = new Nodos();
        Nodos temp =  new Nodos();
        nuevo.setDato(valor);
        temp = inicio;
        int y = 1;
        if (esVacia()) 
        {
            inicio = nuevo;
            inicio.setSiguiente(null);
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
            nuevo.setAnterior(inicio);
            
        }
        tamanio++;

    }


//Metodo para borrar al final de la lista.
    public Nodos borrarUltimo() {
        Nodos eliminar = null;
        if(esVacia()) {
            JOptionPane.showMessageDialog(null, "La lista se encuentra vacia");
            return null;
        }
        if(inicio == ultimo) {
            inicio = null;
            ultimo = null;
        }
        else {
            Nodos actual = inicio;
            while(actual.anterior != ultimo) {
                actual = actual.anterior;
            }
            eliminar = actual.anterior;
            actual.anterior = null;

            ultimo = actual;
        }
        this.tamanio--;
        return eliminar;
    }

//Metodo que imprime el tamaño de la lista.
    public void tamano() {
        JOptionPane.showMessageDialog(null, "El tamaño es:\n " + this.tamanio);
    }

//Metodo que imprime la lista y los valores ingresados.
    public void imprimir() {
        if(tamanio != 0) {
            Nodos temp = inicio;
            String str = "";
            for(int i = 0; i < this.tamanio; i++) {
                str = str + temp.dato + "\n";
                temp = temp.anterior;
            }
            JOptionPane.showMessageDialog(null, str);
        }
    }
}
