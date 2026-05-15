# Sistema Académico con Árbol Binario de Búsqueda en Java

Proyecto desarrollado para la asignatura de **Estructura de Datos** utilizando **Árboles Binarios de Búsqueda (ABB)** en Java.

---

# Información General

- **Universidad:** Universidad Técnica de Ambato
- **Asignatura:** Estructura de Datos
- **Tema:** Árboles Binarios de Búsqueda
- **Lenguaje:** Java
- **Nombre:** Justin Danilo Ojeda Ramirez
- **Modalidad:** Individual
- **Repositorio:** prueba-practica-arboles-cpp-java

---

# Objetivo del Proyecto

Desarrollar un sistema académico capaz de gestionar estudiantes mediante la implementación de un Árbol Binario de Búsqueda (ABB), aplicando:

- Programación Orientada a Objetos
- Recursividad
- Recorridos de árboles
- BFS utilizando colas
- Inserción, búsqueda y eliminación de nodos
- Código modular y estructurado

---

# Estructuras Aplicadas

## Árbol Binario de Búsqueda (ABB)

Se utilizó un ABB porque permite:

- Insertar estudiantes eficientemente
- Buscar por cédula rápidamente
- Mantener los datos ordenados automáticamente
- Eliminar nodos conservando la estructura del árbol

---

# Funciones Implementadas

| Función | Descripción |
|---|---|
| insertarEstudiante() | Inserta un nuevo estudiante |
| buscarEstudiante() | Busca por número de cédula |
| eliminarEstudiante() | Elimina un estudiante |
| recorridoInorden() | Recorre el árbol en Inorden |
| recorridoPreorden() | Recorre el árbol en Preorden |
| recorridoPostorden() | Recorre el árbol en Postorden |
| recorridoPorNiveles() | Recorrido BFS |
| contarNodos() | Cuenta estudiantes registrados |
| calcularAltura() | Obtiene la altura del árbol |
| buscarNotaMayor() | Muestra mayor nota |
| buscarNotaMenor() | Muestra menor nota |
| mostrarAprobados() | Muestra aprobados |
| mostrarReprobados() | Muestra reprobados |

---

# Clases del Proyecto

## NodoAcademico.java

Representa cada estudiante dentro del árbol.

### Atributos:

- Cedula
- Apellidos
- Nombres
- Nota final
- Carrera
- Nivel
- Hijo izquierdo
- Hijo derecho

---

## RegistroUniversitarioABB.java

Contiene toda la lógica del árbol binario:

- Inserciones
- Búsquedas
- Eliminaciones
- Recorridos
- BFS
- Altura
- Conteo
- Filtros de aprobados y reprobados

---

## PrincipalSistemaUTA.java

Clase principal encargada del menú interactivo y ejecución del programa.

---

# Recorridos del Árbol

## Inorden

Muestra estudiantes ordenados por cédula.

## Preorden

Primero procesa la raíz y luego los subárboles.

## Postorden

Primero procesa hijos y luego la raíz.

## BFS

Recorre el árbol por niveles utilizando una cola.

---

# Menú del Sistema

```text
1. Insertar estudiante
2. Buscar estudiante por cédula
3. Eliminar estudiante
4. Recorrido Inorden
5. Recorrido Preorden
6. Recorrido Postorden
7. Recorrido por niveles BFS
8. Contar estudiantes
9. Calcular altura del árbol
10. Mostrar estudiante con mayor nota
11. Mostrar estudiante con menor nota
12. Mostrar estudiantes aprobados
13. Mostrar estudiantes reprobados
14. Salir
```

---

# Evidencias del Sistema

## Menú Principal

![Menu](Captura%20de%20funciones/MenuPrincipal.png)

---

## Insertar Estudiante

![Insertar](Captura%20de%20funciones/1)InsertarEstudiante.png)

---

## Buscar Estudiante

![Buscar](Captura%20de%20funciones/2)BuscarEstudiante.png)

---

## Eliminar Estudiante

![Eliminar](Captura%20de%20funciones/3)EliminarEstudiante.png)

---

## Recorrido Inorden

![Inorden](Captura%20de%20funciones/4)RecorridoInorden.png)

---

## Recorrido Preorden

![Preorden](Captura%20de%20funciones/5)RecorridoPreorden.png)

---

## Recorrido Postorden

![Postorden](Captura%20de%20funciones/6)RrecorridoPostorden.png)

---

## Recorrido BFS

![BFS](Captura%20de%20funciones/7)RecorridoBFS.png)

---

## Contar Estudiantes

![Contar](Captura%20de%20funciones/8)ContarEstudiantes.png)

---

## Calcular Altura

![Altura](Captura%20de%20funciones/9)CalcularAltura.png)

---

## Mayor Nota

![MayorNota](Captura%20de%20funciones/10)MayorNota.png)

---

## Menor Nota

![MenorNota](Captura%20de%20funciones/11)MenorNota.png)

---

## Mostrar Aprobados

![Aprobados](Captura%20de%20funciones/12)MostrarAprobados.png)

---

## Mostrar Reprobados

![Reprobados](Captura%20de%20funciones/13)MostrarReprobados.png)

---

# Compilación y Ejecución

## Compilar

```bash
javac *.java
```

## Ejecutar

```bash
java PrincipalSistemaUTA
```

---

# Tecnologías Utilizadas

- Java
- Programación Orientada a Objetos
- Árboles Binarios de Búsqueda
- Recursividad
- Cola (Queue)
- GitHub
- Visual Studio Code

---

# Explicación Técnica

## ¿Por qué se utilizó un ABB?

Porque permite mantener los estudiantes ordenados automáticamente según la cédula y optimiza operaciones de búsqueda, inserción y eliminación.

## ¿Por qué BFS utiliza cola?

Porque BFS trabaja por niveles y la cola respeta el principio FIFO (First In First Out).

## ¿Cómo se calcula la altura?

Se usa recursividad para calcular la altura izquierda y derecha, retornando la mayor más uno.

## ¿Cómo funciona eliminar un nodo?

Existen tres casos:

1. Nodo sin hijos
2. Nodo con un hijo
3. Nodo con dos hijos utilizando sucesor Inorden

---


# Estructura del Proyecto

```text
prueba-practica-arboles-cpp-java/
│
├── NodoAcademico.java
├── RegistroUniversitarioABB.java
├── PrincipalSistemaUTA.java
├── README.md
└── Captura de funciones/
```

---

# ⭐ Resultado

Sistema académico funcional utilizando Árboles Binarios de Búsqueda en Java con recorridos completos, BFS, cálculo de altura, manejo de estudiantes y evidencia documentada en GitHub.

