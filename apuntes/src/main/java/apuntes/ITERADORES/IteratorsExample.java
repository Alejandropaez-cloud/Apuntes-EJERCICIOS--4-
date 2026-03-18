package apuntes.ITERADORES;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Ejemplos de uso de Iterator, ListIterator y for-each.
 */
public class IteratorsExample {

    public static void main(String[] args) {
        List<String> colores = new ArrayList<>();
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");

        System.out.println("-- Recorrido con for-each --");
        for (String color : colores) {
            System.out.println(color);
        }

        System.out.println("\n-- Recorrido con Iterator --");
        Iterator<String> iterator = colores.iterator();
        while (iterator.hasNext()) {
            String color = iterator.next();
            System.out.println(color);
        }

        System.out.println("\n-- Recorrido con ListIterator (adelante) --");
        ListIterator<String> listIterator = colores.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("\n-- Recorrido con ListIterator (atrás) --");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        System.out.println("\n-- Eliminando elementos con Iterator --");
        iterator = colores.iterator();
        while (iterator.hasNext()) {
            String color = iterator.next();
            if (color.equals("Verde")) {
                iterator.remove();
            }
        }
        System.out.println(colores);
    }
}
