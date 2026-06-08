package app;

import model.persona.Persona;
import model.persona.Cliente;
import model.persona.Empleado;
import model.persona.Colaborador;

import util.NombreInvalidoException;
import util.RutInvalidoException;
import util.DireccionInvalidaException;
import util.CorreoInvalidoException;
import util.EmpleadoInvalidoException;
import util.ColaboradorInvalidoException;

/**
 * Clase principal del sistema Llanquihue Tour.
 * Permite crear objetos de tipo Cliente, Empleado y Colaborador,
 * mostrando el funcionamiento de herencia, composición, validaciones
 * y excepciones personalizadas.
 */
public class Main {

    /**
     * Método principal del programa.
     *
     * @param args argumentos de línea de comandos.
     */
    public static void main(String[] args) {

        System.out.println("===== CASOS VÁLIDOS =====");

        try {
            Cliente cliente1 = new Cliente(
                    "Camila Andrea Torres Vargas",
                    "18.456.789-5",
                    "El Trauco",
                    1356,
                    "Puerto Varas",
                    "Región de Los Lagos",
                    "camila.torres@gmail.com"
            );

            Empleado empleado1 = new Empleado(
                    "Alberto López González",
                    "17.234.567-8",
                    "Avenida Felipe Flores",
                    16,
                    "Puerto Montt",
                    "Región de Los Lagos",
                    "felipe.flores@llanquihuetour.cl",
                    "Ejecutivo de reservas"
            );

            Colaborador colaborador1 = new Colaborador(
                    "Ana María López Fernández",
                    "12.345.678-9",
                    "Avenida Junior Playboy",
                    777,
                    "Llanquihue",
                    "Región de Los Lagos",
                    "ana.lopez@transporte.cl",
                    "Proveedor transporte"
            );

            Colaborador colaborador2 = new Colaborador(
                    "Carlos Enrique Muñoz Riquelme",
                    "15.456.789-K",
                    "Pasaje Chancho en Piedra",
                    1994,
                    "Frutillar",
                    "Región de Los Lagos",
                    "carlos.munoz@gmail.com",
                    "Guía turístico"
            );

            Persona[] personas = {
                    cliente1,
                    empleado1,
                    colaborador1,
                    colaborador2
            };

            for (Persona persona : personas) {
                System.out.println();
                System.out.println(persona);
                System.out.println("-----------------------------------");
            }

        } catch (NombreInvalidoException | RutInvalidoException |
                 DireccionInvalidaException | CorreoInvalidoException |
                 EmpleadoInvalidoException | ColaboradorInvalidoException e) {

            System.out.println("Error al crear los datos válidos:");
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("===== CASOS INVÁLIDOS =====");

        probarNombreInvalido();
        probarRutInvalido();
        probarDireccionInvalida();
        probarCorreoInvalido();
        probarEmpleadoInvalido();
        probarColaboradorInvalido();
    }

    /**
     * Prueba una validación inválida de nombre.
     */
    public static void probarNombreInvalido() {
        try {
            Cliente clienteInvalido = new Cliente(
                    "Felipe Camiroaga 123",
                    "18.456.789-5",
                    "Avenida Condorito",
                    2024,
                    "Puerto Varas",
                    "Región de Los Lagos",
                    "cliente@gmail.com"
            );

            System.out.println(clienteInvalido);

        } catch (NombreInvalidoException e) {
            System.out.println();
            System.out.println("Error de nombre:");
            System.out.println(e.getMessage());
        }
    }

    /**
     * Prueba una validación inválida de RUT.
     */
    public static void probarRutInvalido() {
        try {
            Cliente clienteInvalido = new Cliente(
                    "Amaya Forch",
                    "10.5545.59-",
                    "Tulio Triviño",
                    1313,
                    "Puerto Montt",
                    "Región de Los Lagos",
                    "cliente@gmail.com"
            );

            System.out.println(clienteInvalido);

        } catch (RutInvalidoException e) {
            System.out.println();
            System.out.println("Error de RUT:");
            System.out.println(e.getMessage());
        }
    }

    /**
     * Prueba una validación inválida de dirección.
     */
    public static void probarDireccionInvalida() {
        try {
            Cliente clienteInvalido = new Cliente(
                    "Juan Andrés Pérez Carter",
                    "18.456.789-5",
                    "Pasaje Mampato",
                    -12,
                    "Llanquihue",
                    "Región de Los Lagos",
                    "cliente@gmail.com"
            );

            System.out.println(clienteInvalido);

        } catch (DireccionInvalidaException e) {
            System.out.println();
            System.out.println("Error de dirección:");
            System.out.println(e.getMessage());
        }
    }

    /**
     * Prueba una validación inválida de correo.
     */
    public static void probarCorreoInvalido() {
        try {
            Cliente clienteInvalido = new Cliente(
                    "Mauricio Francisco Valenzuela Fuentes",
                    "18.456.789-5",
                    "Avenida Los Prisioneros",
                    1984,
                    "Frutillar",
                    "Región de Los Lagos",
                    "mauriciovalenzuela.gmail.com"
            );

            System.out.println(clienteInvalido);

        } catch (CorreoInvalidoException e) {
            System.out.println();
            System.out.println("Error de correo:");
            System.out.println(e.getMessage());
        }
    }

    /**
     * Prueba una validación inválida de empleado.
     */
    public static void probarEmpleadoInvalido() {
        try {
            Empleado empleadoInvalido = new Empleado(
                    "Felipe Andrés Flores González",
                    "17.234.567-8",
                    "Avenida La Magia del Sur",
                    1962,
                    "Puerto Varas",
                    "Región de Los Lagos",
                    "felipe.flores@llanquihuetour.cl",
                    ""
            );

            System.out.println(empleadoInvalido);

        } catch (EmpleadoInvalidoException e) {
            System.out.println();
            System.out.println("Error de empleado:");
            System.out.println(e.getMessage());
        }
    }

    /**
     * Prueba una validación inválida de colaborador.
     */
    public static void probarColaboradorInvalido() {
        try {
            Colaborador colaboradorInvalido = new Colaborador(
                    "Pedro Pablo Soto Martínez",
                    "19.111.222-3",
                    "Instituto Aplaplac",
                    1987,
                    "Puerto Montt",
                    "Región de Los Lagos",
                    "pedro.soto@gmail.com",
                    "Fotógrafo"
            );

            System.out.println(colaboradorInvalido);

        } catch (ColaboradorInvalidoException e) {
            System.out.println();
            System.out.println("Error de colaborador:");
            System.out.println(e.getMessage());
        }
    }
}