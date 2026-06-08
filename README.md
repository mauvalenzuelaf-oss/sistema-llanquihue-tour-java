![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Evaluación Sumativa 1 – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- **Nombre completo:** Mauricio Francisco Valenzuela Fuentes
- **Carrera:** Analista Programador Computacional
- **Sede:** Online

---

## 📘 Descripción general del sistema
Este proyecto corresponde a la Evaluación Sumativa N° 1 de la asignatura *Desarrollo Orientado a Objetos I*. Se trata de un sistema orientado a objetos desarrollado en Java, cuyo objetivo es modelar personas vinculadas a la empresa de turismo *Llanquihue Tour*.

El sistema representa distintos tipos de personas dentro del contexto de una agencia turística:

1. Clientes
2. Empleados
3. Colaboradores

Dentro de los colaboradores se consideran perfiles como guías turísticos, operadores locales, proveedores de transporte y proveedores de alojamiento.

El proyecto aplica principios fundamentales de la programación orientada a objetos, como encapsulamiento, composición, herencia, validación de datos y manejo de excepciones personalizadas.

---

## 🧱 Estructura general del proyecto

```plaintext
📁 src/
├── app/
│   └── Main.java
│
├── model/
│   ├── persona/
│   │   ├── Persona.java
│   │   ├── Cliente.java
│   │   ├── Empleado.java
│   │   └── Colaborador.java
│   │
│   └── datos/
│       ├── NombreCompleto.java
│       ├── Rut.java
│       ├── Direccion.java
│       └── Correo.java
│ 
└── util/
    ├── NombreInvalidoException.java
    ├── RutInvalidoException.java
    ├── DireccionInvalidaException.java
    ├── CorreoInvalidoException.java
    ├── EmpleadoInvalidoException.java
    └── ColaboradorInvalidoException.java
````

---

## 🧩 Organización por paquetes y subpaquetes

**1. app:** Contiene la clase principal del programa. Desde Main.java se crean objetos válidos e inválidos para demostrar el funcionamiento del sistema.

**2. model:** Agrupa las clases que representan el modelo del sistema. Se divide en subpaquetes para separar las clases principales de persona de las clases que representan sus datos internos.

**2.1. model.persona:** Contiene las clases que representan los tipos de persona vinculados a Llanquihue Tour (Persona, Cliente, Empleado y Colaborador).

**2.2. model.datos:** Contiene las clases que representan los datos internos que componen a una persona (NombreCompleto, Rut, Direccion y Correo).

**3. util:** Agrupa las excepciones personalizadas utilizadas para manejar errores de validación (Ejemplo: RutInvalidoException).

---

## 🧠 Principios aplicados

**1. Herencia:** Las clases Cliente, Empleado y Colaborador heredan de la clase Persona.

**2. Composición:** La clase Persona está compuesta por objetos de otras clases.

**3. Encapsulamiento:** Los atributos de las clases se declaran como private y se accede a ellos mediante constructores, getters y setters.

**4. Validación de datos:** Cada clase de dato valida su propia información antes de guardarla.

**5. Excepciones personalizadas:** El sistema utiliza excepciones personalizadas para entregar mensajes claros cuando se ingresan datos inválidos.

---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/mauvalenzuelaf-oss/sistema-llanquihue-tour-java.git
```

2. Abre el proyecto en IntelliJ IDEA.

3. Verifica que la carpeta src contenga los paquetes app, model y util.

4. Ejecuta el archivo `Main.java` desde el paquete `app`.

5. Revisa la salida por consola, donde se mostrarán los casos válidos y los casos inválidos controlados mediante excepciones personalizadas.


---

**Repositorio GitHub:** https://github.com/mauvalenzuelaf-oss/sistema-llanquihue-tour-java

**Fecha de entrega:** 08/06/2026

---

© Duoc UC | Escuela de Informática y Telecomunicaciones |
