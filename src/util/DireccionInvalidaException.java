package util;

/**
 * Excepción personalizada para representar errores relacionados con una dirección inválida.
 */

public class DireccionInvalidaException extends IllegalArgumentException {

    public DireccionInvalidaException(String mensaje) {
        super(mensaje);
    }
}
