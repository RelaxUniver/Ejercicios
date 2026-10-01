# 📘 Repositorio de Ejercicios Prácticos

## 📖 Descripción del Proyecto
Este repositorio alberga una recopilación de ejercicios y casos prácticos desarrollados con fines académicos y de aprendizaje continuo. El objetivo principal es consolidar y poner en práctica conceptos fundamentales de la programación, así como la lógica computacional, a través de la implementación de Tipos de Datos Abstractos (TDA) y algoritmos de manipulación de estructuras de datos.

El material aquí contenido sirve como referencia de estudio, demostrando la aplicación de buenas prácticas en el desarrollo de software mediante el lenguaje Java.

## 💻 Tecnologías Utilizadas
El proyecto está desarrollado íntegramente en:
* **Java**: Lenguaje de programación principal utilizado para la implementación de la lógica, los métodos y los casos de prueba (estructurado bajo el paquete `com.yaisel`).
* **Maven**: Gestor de dependencias y herramientas de compilación (identificado a partir de las carpetas `target/` y estructura de directorios `src/main/java`).

## 📂 Estructura del Proyecto y Documentación

Para facilitar la navegación y el estudio, el contenido se encuentra organizado en directorios que representan distintas Clases Prácticas (CP). A continuación, se detalla cada módulo junto con su respectiva documentación teórica.

### 📁 Clase Práctica 1 (CP1)
En esta primera unidad, el enfoque principal es la implementación y comprensión de los **Tipos de Datos Abstractos (TDA)** para el manejo de listas.
* [📄 Explicación general de la CP1](./CP1/Explicación_de_la_CP1.md) - Documento que detalla los objetivos y la teoría base de esta clase práctica.

**Proyectos implementados:**
1. **TDA Lista Secuencial (`tdalistasecuencial`)**
   Implementación de una lista basada en arreglos (secuencial). Incluye la gestión de tareas y niveles de prioridad mediante clases como `ListaSecuencial.java`, `Tarea.java` y `Prioridad.java`.
2. **TDA Lista Enlazada (`tdalistaenlazada`)**
   Implementación de una lista enlazada simple. Permite comprender el manejo de referencias en memoria dinámica a través de las clases `ListaEnlazadaSimple.java` y `Nodo.java`.

---

### 📁 Clase Práctica 2 (CP2)
En esta unidad se abordan algoritmos específicos para la manipulación, transformación y optimización de estructuras de datos tipo lista. Los casos de estudio específicos documentados son los siguientes:

* [📄 Lógica de concatenar dos listas](./CP2/cp2/Lógica_de_concatenar_dos_listas.md) - Explicación del algoritmo para unir dos estructuras de datos independientes en una sola.
* [📄 Lógica de eliminar duplicados](./CP2/cp2/Lógica_de_eliminar_duplicados.md) - Análisis del método para depurar una lista y garantizar la integridad y unicidad de sus elementos.
* [📄 Lógica de rotar una posición a la derecha](./CP2/cp2/Lógica_de_rotar_una_posición_a_la_Der.md) - Documentación sobre el desplazamiento circular de los elementos dentro de la estructura.

**Proyecto implementado:**
* **SimpleList**: Aplicación práctica de los algoritmos anteriores utilizando una estructura de nodos (`Node.java`) con casos de prueba ejecutables desde su clase principal (`Main.java`).

## 👤 Autoría
Proyecto mantenido y desarrollado por **[RelaxUniver](https://github.com/RelaxUniver)**.

---