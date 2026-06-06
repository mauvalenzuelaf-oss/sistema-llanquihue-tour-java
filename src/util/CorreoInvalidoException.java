package util;

/**
 * Excepción personalizada para representar errores relacionados con un correo electrónico inválido.
 */

public class CorreoInvalidoException extends IllegalArgumentException {

    public CorreoInvalidoException(String mensaje) {
        super(mensaje);
    }
}
