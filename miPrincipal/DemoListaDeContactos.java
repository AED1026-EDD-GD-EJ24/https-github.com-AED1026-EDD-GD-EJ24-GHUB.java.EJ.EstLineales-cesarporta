package miPrincipal;

public class DemoListaDeContactos {
    
    public static void menu() throws PosicionIlegalException  {
        System.out.println("************************");
        System.out.println("   LISTA DE CONTACTOS   ");
        System.out.println("************************");
        System.err.println();
        ListaDeContactos ldc = new ListaDeContactos();
        //agregamos algunos contactos
        ldc.agregarContactos("Fernando", "Castro", 
           "C11 No 12 Culiacan","fernandocastro@gmail.com", 
           "6677160732", "6677511511");

        ldc.agregarContactos("Maria Andrea","Vargas",
        " C11 No 705 Culiacan", "mariv@gmail.com",
        "6677121429","6677306142");

        ldc.agregarContactos("Carolina", "Sanchez",
        ",","carolsa@gmail.com", 
        "6677121212","6677982515");

        ldc.agregarContactos("Federica", "Cardenas", 
        ",", "fede@gmail.com",
        "6677161111","6677921456");

        Lista<Contacto> listado = ldc.mostrarTodosLosContactos();
        System.out.println("--- Listado después de la agregación ---");
        for(int i=0;i<listado.getTamanio();i++){
            System.out.println(listado.getValor(i));
        }
        if(ldc.eliminaContacto("Fernando", "Castro")){
            System.out.println("Contacto Eliminado");
        }

        listado = ldc.mostrarTodosLosContactos();
        System.out.println("--- Listado después de la eliminacion ---");
        for(int i=0;i<listado.getTamanio();i++){
            System.out.println(listado.getValor(i));
        }
        ldc.modificarContacto("Federica","Cardenas","laguna de viezca 705 culiacan",
        "fede@gmail.com","6677161111","6677921456");
        
        listado = ldc.mostrarTodosLosContactos();
        System.out.println("--- Listado después de la modificación ---");
        for(int i=0;i<listado.getTamanio();i++){
            System.out.println(listado.getValor(i));
        }

        //Agregar un contacto que ya existe

        if(ldc.agregarContactos("Maria Andrea","Vargas",
            " C11 No 705 Mazatlan", "mariv@gmail.com",
            "6677121429","6677306142"))
           System.out.println("Elemento Agregado");
        else
           System.out.println("No se pudo agregar");

        //eliminar un elemento que no existe
        if(ldc.eliminaContacto("Fernando", "Castro")){
            System.out.println("Contacto Eliminado");
        }

        //Modificar contacto que no existe, por lo tanto no se realiza
        ldc.modificarContacto("Federico","Cardenas","laguna de viezca 705 mazatlan",
        "fede@gmail.com","6677161111","6677921456");

        listado = ldc.mostrarTodosLosContactos();
        System.out.println("--- Listado después de la modificación ---");
        for(int i=0;i<listado.getTamanio();i++){
            System.out.println(listado.getValor(i));
        }

        Contacto con = ldc.buscarContacto("Maria Andrea", "Vargas");
        System.out.println("Elemento buscado = "+con);

        con = ldc.buscarContacto("Mario Andres", "Vargas");
        System.out.println("Elemento buscado = "+con);



        
    }
}
