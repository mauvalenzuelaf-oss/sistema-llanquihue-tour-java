package util;

/**
 * Excepción personalizada para representar errores relacionados con el ingreso de datos no válidos de un empleado.
 */
public class EmpleadoInvalidoException extends IllegalArgumentException {

    public EmpleadoInvalidoException(String mensaje) {
        super(mensaje);
    }
}
