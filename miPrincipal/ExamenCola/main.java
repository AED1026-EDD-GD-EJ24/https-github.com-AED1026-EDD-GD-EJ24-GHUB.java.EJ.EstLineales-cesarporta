import java.util.LinkedList;
import java.util.Queue;

class Estudiante {
    private int id;
    private String nombres;
    private String apellidos;

   
    public Estudiante(int id, String nombres, String apellidos) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

  
    public int getId() {
        return id;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }
}

public class main {
    public static void main(String[] args) {
        // Creamos una cola para almacenar los objetos tipo Estudiante
        Queue<Estudiante> cola = new LinkedList<>();

        // ingresamoslosestudiantes a lacola estudiantes a la cola
        cola.add(new Estudiante(1, "Cesar", "Almazan"));
        cola.add(new Estudiante(2, "Arturo", "Peña"));
        cola.add(new Estudiante(3, "Maria", "Zamora"));

        // aqui mostramos el contenido de cada objeto en la cola
        System.out.println("Contenido de la cola:");
        for (Estudiante estudiante : cola) {
            System.out.println("ID: " + estudiante.getId() + ", Nombres: " + estudiante.getNombres() + ", Apellidos: " + estudiante.getApellidos());
        }

        // esto elimina los elementos de la cola hasta que esté vacía
        while (!cola.isEmpty()) {
            Estudiante estudianteEliminado = cola.poll();
            System.out.println("Eliminado de la cola - ID: " + estudianteEliminado.getId() + ", Nombres: " + estudianteEliminado.getNombres() + ", Apellidos: " + estudianteEliminado.getApellidos());
        }

        // aqui se comprueba que cola esta vacia
        if (cola.isEmpty()) {
            System.out.println("La cola esta vacia.");
        } else {
            System.out.println("La cola no esta vacia.");
        }
    }
}
