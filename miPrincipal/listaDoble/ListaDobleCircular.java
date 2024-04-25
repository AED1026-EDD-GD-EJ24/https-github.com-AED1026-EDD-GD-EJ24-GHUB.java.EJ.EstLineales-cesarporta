package miPrincipal.listaDoble;

import miPrincipal.PosicionIlegalException;

public class ListaDobleCircular<T> {
    //Atributos 
    //primer nodo de la lista
    private Nodo<T> cabeza;
    // total de elementos en la lista
    private int tamanio;
    //Constructor por defecto
    public ListaDobleCircular(){
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
            //enlazar anterior y siguiente consigo misma
            cabeza.setSiguiente(cabeza);
            cabeza.setAnterior(cabeza);

        }else{  
            //agregar al final de la lista
            Nodo<T> ultimo = cabeza.getAnterior();
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo); 
            //Enlazar ultimo con el primero y el primero con el ultimo
            nuevo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevo);
            
        }
        tamanio++;

    }
    public void insertar(T valor, int pos) throws PosicionIlegalException{
        if(pos>=0 && pos<=tamanio){
            Nodo<T> nuevo = new Nodo<T>();
            nuevo.setValor(valor);
            //el nuevo nodo se inserta al inicio de la lista
            if(pos==0){
                Nodo<T> ultimo = cabeza.getAnterior();
                nuevo.setSiguiente(cabeza);
                cabeza.setAnterior(nuevo);
                cabeza = nuevo;
                //enlazar primero con el ultimo y ultimo con primero
                nuevo.setAnterior(ultimo);
                ultimo.setAnterior(cabeza);
            }
            else{
                //el nuevo nodo se inserta al final de la lista
                if(pos==tamanio){
                    Nodo<T> ultimo = cabeza.getAnterior();
                    ultimo.setSiguiente(nuevo);
                    //Enlazar primero con el ultimo y ultimo con el primero
                    nuevo.setSiguiente(cabeza);
                    cabeza.setAnterior(nuevo);
                   
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
                Nodo<T> ultimo = cabeza.getAnterior();
                cabeza= cabeza.getSiguiente();
                //enlazatr primero con ultimo y ultimo con primero
                cabeza.setAnterior(ultimo);
                ultimo.setSiguiente(cabeza);
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
