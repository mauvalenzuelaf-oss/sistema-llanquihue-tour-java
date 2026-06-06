![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Evaluación Sumativa 1 – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- **Nombre completo:** Mauricio Francisco Valenzuela Fuentes
- **Carrera:** Analista Programador Computacional
- **Sede:** Online

---

## 📘 Descripción general del sistema
Este proyecto corresponde a la Evaluación Final Transversal de la asignatura *Desarrollo Orientado a Objetos I*. Se trata de un sistema orientado a objetos desarrollado en Java, cuyo objetivo es modelar personas vinculadas a la empresa de turismo *Llanquihue Tour*.

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



## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/usuario/repositorio-evaluacion-final.git
```

2. Abre el proyecto en IntelliJ IDEA.

3. Verifica que la carpeta src contenga los paquetes app, model y util.

4. Ejecuta el archivo `Main.java` desde el paquete `app`.

5. Revisa la salida por consola, donde se mostrarán los casos válidos y los casos inválidos controlados mediante excepciones personalizadas.


---

**Repositorio GitHub:** \[Pega aquí el enlace al repositorio]
**Fecha de entrega:** \[08/06/2026]

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Evaluación Final Transversal EFT

