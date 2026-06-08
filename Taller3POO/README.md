# Taller 3 - Sistema de Magos y Hechizos

## Descripción del proyecto

Este proyecto corresponde al Taller 3 de Programación Orientada a Objetos, desarrollado durante el I Semestre de 2026.

El sistema simula la administración de magos y hechizos mediante una aplicación por consola desarrollada en Java.

Cada mago posee un conjunto de hechizos, los cuales pertenecen a uno de los siguientes elementos:

- Fuego
- Tierra
- Planta
- Agua

Cada tipo de hechizo posee propiedades específicas y una fórmula distinta para calcular su puntaje.

Toda la información se almacena en archivos de texto, permitiendo mantener la persistencia de los datos incluso después de cerrar el programa.

---

# Funcionalidades principales

El sistema permite:

- Cargar magos desde archivo.
- Cargar hechizos desde archivo.
- Buscar magos.
- Buscar hechizos.
- Agregar magos.
- Modificar magos.
- Eliminar magos.
- Agregar hechizos.
- Modificar hechizos.
- Eliminar hechizos.
- Guardar cambios en archivos.
- Mostrar todos los magos.
- Mostrar todos los hechizos.
- Mostrar magos junto a su puntaje.
- Mostrar hechizos junto a su puntaje.
- Mostrar Top 3 de magos.
- Mostrar Top 10 de hechizos.
- Calcular puntajes automáticamente.

---

# Integrantes

## Andy Alfaro Perez

- **RUT:** 21.918.973-7
- **Carrera:** Ingeniería Civil Industrial
- **GitHub:** AndyAlfaroPerez

---

# Estructura del proyecto

```text
Taller3/
│
├── src/
│   │
│   ├── dominio/
│   │   ├── Calculable.java
│   │   ├── Hechizo.java
│   │   ├── HechizoAgua.java
│   │   ├── HechizoFuego.java
│   │   ├── HechizoPlanta.java
│   │   ├── HechizoTierra.java
│   │   └── Mago.java
│   │
│   └── logica/
│       ├── Main.java
│       └── Sistema.java
│
├── Magos.txt
├── Hechizos.txt
│
├── ModeloDominio.pdf
├── DiagramaClases.pdf
└── README.md
```

---

# Clases principales

## Main

Clase principal del sistema.

### Responsabilidades

- Iniciar el programa.
- Cargar archivos.
- Mostrar menús.
- Solicitar datos al usuario.
- Conectar la interacción con la clase Sistema.

---

## Sistema

Clase encargada de toda la lógica del programa.

### Responsabilidades

- Gestionar magos.
- Gestionar hechizos.
- Leer archivos.
- Guardar archivos.
- Calcular rankings.
- Mostrar reportes.
- Buscar objetos.
- Mantener la persistencia de los datos.

### Colecciones utilizadas

```java
private ArrayList<Mago> magos;
private ArrayList<Hechizo> hechizos;
```

---

## Calculable

Interfaz utilizada para calcular puntajes.

### Método

```java
double calcularPuntaje();
```

### Implementada por

- Mago
- Hechizo

---

## Mago

Representa a cada mago registrado.

### Atributos principales

```java
private String nombre;
private ArrayList<Hechizo> hechizos;
```

### Responsabilidades

- Guardar el nombre del mago.
- Almacenar hechizos.
- Calcular el puntaje total.
- Permitir agregar hechizos.

### Cálculo de puntaje

La puntuación total del mago corresponde a la suma de todos los puntajes de los hechizos que domina.

```text
PuntajeMago = Σ PuntajeHechizo
```

---

## Hechizo

Clase abstracta que representa la base común de todos los hechizos.

### Atributos principales

```java
private String nombre;
private String tipo;
private int daño;
```

### Métodos principales

```java
getNombre()
getTipo()
getDaño()

convertirATexto()
calcularPuntaje()
```

---

# Tipos de hechizo

## HechizoFuego

### Atributo

```java
private int duracionQuemadura;
```

### Fórmula

```text
Puntaje = Daño * DuracionQuemadura
```

---

## HechizoTierra

### Atributo

```java
private int mejoraDefensa;
```

### Fórmula

```text
Puntaje = (Daño * MejoraDefensa) / 2
```

---

## HechizoPlanta

### Atributos

```java
private int duracionStun;
private int cantPlantas;
```

### Fórmula

```text
Puntaje = Daño + (DuracionStun * CantPlantas)
```

---

## HechizoAgua

### Atributos

```java
private int cantidadHeal;
private int presionAgua;
```

### Fórmula

```text
Puntaje = (Daño + CantidadHeal + PresionAgua) * 2
```

---

# Archivos utilizados

## Hechizos.txt

### Formato

```text
NombreHechizo;Tipo;Daño;DatosExtra
```

### Ejemplos

```text
Escaldar;Agua;110;45,360
Tumba Rocas;Tierra;18;40
Polen Somnífero;Planta;81;3,10
Ascuas;Fuego;77;5
```

---

## Magos.txt

### Formato

```text
NombreMago;Hechizo1|Hechizo2|HechizoN
```

### Ejemplo

```text
Pruno;Sofoco|Disparo Lodo|Pirotecnia|Vórtice Ígneo
```

---

# Menú principal

```text
1. Administrador
2. Analista
3. Salir
```

---

# Panel Administrador

```text
1. Agregar Mago
2. Modificar Mago
3. Eliminar Mago
4. Agregar Hechizo
5. Modificar Hechizo
6. Eliminar Hechizo
7. Volver
```

---

# Panel Analista

```text
1. Top 10 Mejores Hechizos
2. Top 3 Mejores Magos
3. Mostrar todos los Hechizos
4. Mostrar todos los Magos
5. Mostrar todos los Hechizos junto a su puntaje
6. Mostrar todos los Magos junto a su puntaje
7. Volver
```

---

# Persistencia de datos

El sistema utiliza:

- `Scanner` para lectura de archivos.
- `BufferedWriter` para escritura de archivos.

Los cambios realizados desde el panel Administrador se guardan automáticamente en:

```text
Magos.txt
Hechizos.txt
```

---

# Tecnologías utilizadas

- Java
- Programación Orientada a Objetos
- Interfaces
- Herencia
- Clases abstractas
- Polimorfismo
- Encapsulamiento
- ArrayList
- Scanner
- BufferedWriter
- Persistencia mediante archivos de texto

---

# Diagramas entregados

El repositorio incluye:

```text
ModeloDominio.pdf
DiagramaClases.pdf
README.md
```

---

# Estado del proyecto

Proyecto desarrollado como parte del Taller 3 de Programación Orientada a Objetos.

El sistema permite administrar magos y hechizos mediante consola, calcular puntajes según el tipo de hechizo y generar rankings utilizando los datos almacenados en archivos de texto.
