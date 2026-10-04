# 📘 Repositorio de Ejercicios Prácticos

## 📖 Descripción del Proyecto

Este repositorio alberga una recopilación de ejercicios y casos prácticos desarrollados con fines académicos y de aprendizaje continuo. El objetivo principal es consolidar y poner en práctica conceptos fundamentales de la programación, así como la lógica computacional, a través de la implementación de Tipos de Datos Abstractos (TDA) y algoritmos de manipulación de estructuras de datos.

El material aquí contenido sirve como referencia de estudio, demostrando la aplicación de buenas prácticas en el desarrollo de software mediante el lenguaje Java.

## 💻 Tecnologías Utilizadas

El proyecto está desarrollado íntegramente en:

- **Java**: Lenguaje de programación principal utilizado para la implementación de la lógica, los métodos y los casos de prueba (estructurado bajo el paquete `com.yaisel`).
- **Maven**: Gestor de dependencias y herramientas de compilación (identificado a partir de las carpetas `target/` y estructura de directorios `src/main/java`).

## 📂 Estructura del Proyecto y Documentación

Para facilitar la navegación y el estudio, el contenido se encuentra organizado en directorios que representan distintas Clases Prácticas (CP). A continuación, se detalla cada módulo junto con su respectiva documentación teórica.

### 📁 Clase Práctica 1 (CP1)

En esta primera unidad, el enfoque principal es la implementación y comprensión de los **Tipos de Datos Abstractos (TDA)** para el manejo de listas.

- 📄 [Explicación general de la CP1](CP1/CP1.md) \- Documento que detalla los objetivos y la teoría base de esta clase práctica.

**Proyectos implementados:**

1. **TDA Lista Secuencial (`tdalistasecuencial`)**
   Implementación de una lista basada en arreglos (secuencial). Incluye la gestión de tareas y niveles de prioridad mediante clases como `ListaSecuencial.java`, `Tarea.java` y `Prioridad.java`.
2. **TDA Lista Enlazada (`tdalistaenlazada`)**
   Implementación de una lista enlazada simple. Permite comprender el manejo de referencias en memoria dinámica a través de las clases `ListaEnlazadaSimple.java` y `Nodo.java`.

---

### 📁 Clase Práctica 2 (CP2)

En esta unidad se abordan algoritmos específicos para la manipulación, transformación y optimización de estructuras de datos tipo lista. Los casos de estudio específicos documentados son los siguientes:

- 📄 [Lógica de concatenar dos listas](CP2/CP2.md) \- Explicación del algoritmo para unir dos estructuras de datos independientes en una sola.
- 📄 [Lógica de eliminar duplicados](CP2/CP2.md) \- Análisis del método para depurar una lista y garantizar la integridad y unicidad de sus elementos.
- 📄 [Lógica de rotar una posición a la derecha](CP2/CP2.md) \- Documentación sobre el desplazamiento circular de los elementos dentro de la estructura.

**Proyecto implementado:**

- **SimpleList**: Aplicación práctica de los algoritmos anteriores utilizando una estructura de nodos (`Node.java`) con casos de prueba ejecutables desde su clase principal (`Main.java`).

---

## 🔬 Información Relevante Detallada

En esta sección se documentan de forma exhaustiva los proyectos de listas enlazadas simples implementados en la Clase Práctica 2, los cuales constituyen el núcleo fundamental del estudio de estructuras de datos dinámicas en este repositorio.

### 📋 Proyecto: `lista_estudiantes`

Este módulo implementa una lista enlazada simple para la gestión de registros de estudiantes, utilizando una arquitectura basada en nodos. El sistema permite almacenar, buscar y filtrar información académica de manera eficiente.

#### Clases Principales

**1. `Estudiante.java`**

Esta clase representa la entidad fundamental del modelo de datos. Cada estudiante posee los siguientes atributos:

| Atributo | Tipo | Descripción |
|----------|------|-------------|
| `carneI` | `int` | Número de identificación único del estudiante |
| `nombre` | `String` | Nombre del estudiante |
| `apellido` | `String` | Apellido del estudiante |
| `sexo` | `String` | Sexo del estudiante |
| `year` | `String` | Fecha de nacimiento en formato `DD/MM/YYYY` |
| `militante` | `boolean` | Indica si el estudiante es militante |
| `becado` | `boolean` | Indica si el estudiante posee beca |

