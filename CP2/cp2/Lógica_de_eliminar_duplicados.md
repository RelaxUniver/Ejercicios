# Ejercicio 1: eliminar elementos repetidos de una lista simplemente enlazada

## 1. Idea general

Se tienen tres punteros principales:

| Puntero | Función |
|---|---|
| `actual` | Nodo cuyo dato se está revisando. |
| `buscar` | Recorre los nodos siguientes para encontrar duplicados de `actual`. |
| `anterior` | Nodo inmediato anterior a `buscar`; permite desenlazar el nodo repetido. |

La lista es **simplemente enlazada**, por lo tanto cada nodo solo tiene referencia a `siguiente`. Por esa razón no se puede usar `buscar.anterior`; se necesita el puntero auxiliar `anterior`.

---

## 2. Correcciones incorporadas

1. **Comparar datos, no nodos**  
   No se debe usar:

   ```pseudo
   actual == buscar
   ```

   porque eso compara referencias de nodos.  
   Se debe usar:

   ```pseudo
   actual.dato == buscar.dato
   ```

2. **Agregar el puntero `anterior`**  
   Para eliminar un nodo en una lista simplemente enlazada, se necesita conocer el nodo previo:

   ```pseudo
   anterior.siguiente = buscar.siguiente
   ```

3. **Inicializar correctamente los punteros**

   ```pseudo
   actual = nodo_primero
   buscar = actual.siguiente
   anterior = actual
   ```

4. **Verificar `buscar != null` antes de acceder a `buscar.dato`**  
   El orden correcto es:

   ```pseudo
   SI (buscar != null Y actual.dato == buscar.dato) ENTONCES
   ```

   Primero se comprueba que `buscar` no sea `null`; luego se compara el dato.

5. **Verificar `buscar != null` antes de avanzar en la rama negativa**  
   Si `buscar` ya es `null`, no se puede ejecutar:

   ```pseudo
   buscar = buscar.siguiente
   ```

   Por eso se protege así:

   ```pseudo
   SI (buscar != null) ENTONCES
       buscar = buscar.siguiente
       anterior = anterior.siguiente
   FIN SI
   ```

6. **Considerar casos borde**
   - Lista vacía: `nodo_primero == null`.
   - Lista con un solo nodo: `actual.siguiente == null`.

---

## 3. Pseudocódigo corregido

```pseudo
SI (nodo_primero == null) ENTONCES
    RETORNAR
FIN SI

actual = nodo_primero
buscar = actual.siguiente
anterior = actual

SI (buscar == null) ENTONCES
    RETORNAR
FIN SI

CICLO (true) {

    SI (buscar != null Y actual.dato == buscar.dato) ENTONCES {

        // Se encontró un nodo repetido.
        // Se elimina el nodo apuntado por buscar.

        anterior.siguiente = buscar.siguiente
        avance = buscar.siguiente
        buscar.siguiente = null
        buscar = avance

    } SINO {

        // No hay repetido en esta posición.
        // Solo se avanza si buscar no es null.

        SI (buscar != null) ENTONCES
            buscar = buscar.siguiente
            anterior = anterior.siguiente
        FIN SI

    }

    // Cuando buscar llega al final, se pasa al siguiente nodo actual.

    SI (buscar == null) ENTONCES {

        actual = actual.siguiente

        SI (actual == null) ENTONCES
            ROMPER CICLO
        SINO
            buscar = actual.siguiente
            anterior = actual
        FIN SI

    }

}
```

---

## 4. Ejemplo de ejecución

Lista inicial:

```text
[a] -> [b] -> [c] -> [d] -> [b] -> null
```

Estado inicial de punteros:

```text
actual   = a
buscar   = b
anterior = a
```

Representación gráfica:

```text
[a | actual, anterior] -> [b | buscar] -> [c] -> [d] -> [b] -> null
```

---

## 5. Trazado por iteraciones

### Iteración 1

Condición:

```pseudo
buscar != null Y actual.dato == buscar.dato
```

Evaluación:

```text
buscar = b
actual.dato = a
buscar.dato = b
a != b
```

Acción: avanzar `buscar` y `anterior`.

```text
buscar   = c
anterior = b
```

Estado:

```text
[a | actual] -> [b | anterior] -> [c | buscar] -> [d] -> [b] -> null
```

---

### Iteración 2

Comparación:

```text
actual.dato = a
buscar.dato = c
a != c
```

Acción: avanzar.

```text
buscar   = d
anterior = c
```

Estado:

```text
[a | actual] -> [b] -> [c | anterior] -> [d | buscar] -> [b] -> null
```

---

### Iteración 3

