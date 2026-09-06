
## Contexto narrativo

Un laboratorio de mantenimiento de equipos electrónicos necesita registrar las tareas pendientes del día. El ingeniero jefe quiere que el sistema mantenga las tareas en una lista lineal ordenada según la posición en la que se insertan. El equipo de desarrollo está diseñando primero el **TDA Lista**, antes de decidir si la implementación final usará una lista secuencial o una lista enlazada. Las tareas tienen un código, por ejemplo `"T-101"`, y una prioridad. Sin embargo, por ahora la prioridad no se usa para ordenar automáticamente la lista. La lista solo respeta la posición donde se inserta cada elemento. Además, el cliente menciona que cada tarea tiene prioridad alta, media o baja, pero esa información no forma parte del comportamiento básico del TDA Lista que se está modelando.

---

## Consignas del ejercicio

### a) Definir el TDA Lista

**Mi Respuesta:**

    El TDA Lista es un conjunto ordenado de elementos donde se pueden guardar elementos en una posición elegida y válida. Está organizada de forma lineal, donde cada elemento respeta la posición donde se ha decidido insertar. Lo que identifica a cada elemento respecto a los demás es el índice donde fue colocado. Las operaciones que permite son: insertar un nuevo elemento, obtener un elemento por su posición, eliminar un elemento por su posición, contar la cantidad de elementos y consultar si la lista está vacía.

---

### b) Escribir el contrato de cada operación

**Mi Respuesta:**

---

Insertar(x, i)

Condición q se debe cumplir:
0 <= i <= longitud
longitud < capacidad

Postcondición:
El elemento x queda en la posición i.
Los elementos que estaban desde la posición i en adelante
se desplazan una posición hacia adelante.
La longitud aumenta en 1.

---

Obtener(i)

Condición q se debe cumplir:
0 <= i < longitud

Postcondición:
Devuelve el valor que está en la posición i.
No modifica la lista: la longitud no cambia
y ningún elemento se desplaza.

---

Eliminar(i)

Condición q se debe cumplir:
0 <= i < longitud

Postcondición:
Se elimina el elemento que está en la posición i.
Los elementos que estaban después de la posición i, si los hay,
se desplazan una posición hacia índices menores.
Si i == longitud - 1, no se desplaza ningún elemento.
La longitud disminuye en 1:
longitud = longitud - 1
No devuelve ningún valor.

---

Longitud()

Condición q se debe cumplir:
Ninguna.

Postcondición:
Devuelve la cantidad actual de elementos de la lista.
No modifica la lista.

---

Vacía()

Descripción:
Consulta si la lista no tiene elementos.

Parámetros:
No recibe ningún parámetro.

Precondición:
Ninguna.

Devuelve:
true si longitud == 0.
false si longitud > 0.

Postcondición:
No modifica la lista.

---

### c) Completar una tabla de trazado manual

---

Buscar tabla Inc-c.csv.

---

### d) Identificar invariantes del TDA Lista

- La longitud siempre coinciden con la cantidad real de elementos q hay en ese momento.
- Los elementos siempre ocupan posiciones consecutivas, lo q permite q no exista huecos vacios en la lista.
- Las operaciones como Obtener, Longitud y Vacía no modifican la lista.

---

### e) Separar abstracción de implementación

---

El TDA Lista describe de forma abstracta las operaciones y sus contratos:
qué condiciones deben cumplirse, qué valores devuelven y qué efecto
producen sobre la lista. La implementación concreta define cómo se construye internamente esa
lista, por ejemplo usando una lista secuencial o una lista enlazada.

---
