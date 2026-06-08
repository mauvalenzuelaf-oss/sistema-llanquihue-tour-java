package util;

/**
 * Excepción personalizada para representar errores relacionados con el ingreso no válido de los datos de un colaborador.
 */
public class ColaboradorInvalidoException extends IllegalArgumentException {

    public ColaboradorInvalidoException(String mensaje) {
        super(mensaje);
    }
}