/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dery
 */
public class FichasCola {
   private Nodos inicio;
    private Nodos anterior;
    private int tamanioX;
    private int tamanioY;
 
    
    public boolean esVacia()
    {
    return inicio == null;
      
   }
  
    public void ingresarFicha(int valor)
    {
    
        Nodos nuevo = new Nodos();
        Nodos temp =  new Nodos();
        nuevo.setValor(valor);
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
        tamanioY++;
        
    }
    public void sacarficha(int ficha)
    {
        Nodos aux = inicio;
        for(int i=0; i >= tamanioY; i++)
        {
            if(aux == inicio)
            {
                aux.siguiente=inicio;
                inicio=null;
            }
        }
      
    }
    
    
    
    
}
