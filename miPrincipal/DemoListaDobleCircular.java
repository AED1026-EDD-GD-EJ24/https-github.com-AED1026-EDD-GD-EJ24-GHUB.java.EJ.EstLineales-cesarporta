package miPrincipal;

import miPrincipal.listaDoble.ListaDobleCircular;

public class DemoListaDobleCircular {

    public static void menu() throws PosicionIlegalException{
        System.out.println("*****************************");
        System.out.println("      LISTA DOBLE CIRCULAR    ");
        System.out.println("****************************");
        System.out.println();
        ListaDobleCircular<Integer> ldc = new ListaDobleCircular<Integer>();
        ldc.agregar(30);
        ldc.agregar(40);
        ldc.agregar(10);
        System.out.println("Mostrar elementos agregado:");
        System.out.println("Elemento 0: "+ldc.getValor(0));
        System.out.println("Elemento 1: "+ldc.getValor(1));
        System.out.println("Elemento 2 :"+ldc.getValor(2));
        for (int i=0;i<=ldc.getTamanio()-1;i++){
            System.out.println("Elemento "+i+":"+ldc.getValor(i));

        }
        ldc.insertar(50, 1);
        System.out.println("mostrar de nuevo todos los elementos:");
        for (int i=0;i<=ldc.getTamanio()-1;i++){
            System.out.println("Elemento "+i+":"+ldc.getValor(i));

        }
        ldc.remover(0);
        System.out.println("mostrar de nuevo todos los elementos:");
        for (int i=0;i<=ldc.getTamanio()-1;i++){
            System.out.println("Elemento "+i+":"+ldc.getValor(i));

        }
        ldc.remover(1);
        System.out.println("mostrar de nuevo todos los elementos:");
        for (int i=0;i<=ldc.getTamanio()-1;i++){
            System.out.println("Elemento "+i+":"+ldc.getValor(i));

        }

    }
    
}
