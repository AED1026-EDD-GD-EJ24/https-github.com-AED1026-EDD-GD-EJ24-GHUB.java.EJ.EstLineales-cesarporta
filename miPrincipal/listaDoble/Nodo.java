package miPrincipal.listaDoble;

public class Nodo<T>{
    //Atributo valor de tipo T. Almacena la referencia al objeto que se
    // guarda en el Nodo
    private T valor;
    //Referencia al siguient Nodo Enlazado
    private Nodo<T> siguiente;
    private Nodo<T> anterior;
    //Constructor por defectp
    public Nodo(){
        valor = null;
        siguiente = null;
        anterior = null;
    }
    //Devuelve el valor
    public T getValor(){
        return valor;

    }
    //Modifica el valor
    public void setValor(T valor){
        this.valor = valor;
    }
    //Devuelve el atributo siguiente
    public Nodo<T> getSiguiente(){
        return siguiente;
    }
    //Modifica el atributo siguiente
    public void setSiguiente(Nodo<T> siguiente){
        this.siguiente = siguiente;
    }
    public Nodo<T> getAnterior() {
        return anterior;
    }
    public void setAnterior(Nodo<T> anterior) {
        this.anterior = anterior;
    }
    
    
    
}
