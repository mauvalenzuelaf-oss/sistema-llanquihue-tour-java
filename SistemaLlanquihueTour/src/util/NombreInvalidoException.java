package util;

/**
 * Excepción personalizada para representar errores relacionados con un nombre inválido.
 */

public class NombreInvalidoException extends IllegalArgumentException {

    public NombreInvalidoException(String mensaje) {
        super(mensaje);
    }
}
