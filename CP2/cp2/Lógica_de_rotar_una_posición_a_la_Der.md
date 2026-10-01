# Ejercicio 2: Rotar una lista simplemente enlazada a la derecha

## 1. Idea general

Se tienen tres punteros principales para realizar la rotación de una posición:

| Puntero | Función |
|---|---|
| `inicio` | Referencia al primer nodo de la lista (cabecera). Al final, deberá actualizarse. |
| `ultimo` | Recorre la lista hasta localizar el último nodo, que será el nuevo inicio. |
| `anterior` | Nodo inmediato anterior a `ultimo`; permite desenlazar el último nodo de su posición original. |

La operación consiste en tomar el último nodo de la lista, desenlazarlo de su posición actual y colocarlo al principio, haciendo que apunte al antiguo `inicio`.

---

## 2. Detalles clave y lógica incorporada

1. **Orden crítico de las asignaciones de punteros**  
   Al encontrar el último nodo, se deben ejecutar dos asignaciones en un orden estricto:
   ```pseudo
   anterior.siguiente = ultimo.siguiente  // (que es null)
   ultimo.siguiente = inicio
   ```
   Si se invirtiera este orden (`ultimo.siguiente = inicio` primero), el último nodo apuntaría al inicio, y al ejecutar luego `anterior.siguiente = ultimo.siguiente`, el penúltimo nodo apuntaría también al inicio, creando un ciclo infinito y perdiendo el resto de la lista.

2. **Actualización de la cabecera**  
   Una vez que el último nodo ha sido reubicado al principio, el puntero `inicio` debe actualizarse fuera del ciclo para que apunte a `ultimo`.

3. **Considerar casos borde**
   - Lista vacía: `inicio == null`.
   - Lista con un solo nodo: `inicio.siguiente == null` (no hay rotación posible).

---

## 3. Pseudocódigo corregido

```pseudo
SI (inicio == null) ENTONCES
    RETORNAR // "NO SE PUEDE HACER"
FIN SI

anterior = inicio
ultimo = inicio.siguiente

SI (ultimo == null) ENTONCES
    RETORNAR // "SOLO SE TIENE UN NODO"
FIN SI

CICLO (true) {
    
    SI (ultimo.siguiente != null) ENTONCES {
        // Avanzar ambos punteros hasta llegar al final
        anterior = ultimo
        ultimo = ultimo.siguiente
    } SINO {
        // Se encontró el último nodo. Proceder a rotar.
        anterior.siguiente = ultimo.siguiente // Desenlazar (apunta a null)
        ultimo.siguiente = inicio             // Enlazar al antiguo inicio
        ROMPER CICLO
    }
    
}

// Actualizar la nueva cabecera de la lista
inicio = ultimo
```

---

## 4. Ejemplo de ejecución

Lista inicial:

```text
[a] -> [b] -> [c] -> null
```

Estado inicial de punteros:

```text
inicio   = a
anterior = a
ultimo   = b
```

Representación gráfica:

```text
[a | inicio, anterior] -> [b | ultimo] -> [c] -> null
```

---

## 5. Trazado por iteraciones

### Iteración 1

Condición:

```pseudo
SI (ultimo.siguiente != null) ENTONCES
```

Evaluación:

```text
ultimo = b
ultimo.siguiente = c (c != null)
```

Acción: avanzar `anterior` y `ultimo`.

```text
anterior = b
ultimo   = c
```

Estado:

```text
[a | inicio] -> [b | anterior] -> [c | ultimo] -> null
```

---

### Iteración 2

Condición:

```pseudo
SI (ultimo.siguiente != null) ENTONCES
```

Evaluación:

```text
ultimo = c
ultimo.siguiente = null
```

La condición es falsa, se ejecuta la rama `SINO`.

Acción de rotación:

```pseudo
anterior.siguiente = ultimo.siguiente  // b.siguiente = null
ultimo.siguiente = inicio              // c.siguiente = a
ROMPER CICLO
```

Estado momentáneo de los nodos:
- El nodo `b` ahora apunta a `null`.
- El nodo `c` ahora apunta a `a`.

```text
[c] -> [a] -> [b] -> null
```

---

## 6. Resultado final

Fuera del ciclo, se actualiza la cabecera:

```pseudo
inicio = ultimo  // inicio = c
```

Lista inicial:

```text
[a] -> [b] -> [c] -> null
```

Lista después de rotar a la derecha:

```text
[c | inicio] -> [a] -> [b] -> null
```

---

## 7. Casos borde

### Caso borde 1: lista vacía

```pseudo
SI (inicio == null) ENTONCES
    RETORNAR
FIN SI
```
No hay nodos que procesar, la función termina de inmediato.

---

### Caso borde 2: lista con un solo nodo

Ejemplo:

```text
[a] -> null
```

Inicialización:

```pseudo
anterior = inicio      // a
ultimo = inicio.siguiente // null
```

Evaluación:

```pseudo
SI (ultimo == null) ENTONCES
    RETORNAR
FIN SI
```
Al tener un solo nodo, rotarlo no cambia su estructura. El algoritmo lo detecta y termina sin entrar al ciclo, evitando errores de acceso a punteros nulos.