La clase incluye validación en el constructor y setter del atributo `year` mediante expresión regular para garantizar el formato correcto de fechas.

**2. `ListaEstudiante.java`**

Esta clase implementa la estructura de lista enlazada simple con los siguientes métodos:

- **`agregar(Estudiante e)`**: Inserta un nuevo estudiante al final de la lista, manteniendo el orden de inserción.
- **`cumpleanos(String mes)`**: Retorna una nueva lista filtrada con todos los estudiantes que cumplen años en el mes especificado (formato `MM`). Extrae el mes de la fecha de nacimiento y compara con el parámetro proporcionado.
- **`CantMilitantes()`**: Genera una nueva lista ordenada cronológicamente por fecha de nacimiento (del más joven al más antiguo) que contiene únicamente a los estudiantes militantes. Utiliza el método auxiliar `esMenor()` para comparar años.
- **`CantBecados()`**: Retorna un entero que representa el conteo total de estudiantes que poseen beca en la lista.

**3. `Nodo.java`**

Clase auxiliar que encapsula un objeto `Estudiante` y mantiene la referencia al siguiente nodo en la estructura enlazada, permitiendo el recorrido secuencial de la lista.

---

### 👨‍🏫 Proyecto: `lista_profesores`

Este módulo implementa una lista enlazada simple para la administración del personal docente, con funcionalidades de análisis estadístico y categorización académica.

#### Clases Principales

**1. `Profesor.java`**

Esta clase modela la entidad del docente con los siguientes atributos:

| Atributo | Tipo | Descripción |
|----------|------|-------------|
| `nombre` | `String` | Nombre del profesor |
| `edad` | `int` | Edad del profesor |
| `categoria` | `String` | Categoría académica |

El sistema implementa validación estricta mediante expresión regular para el atributo `categoria`, aceptando únicamente los siguientes valores:
- `Instructor`
- `Asistente`
- `Auxiliar`
- `Titular`

Cualquier valor que no coincida con estos patrones genera una excepción `IllegalArgumentException`, garantizando la integridad de los datos.

**2. `ListaProfesor.java`**

Esta clase gestiona la lista enlazada de profesores mediante los siguientes métodos:

- **`agregar(Profesor p)`**: Añade un nuevo profesor al final de la lista enlazada.
- **`ProxCambio()`**: Retorna una nueva lista filtrada que contiene únicamente a los profesores con categoría `Instructor` cuya edad sea mayor a 26 años. Este método es particularmente útil para identificar instructores próximos a ser evaluados para cambio de categoría.
- **`MostrarLista()`**: Genera una nueva lista ordenada de forma descendente por edad (del mayor al menor). Implementa un algoritmo de inserción ordenada que recorre la lista resultante para encontrar la posición correcta de cada elemento.
- **`CantProfesores()`**: Retorna una cadena de texto con el conteo estadístico de profesores por categoría, desglosado de la siguiente manera:
  - Cantidad de Instructores
  - Cantidad de Asistentes
  - Cantidad de Auxiliares
  - Cantidad de Titulares

**3. `Nodo.java`**

Clase auxiliar que encapsula un objeto `Profesor` y mantiene la referencia al siguiente nodo, facilitando el recorrido y manipulación de la estructura enlazada.

---

### 🔗 Enlaces a Documentación Complementaria

Para una comprensión integral del proyecto, se recomienda consultar los siguientes documentos de documentación teórica:

- [📄 CP1/CP1.md](CP1/CP1.md) \- Documentación teórica y objetivos de la Clase Práctica 1
- [📄 CP2/CP2.md](CP2/CP2.md) \- Documentación teórica de algoritmos de manipulación de listas en la Clase Práctica 2

---

## 📚 Arquitectura del Sistema

Ambos proyectos (`lista_estudiantes` y `lista_profesores`) comparten la misma arquitectura basada en:

1. **Clase de Entidad**: Modela los datos del dominio (Estudiante/Profesor)
2. **Clase de Lista**: Gestiona las operaciones de la estructura enlazada
3. **Clase Nodo**: Mantiene las referencias entre elementos
4. **Clase Main**: Punto de entrada para casos de prueba y demostración

Esta arquitectura promueve la separación de responsabilidades y facilita el mantenimiento del código.