Comparación:

```text
actual.dato = a
buscar.dato = d
a != d
```

Acción: avanzar.

```text
buscar   = b
anterior = d
```

Estado:

```text
[a | actual] -> [b] -> [c] -> [d | anterior] -> [b | buscar] -> null
```

---

### Iteración 4

Comparación:

```text
actual.dato = a
buscar.dato = b
a != b
```

Acción: avanzar.

```text
buscar   = null
anterior = b
```

Estado momentáneo:

```text
[a | actual] -> [b] -> [c] -> [d] -> [b | anterior] -> null
                                                   buscar = null
```

Como `buscar == null`, se cambia el nodo `actual`:

```pseudo
actual = actual.siguiente
buscar = actual.siguiente
anterior = actual
```

Nuevo estado:

```text
actual   = b
buscar   = c
anterior = b
```

Lista:

```text
[a] -> [b | actual, anterior] -> [c | buscar] -> [d] -> [b] -> null
```

---

### Iteración 5

Comparación:

```text
actual.dato = b
buscar.dato = c
b != c
```

Acción: avanzar.

```text
buscar   = d
anterior = c
```

Estado:

```text
[a] -> [b | actual] -> [c | anterior] -> [d | buscar] -> [b] -> null
```

---

### Iteración 6

Comparación:

```text
actual.dato = b
buscar.dato = d
b != d
```

Acción: avanzar.

```text
buscar   = b
anterior = d
```

Estado:

```text
[a] -> [b | actual] -> [c] -> [d | anterior] -> [b | buscar] -> null
```

---

### Iteración 7

Comparación:

```text
actual.dato = b
buscar.dato = b
b == b
```

Se encontró un repetido.

Acción:

```pseudo
anterior.siguiente = buscar.siguiente
avance = buscar.siguiente
buscar.siguiente = null
buscar = avance
```

Como `buscar` era el último nodo:

```text
buscar.siguiente = null
avance = null
buscar = null
```

Estado después de eliminar:

```text
[a] -> [b | actual] -> [c] -> [d | anterior] -> null
```

Luego, como `buscar == null`, se cambia el nodo `actual`:

```pseudo
actual = actual.siguiente
buscar = actual.siguiente
anterior = actual
```

Nuevo estado:

```text
actual   = c
buscar   = d
anterior = c
```

Lista resultante:

```text
[a] -> [b] -> [c | actual, anterior] -> [d | buscar] -> null
```

---

### Iteración 8

Comparación:

```text
actual.dato = c
buscar.dato = d
c != d
```

Acción: avanzar.

```text
buscar   = null
anterior = d
```

Como `buscar == null`, se cambia el nodo `actual`:

```pseudo
actual = actual.siguiente
buscar = actual.siguiente
anterior = actual
```

Nuevo estado:

```text
actual   = d
buscar   = null
anterior = d
```

Lista:

```text
[a] -> [b] -> [c] -> [d | actual, anterior] -> null
```

---

### Iteración 9

Estado:

```text
actual   = d
buscar   = null
anterior = d
```

Condición principal:

```pseudo
SI (buscar != null Y actual.dato == buscar.dato) ENTONCES
```

Como `buscar == null`, la condición es falsa.  
No se intenta acceder a `buscar.dato`.

En la rama negativa:

```pseudo
SI (buscar != null) ENTONCES
    buscar = buscar.siguiente
    anterior = anterior.siguiente
FIN SI
```

Como `buscar == null`, tampoco se avanza.

Luego:

```pseudo
SI (buscar == null) ENTONCES
    actual = actual.siguiente
FIN SI
```

Entonces:

```text
actual = d.siguiente = null
```

Como `actual == null`:

```pseudo
ROMPER CICLO
```

---

## 6. Resultado final

Lista inicial:

```text
[a] -> [b] -> [c] -> [d] -> [b] -> null
```

Lista después de eliminar repetidos:

```text
[a] -> [b] -> [c] -> [d] -> null
```

---

## 7. Casos borde

### Caso borde 1: lista vacía

```pseudo
SI (nodo_primero == null) ENTONCES
    RETORNAR
FIN SI
```

No hay nodos que procesar.

---

### Caso borde 2: lista con un solo nodo

Ejemplo:

```text
[a] -> null
```

Inicialización:

```pseudo
actual = nodo_primero
buscar = actual.siguiente
anterior = actual
```

Resultado:

```text
actual   = a
buscar   = null
anterior = a
```

Como `buscar == null`, no hay ningún nodo posterior para comparar duplicados.

```pseudo
SI (buscar == null) ENTONCES
    RETORNAR
FIN SI
```