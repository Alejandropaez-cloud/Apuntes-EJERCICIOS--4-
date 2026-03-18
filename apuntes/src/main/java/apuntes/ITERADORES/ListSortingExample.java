package apuntes.ITERADORES;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Ejemplos de ordenación de listas en Java.
 */
public class ListSortingExample {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(42);
        numeros.add(5);
        numeros.add(18);
        numeros.add(99);
        numeros.add(1);

        System.out.println("Original: " + numeros);

        // Orden natural (ascendente)
        Collections.sort(numeros);
        System.out.println("Orden natural (Collections.sort): " + numeros);

        // Orden inverso usando Collections.reverseOrder()
        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println("Orden inverso (Collections.reverseOrder): " + numeros);

        // Orden personalizado con Comparator
        numeros.sort(Comparator.naturalOrder());
        System.out.println("Orden natural (List.sort): " + numeros);

        // Orden personalizado por módulo 10 (ejemplo)
        numeros.sort(Comparator.comparingInt(n -> n % 10));
        System.out.println("Orden por módulo 10: " + numeros);

        // Ordenación estable vs inestable (listas simples como ArrayList usan un algoritmo estable)
        System.out.println("\nNota: ArrayList usa un algoritmo de ordenación estable.");
    }
}
