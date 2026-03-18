package apuntes.COLECCIONES;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Ejemplos de uso de List en Java.
 */
public class ListExample {

    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Ana"); // se permiten duplicados
        nombres.add("María");

        System.out.println("ArrayList (orden de inserción, permite duplicados): " + nombres);

        // Acceso por índice
        System.out.println("Elemento en índice 1: " + nombres.get(1));

        // Inserción en posición
        nombres.add(2, "Carlos");
        System.out.println("Después de insertar en posición 2: " + nombres);

        // Eliminar por índice y por objeto
        nombres.remove(0);
        nombres.remove("Ana");
        System.out.println("Después de eliminar elementos: " + nombres);

        // LinkedList como List (posición y cola)
        List<String> visitantes = new LinkedList<>();
        visitantes.add("Pedro");
        visitantes.add("Lucía");
        visitantes.add("Martín");

        System.out.println("LinkedList: " + visitantes);
    }
}
