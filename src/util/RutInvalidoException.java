package util;

/**
 * Excepción personalizada para representar errores relacionados con un RUT inválido.
 */

public class RutInvalidoException extends IllegalArgumentException {

    public RutInvalidoException(String mensaje) {
        super(mensaje);
    }
}
