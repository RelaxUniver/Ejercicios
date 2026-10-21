# 📚 Repositorio de Ejercicios Prácticos

> **Recopilación de ejercicios y casos prácticos de programación en Java, enfocados en Tipos de Datos Abstractos (TDA), algoritmos de manipulación de listas y estructuras de datos dinámicas.**

---

## 📑 Tabla de Contenidos

- [📚 Repositorio de Ejercicios Prácticos](#-repositorio-de-ejercicios-prácticos)
  - [📑 Tabla de Contenidos](#-tabla-de-contenidos)
  - [🎯 Descripción del Proyecto](#-descripción-del-proyecto)
  - [🛠️ Tecnologías Utilizadas](#️-tecnologías-utilizadas)
  - [📂 Estructura del Proyecto](#-estructura-del-proyecto)
  - [📖 Documentación por Clase Práctica](#-documentación-por-clase-práctica)
    - [🧩 Clase Práctica 1 (CP1)](#-clase-práctica-1-cp1)
    - [🧩 Clase Práctica 2 (CP2)](#-clase-práctica-2-cp2)
      - [📋 Proyecto `lista_estudiantes`](#-proyecto-lista_estudiantes)
      - [📋 Proyecto `lista_profesores`](#-proyecto-lista_profesores)
    - [🧩 Clase Práctica 3 (CP3)](#-clase-práctica-3-cp3)
  - [🏗️ Arquitectura del Sistema](#️-arquitectura-del-sistema)
  - [🚀 Cómo Ejecutar](#-cómo-ejecutar)
  - [🤝 Contribuciones](#-contribuciones)
  - [📄 Licencia](#-licencia)
  - [✒️ Autor](#️-autor)

---

## 🎯 Descripción del Proyecto

Este repositorio alberga una recopilación de ejercicios y casos prácticos desarrollados con fines académicos y de aprendizaje continuo. El objetivo principal es consolidar y poner en práctica conceptos fundamentales de la programación, así como la lógica computacional, a través de la implementación de **Tipos de Datos Abstractos (TDA)** y algoritmos de manipulación de estructuras de datos.

El material aquí contenido sirve como referencia de estudio, demostrando la aplicación de buenas prácticas en el desarrollo de software mediante el lenguaje **Java**.

---

## 🛠️ Tecnologías Utilizadas

| Tecnología | Descripción |
|------------|-------------|
| **Java**   | Lenguaje de programación principal utilizado para la implementación de la lógica, los métodos y los casos de prueba (estructurado bajo el paquete `com.yaisel`). |
| **Maven**  | Gestor de dependencias y herramientas de compilación (identificado a partir de las carpetas `target/` y estructura de directorios `src/main/java`). |

---

## 📂 Estructura del Proyecto

    Ejercicios/
    ├── CP1/
    │   ├── CP1.md                # Documentación teórica de la Clase Práctica 1
    │   ├── tdalistasecuencial/   # Implementación de TDA Lista Secuencial
    │   └── tdalistaenlazada/     # Implementación de TDA Lista Enlazada
    ├── CP2/
    │   ├── CP2.md                # Documentación teórica de la Clase Práctica 2
    │   └── SimpleList/           # Proyecto con algoritmos de manipulación de listas
    ├── CP3/
    │   └── src/
    │       ├── IStack.java       # Interfaz de la pila
    │       ├── LinkedStack.java  # Implementación de pila enlazada
    │       ├── Node.java         # Clase auxiliar para nodos
    │       └── Main.java         # Punto de entrada y casos de prueba
    └── README.md

---

## 📖 Documentación por Clase Práctica

### 🧩 Clase Práctica 1 (CP1)

En esta primera unidad, el enfoque principal es la implementación y comprensión de los **Tipos de Datos Abstractos (TDA)** para el manejo de listas.

- [📄 Explicación general de la CP1](https://github.com/RelaxUniver/Ejercicios/blob/master/CP1/CP1.md) – Documento que detalla los objetivos y la teoría base de esta clase práctica.

**Proyectos implementados:**

1. **TDA Lista Secuencial (`tdalistasecuencial`)**
   Implementación de una lista basada en arreglos (secuencial). Incluye la gestión de tareas y niveles de prioridad mediante clases como `ListaSecuencial.java`, `Tarea.java` y `Prioridad.java`.

2. **TDA Lista Enlazada (`tdalistaenlazada`)**
   Implementación de una lista enlazada simple. Permite comprender el manejo de referencias en memoria dinámica a través de las clases `ListaEnlazadaSimple.java` y `Nodo.java`.

---

### 🧩 Clase Práctica 2 (CP2)

En esta unidad se abordan algoritmos específicos para la manipulación, transformación y optimización de estructuras de datos tipo lista.

**Casos de estudio documentados:**

- [🔗 Lógica de concatenar dos listas](https://github.com/RelaxUniver/Ejercicios/blob/master/CP2/CP2.md) – Explicación del algoritmo para unir dos estructuras de datos independientes en una sola.
- [🧹 Lógica de eliminar duplicados](https://github.com/RelaxUniver/Ejercicios/blob/master/CP2/CP2.md) – Análisis del método para depurar una lista y garantizar la integridad y unicidad de sus elementos.
- [🔄 Lógica de rotar una posición a la derecha](https://github.com/RelaxUniver/Ejercicios/blob/master/CP2/CP2.md) – Documentación sobre el desplazamiento circular de los elementos dentro de la estructura.

**Proyecto implementado:**

- **SimpleList** – Aplicación práctica de los algoritmos anteriores utilizando una estructura de nodos (`Node.java`) con casos de prueba ejecutables desde su clase principal (`Main.java`).

#### 📋 Proyecto `lista_estudiantes`

Este módulo implementa una lista enlazada simple para la gestión de registros de estudiantes, utilizando una arquitectura basada en nodos.

**Clases principales:**

| Clase | Descripción |
|-------|-------------|
| `Estudiante.java` | Modela la entidad con atributos: `carneI` (int), `nombre` (String), `apellido` (String), `sexo` (String), `year` (String, formato DD/MM/YYYY), `militante` (boolean), `becado` (boolean). Incluye validación de formato de fecha mediante expresión regular. |
| `ListaEstudiante.java` | Implementa la lista enlazada simple con métodos: `agregar(Estudiante e)`, `cumpleanos(String mes)`, `CantMilitantes()`, `CantBecados()`. |
| `Nodo.java` | Clase auxiliar que encapsula un objeto `Estudiante` y mantiene la referencia al siguiente nodo. |

#### 📋 Proyecto `lista_profesores`

Este módulo implementa una lista enlazada simple para la administración del personal docente, con funcionalidades de análisis estadístico y categorización académica.

**Clases principales:**

| Clase | Descripción |
|-------|-------------|
| `Profesor.java` | Modela la entidad con atributos: `nombre` (String), `edad` (int), `categoria` (String). La categoría se valida mediante expresión regular, aceptando solo: `Instructor`, `Asistente`, `Auxiliar`, `Titular`. |
| `ListaProfesor.java` | Gestiona la lista enlazada con métodos: `InstructoresMayores()`, `MostrarLista()`, `CantProfesores()`. |
| `Nodo.java` | Clase auxiliar que encapsula un objeto `Profesor` y mantiene la referencia al siguiente nodo. |

---

### 🧩 Clase Práctica 3 (CP3)

Esta unidad introduce el estudio de **pilas (stacks)** mediante una implementación enlazada. El código se encuentra en `CP3/src/` y consta de las siguientes clases:

| Clase | Descripción |
|-------|-------------|
| `IStack.java` | Interfaz que define las operaciones básicas de una pila (`push`, `pop`, `peek`, `isEmpty`, etc.). |
| `LinkedStack.java` | Implementación concreta de la pila utilizando una estructura de nodos enlazados. |
| `Node.java` | Clase auxiliar que representa un nodo de la pila, almacenando un dato y una referencia al siguiente nodo. |
| `Main.java` | Punto de entrada con casos de prueba que demuestran el funcionamiento de la pila. |

---

## 🏗️ Arquitectura del Sistema

Los proyectos de listas enlazadas (`lista_estudiantes` y `lista_profesores`) comparten la misma arquitectura basada en:

1. **Clase de Entidad** – Modela los datos del dominio (Estudiante/Profesor).
2. **Clase de Lista** – Gestiona las operaciones de la estructura enlazada.
3. **Clase Nodo** – Mantiene las referencias entre elementos.
4. **Clase Main** – Punto de entrada para casos de prueba y demostración.

Esta arquitectura promueve la separación de responsabilidades y facilita el mantenimiento del código.

---

## 🚀 Cómo Ejecutar

1. **Clonar el repositorio:**

       git clone https://github.com/RelaxUniver/Ejercicios.git

2. **Acceder al directorio del proyecto:**

       cd Ejercicios

3. **Compilar y ejecutar con Maven** (si el proyecto incluye `pom.xml`):

       mvn compile
       mvn exec:java -Dexec.mainClass="com.yaisel.Main"

   > Si no se utiliza Maven, puede compilar y ejecutar directamente con `javac` y `java` desde el directorio `src` correspondiente.

---

## 🤝 Contribuciones

Las contribuciones son bienvenidas. Si deseas mejorar este repositorio:

1. Haz un fork del proyecto.
2. Crea una rama para tu feature (`git checkout -b feature/nueva-funcionalidad`).
3. Realiza tus cambios y haz commit (`git commit -m 'Añadir nueva funcionalidad'`).
4. Haz push a la rama (`git push origin feature/nueva-funcionalidad`).
5. Abre un Pull Request.

---

## 📄 Licencia

Este repositorio no especifica una licencia explícita. Si deseas utilizar el contenido, por favor contacta al autor para obtener permiso.

---

## ✒️ Autor

**RelaxUniver** – [GitHub](https://github.com/RelaxUniver)

---

> ⭐ Si este repositorio te resulta útil, considera darle una estrella.