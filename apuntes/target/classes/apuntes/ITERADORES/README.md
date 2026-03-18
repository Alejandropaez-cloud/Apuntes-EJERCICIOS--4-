# Iteradores y ordenación de listas (Java)

Este directorio contiene recursos y ejemplos sobre cómo trabajar con **iteradores** en Java y cómo **ordenar listas** de distintas maneras.

## Contenido

- `README.md` - Esta guía general.
- `IteratorsExample.java` - Ejemplos de uso de `Iterator`, `ListIterator` y bucles `for-each`.
- `ListSortingExample.java` - Ejemplos de ordenación de listas usando `Collections.sort`, `List.sort` y `Comparator`.

---

## Conceptos clave

### Iteradores
- `Iterator<T>`: permite recorrer elementos de una colección de forma segura.
- `ListIterator<T>`: extiende `Iterator` con funcionalidades bidireccionales y modificación en tiempo de iteración.
- `for-each`: sintaxis simplificada para recorrer colecciones.

### Ordenación de listas
- `Collections.sort(lista)`: ordena usando el orden natural de los elementos.
- `Collections.sort(lista, comparator)`: ordena usando un comparador personalizado.
- `lista.sort(comparator)`: método en la interfaz `List` a partir de Java 8.
- Ordenación estable frente a inestable.

---

## ¿Cómo usar estos ejemplos?

1. Compila el proyecto Maven con `mvn compile`.
2. Ejecuta los ejemplos con `mvn exec:java -Dexec.mainClass="apuntes.ITERADORES.IteratorsExample"` (o la clase que prefieras).

> Nota: Si no tienes `exec-maven-plugin` configurado, puedes compilar y ejecutar con `javac`/`java` apuntando al classpath `target/classes`.
