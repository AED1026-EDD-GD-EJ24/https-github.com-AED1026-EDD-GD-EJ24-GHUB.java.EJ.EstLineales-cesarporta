package miPrincipal;

public class DemoListaCircular {
    public static void menu() throws PosicionIlegalException{
        System.out.println("************************");
        System.out.println("      LISTA CIRCULAR    ");
        System.out.println("************************");
        System.out.println();
        ListaCircular<Integer> lc = new ListaCircular<Integer>();
        lc.agregar(30);
        lc.agregar(40);
        lc.agregar(10);
        System.out.println("Mostrar elementos agregado:");
        System.out.println("Elemento 0: "+lc.getValor(0));
        System.out.println("Elemento 1: "+lc.getValor(1));
        System.out.println("Elemento 2 :"+lc.getValor(2));
        for (int i=0;i<=lc.getTamanio()-1;i++){
            System.out.println("Elemento "+i+":"+lc.getValor(i));

        }
        lc.insertar(50, 1);
        System.out.println("mostrar de nuevo todos los elementos:");
        for (int i=0;i<=lc.getTamanio()-1;i++){
            System.out.println("Elemento "+i+":"+lc.getValor(i));

        }
        lc.remover(0);
        System.out.println("mostrar de nuevo todos los elementos:");
        for (int i=0;i<=lc.getTamanio()-1;i++){
            System.out.println("Elemento "+i+":"+lc.getValor(i));

        }
        lc.remover(1);
        System.out.println("mostrar de nuevo todos los elementos:");
        for (int i=0;i<=lc.getTamanio()-1;i++){
            System.out.println("Elemento "+i+":"+lc.getValor(i));

        }

    }
    
}
