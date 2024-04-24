package miPrincipal;

import miPrincipal.listaDoble.ListaDoblementeEnlazada;

public class DemoListaDobleLigada {
    public static void menu() throws PosicionIlegalException{
        System.out.println("***********************");
        System.out.println(" LISTA DOBLE ENLAZADA ");
        System.out.println("***********************");
        System.err.println();
        ListaDoblementeEnlazada<Integer> listaDoble = new ListaDoblementeEnlazada<Integer>();
        listaDoble.agregar(30);
        listaDoble.agregar(40);
        listaDoble.agregar(10);
        System.out.println("Mostrar elementos agregado:");
        System.out.println("Elemento 0: "+listaDoble.getValor(0));
        System.out.println("Elemento 1: "+listaDoble.getValor(1));
        System.out.println("Elemento 2 :"+listaDoble.getValor(2));
        for (int i=0;i<=listaDoble.getTamanio()-1;i++){
            System.out.println("Elemento "+i+":"+listaDoble.getValor(i));

        }
        listaDoble.insertar(50, 1);
        System.out.println("mostrar de nuevo todos los elementos:");
        for (int i=0;i<=listaDoble.getTamanio()-1;i++){
            System.out.println("Elemento "+i+":"+listaDoble.getValor(i));

        }
        listaDoble.remover(0);
        System.out.println("mostrar de nuevo todos los elementos:");
        for (int i=0;i<=listaDoble.getTamanio()-1;i++){
            System.out.println("Elemento "+i+":"+listaDoble.getValor(i));

        }
        listaDoble.remover(1);
        System.out.println("mostrar de nuevo todos los elementos:");
        for (int i=0;i<=listaDoble.getTamanio()-1;i++){
            System.out.println("Elemento "+i+":"+listaDoble.getValor(i));

        }

    }
}
