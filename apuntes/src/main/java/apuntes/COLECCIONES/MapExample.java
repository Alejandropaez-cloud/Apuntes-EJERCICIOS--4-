package apuntes.COLECCIONES;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Ejemplos de uso de Map en Java.
 */
public class MapExample {

    public static void main(String[] args) {
        Map<String, Integer> puntuaciones = new HashMap<>();
        puntuaciones.put("Ana", 85);
        puntuaciones.put("Luis", 92);
        puntuaciones.put("María", 78);

        System.out.println("HashMap (no ordenado): " + puntuaciones);

        Map<String, Integer> ordenInsert = new LinkedHashMap<>();
        ordenInsert.put("Ana", 85);
        ordenInsert.put("Luis", 92);
        ordenInsert.put("María", 78);
        System.out.println("LinkedHashMap (orden de inserción): " + ordenInsert);

        Map<String, Integer> ordenClave = new TreeMap<>();
        ordenClave.putAll(puntuaciones);
        System.out.println("TreeMap (ordenado por clave): " + ordenClave);

        // Acceso por clave
        System.out.println("Puntuación de Luis: " + ordenClave.get("Luis"));

        // Iterar sobre entradas
        for (Map.Entry<String, Integer> entry : ordenClave.entrySet()) {
            System.out.printf("%s = %d\n", entry.getKey(), entry.getValue());
        }
    }
}
