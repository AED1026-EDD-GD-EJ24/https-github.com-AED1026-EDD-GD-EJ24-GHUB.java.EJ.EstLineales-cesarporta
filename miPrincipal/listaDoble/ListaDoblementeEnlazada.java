package miPrincipal.listaDoble;

import miPrincipal.PosicionIlegalException;

public class ListaDoblementeEnlazada<T> {
    //Atributos 
    //primer nodo de la lista
    private Nodo<T> cabeza;
    // total de elementos en la lista
    private int tamanio;
    //Constructor por defecto
    public ListaDoblementeEnlazada(){
        cabeza= null;
        tamanio = 0;
    }
    //Devuelve el tamaño de la lista
    public int getTamanio() {
        return tamanio;
    }
    //Consulta si la lista esta vacia
    public boolean esVacia(){
        if (cabeza == null)
            return true;    
        else
            return false;  
    }
    //Agrega un nuevo nodo al final de la lista
    public void agregar(T valor){
        Nodo<T> nuevo = new Nodo<T>();
        nuevo.setValor(valor);
        if (esVacia()){
            cabeza = nuevo; 
        }else{  
            //agregar al final de la lista  
            Nodo<T> aux = cabeza;
            while(aux.getSiguiente()!=null){
                aux = aux.getSiguiente();
            }   
            aux.setSiguiente(nuevo);
            nuevo.setAnterior(aux);
        }
        tamanio++;

    }
    public void insertar(T valor, int pos) throws PosicionIlegalException{
        if(pos>=0 && pos<=tamanio){
            Nodo<T> nuevo = new Nodo<T>();
            nuevo.setValor(valor);
            //el nuevo nodo se inserta al inicio de la lista
            if(pos==0){
                nuevo.setSiguiente(cabeza);
                cabeza = nuevo;
            }
            else{
                //el nuevo nodo se inserta al final de la lista
                if(pos==tamanio){
                    Nodo<T> aux = cabeza;
                    while(aux.getSiguiente()!=null){
                        aux = aux.getSiguiente();
                    }
                    aux.setSiguiente(nuevo);
                }
                else{
                    //el nuevo nodo se inserta en cualquier posicion de la lista
                    Nodo<T> aux = cabeza;
                    for(int i=0; i<=pos-2; i++){
                        aux = aux.getSiguiente();
                    }
                    Nodo<T> siguiente = aux.getSiguiente();
                    aux.setSiguiente(nuevo);
                    nuevo.setSiguiente(siguiente);
                    nuevo.setAnterior(aux);
                    siguiente.setAnterior(nuevo);

                }
                
            }
            tamanio++;

        }
        else{
            throw new PosicionIlegalException();
        }
        
            
    }
    //Devueve el valor de una determinada posicion
    public T getValor(int pos) throws PosicionIlegalException{
        if(pos>=0 && pos<tamanio)
        {
            T valor;
            if(pos ==0){
                valor = cabeza.getValor();
                return valor;
            }
            else{
                Nodo<T> aux = cabeza;
                for(int i=0; i<=pos-1; i++){
                    aux = aux.getSiguiente();
                }
                valor = aux.getValor();

            }
            return valor;

        }
        else{
            throw new PosicionIlegalException();
        }
    }
    public void remover (int pos) throws PosicionIlegalException{
        if(pos>=0 && pos<tamanio){
            if (pos==0){
                //el nodo a eliminar esta en la primera posicion
                cabeza= cabeza.getSiguiente();
                cabeza.setAnterior(null);
                tamanio--;
            }
            //se elimina en medio y al final
            else{
                Nodo<T> aux = cabeza;
                for(int i=0;i<=pos-2;i++){
                    aux = aux.getSiguiente();
                }
                Nodo<T> prox = aux.getSiguiente();
                prox.getSiguiente().setAnterior(aux);
                aux.setSiguiente(prox.getSiguiente());
                
                tamanio--;
            }

        }
        else{
            throw new PosicionIlegalException();
        }
    }
    //elimina toda la lista
    public void limpiar(){
        cabeza=null;
        tamanio=0;

    }
}
