package model.persona;

/**
 * Representa a un cliente de Llanquihue Tour.
 * Hereda los datos generales desde la clase Persona.
 */
public class Cliente extends Persona {

    /**
     * Constructor de la clase Cliente.
     *
     * @param nombreCompleto nombre completo del cliente
     * @param numeroRut RUT del cliente
     * @param calle calle de la dirección
     * @param numeroDireccion número de la dirección
     * @param ciudad ciudad de la dirección
     * @param region región de la dirección
     * @param email correo electrónico del cliente
     */
    public Cliente(String nombreCompleto, String numeroRut,
                   String calle, int numeroDireccion, String ciudad, String region,
                   String email) {
        super(nombreCompleto, numeroRut, calle, numeroDireccion, ciudad, region, email);
    }

    /**
     * Método toString()
     * Retorna la información del cliente en formato legible.
     *
     * @return representación textual del cliente.
     */
    @Override
    public String toString() {
        return "CLIENTE" +
                "\n" + super.toString();
    }
}
