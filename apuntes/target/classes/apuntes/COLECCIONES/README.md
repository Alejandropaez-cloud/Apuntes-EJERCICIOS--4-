# Colecciones en Java: List, Set, Map, TreeMap, etc.

Este directorio contiene ejemplos y explicaciones sobre las principales colecciones de Java en el paquete `java.util`.

## Contenido

- `README.md` - Introducción y guía de uso.
- `ListExample.java` - Ejemplos de `List` (`ArrayList`, `LinkedList`) y operaciones comunes.
- `SetExample.java` - Ejemplos de `Set` (`HashSet`, `TreeSet`) y diferencias clave.
- `MapExample.java` - Ejemplos de `Map` (`HashMap`, `LinkedHashMap`, `TreeMap`).
- `TraversalsExample.java` - Ejemplos de recorrido de colecciones (for-each, iteradores).

---

## Conceptos clave

### List
- Ordenada y permite elementos duplicados.
- `ArrayList` es rápido en acceso aleatorio; `LinkedList` es eficiente en inserciones / eliminaciones en medio de la lista.

### Set
- No permite elementos duplicados.
- `HashSet` no ordenado; `TreeSet` ordenado y basado en árboles rojo-negro.

### Map
- Almacena pares clave-valor.
- `HashMap` no ordenado; `LinkedHashMap` mantiene el orden de inserción; `TreeMap` ordena por clave.

---

## Cómo usar estos ejemplos

1. Compila con `mvn compile`.
2. Ejecuta una clase con `mvn exec:java -Dexec.mainClass="apuntes.COLECCIONES.ListExample"` (u otra clase).