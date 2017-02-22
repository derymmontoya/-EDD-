        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dery
 */
//LISTA CIRCULAR
public class ListaUsuario {

    private Nodos inicio;
    private Nodos ultimo;
    private int tamanio;

    
    public ListaUsuario(){
        inicio = null;
        ultimo = null;
        tamanio = 0;
    }
    
    public boolean esVacia(){
        return inicio == null;
    }
  
    public int Tamanio(){
        return tamanio;
    }
    
    public void agregarUsuario(String valor){
    
        Nodos nuevo = new Nodos();
        nuevo.setDato(valor);
        if (esVacia()) 
        {
            inicio = nuevo;
            ultimo = nuevo;  
            ultimo.setSiguiente(inicio);
        } 
        else
        {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
            ultimo.setSiguiente(inicio);
        }
        tamanio++;
    }
    
    public void eliminar(){
        inicio = null;
        ultimo = null;
        tamanio = 0;
    }  
     public void listar(){
        if (!esVacia()) {
            Nodos aux = inicio;
            int i = 0;
            System.out.print("-> ");
            do{
                System.out.print(i + ".[ " + aux.getValor() + " ]" + " ->  ");
                aux = aux.getSiguiente();
                i++;
            }while(aux != inicio);
        }
    }

    
}
    
