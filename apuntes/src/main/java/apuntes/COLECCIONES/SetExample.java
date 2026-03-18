package apuntes.COLECCIONES;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Ejemplos de uso de Set en Java.
 */
public class SetExample {

    public static void main(String[] args) {
        Set<String> colores = new HashSet<>();
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");
        colores.add("Rojo"); // se ignora el duplicado

        System.out.println("HashSet (no garantiza orden, no permite duplicados): " + colores);

        Set<String> ordenado = new TreeSet<>();
        ordenado.add("Rojo");
        ordenado.add("Verde");
        ordenado.add("Azul");

        System.out.println("TreeSet (ordenado por orden natural): " + ordenado);

        // Verificar existencia
        System.out.println("Contiene 'Verde'? " + ordenado.contains("Verde"));

        // Eliminar elemento
        ordenado.remove("Azul");
        System.out.println("Después de eliminar 'Azul': " + ordenado);
    }
}
