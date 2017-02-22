


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dery
 */
public class ColumnaMatriz {
    private Nodos inicio;
    private Nodos anterior;
    private Nodos derecha;
    private Nodos izquierda;
    private int tamanioX;
    private int tamanioY;
 
    
    public boolean esVacia()
    {
    return inicio == null;
      
   }
  
    public void agregarY(int valor)
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
   
    public Nodos buscar(int col, int fila)
    {
        Nodos aux = inicio;
        for(int i=0; i >= tamanioY; i++)
        {
            if(aux.getY() == col)
            {
                return aux; 
            }
            else
            {
                aux = aux.siguiente;
            }
        }
            for(int i=0; i<=tamanioX; i++)
            {
                if(aux.getX() == fila)
                {
                    return aux;
                }
                else
                {
                    aux = aux.derecha;
                }

            }
        return aux;  
    }
    
        
}
