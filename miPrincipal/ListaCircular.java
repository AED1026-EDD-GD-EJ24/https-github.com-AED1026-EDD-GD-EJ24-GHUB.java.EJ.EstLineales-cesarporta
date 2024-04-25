package miPrincipal;

public class ListaCircular<T> {
    //Atributos 
    //primer nodo de la lista
    private Nodo<T> cabeza;
    // total de elementos en la lista
    private int tamanio;
    //Constructor por defecto
    public ListaCircular(){
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
            //Como hay un solo nodo, el siguiente apunta al mismo nodo
            nuevo.setSiguiente(nuevo);
            cabeza = nuevo; 
        }else{  
            //agregar al final de la lista  
            Nodo<T> aux = cabeza;
            while(aux.getSiguiente()!=cabeza){
                aux = aux.getSiguiente();
            }   
            aux.setSiguiente(nuevo);
            //Enlaza el ultimo nodo con el primero
            nuevo.setSiguiente(cabeza);
        }
        tamanio++;

    }
    public void insertar(T valor, int pos) throws PosicionIlegalException{
        if(pos>=0 && pos<=tamanio){
            Nodo<T> nuevo = new Nodo<T>();
            nuevo.setValor(valor);
            //el nuevo nodo se inserta al inicio de la lista
            if(pos==0){
                //buscar el ultimo
                Nodo<T> ultimo = cabeza;
                while(ultimo.getSiguiente() != cabeza){
                    ultimo = ultimo.getSiguiente();
                }

                nuevo.setSiguiente(cabeza);
                cabeza = nuevo;
                //enlazar el utimo con el primero
                ultimo.setSiguiente(cabeza);
            }
            else{
                //el nuevo nodo se inserta al final de la lista
                if(pos==tamanio){
                    Nodo<T> aux = cabeza;
                    while(aux.getSiguiente()!=cabeza){
                        aux = aux.getSiguiente();
                    }
                    aux.setSiguiente(nuevo);
                    //enlazar el ultimo con el primero
                    nuevo.setSiguiente(cabeza);
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
                //Buscar el ultimo nodo para enlazarlo
                Nodo<T> ultimo = cabeza;
                while(ultimo.getSiguiente() !=cabeza){
                    ultimo= ultimo.getSiguiente();
                }
                //dezplazamos la cabeza al siguiente nodo
                cabeza= cabeza.getSiguiente();
                //Enlazar el ultimo con la nueva cabeza
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
