package apuntes.COLECCIONES;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Ejemplos de recorrido de colecciones usando diferentes técnicas.
 */
public class TraversalsExample {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("uno");
        lista.add("dos");
        lista.add("tres");

        Set<String> conjunto = new HashSet<>(lista);

        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("A", 1);
        mapa.put("B", 2);

        System.out.println("-- Recorrido con for-each (List) --");
        for (String elemento : lista) {
            System.out.println(elemento);
        }

        System.out.println("\n-- Recorrido con Iterator (Set) --");
        Iterator<String> it = conjunto.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\n-- Recorrido de Map (entrySet) --");
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue());
        }

        System.out.println("\n-- Recorrido de Map (keySet) --");
        for (String clave : mapa.keySet()) {
            System.out.println(clave + " = " + mapa.get(clave));
        }
    }
}
