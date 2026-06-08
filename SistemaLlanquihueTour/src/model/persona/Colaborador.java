package model.persona;

import util.ColaboradorInvalidoException;

/**
 * Representa a un colaborador externo vinculado a Llanquihue Tour.
 * Un colaborador puede ser guía turístico, operador local,
 * proveedor de transporte o proveedor de alojamiento.
 */
public class Colaborador extends Persona {

    private String tipoColaborador;

    /**
     * Constructor de la clase Colaborador.
     *
     * @param nombreCompleto nombre completo del colaborador
     * @param numeroRut RUT del colaborador
     * @param calle calle de la dirección
     * @param numeroDireccion número de la dirección
     * @param ciudad ciudad de la dirección
     * @param region región de la dirección
     * @param email correo electrónico del colaborador
     * @param tipoColaborador tipo de colaborador
     */
    public Colaborador(String nombreCompleto, String numeroRut,
                       String calle, int numeroDireccion, String ciudad, String region,
                       String email, String tipoColaborador) {
        super(nombreCompleto, numeroRut, calle, numeroDireccion, ciudad, region, email);
        setTipoColaborador(tipoColaborador);
    }

    /**
     * Getters y Setters
     *
     * getTipoColaborador()
     * Retorna el tipo de colaborador
     * @return tipo de colaborador.
     *
     * setTipoColaborador(String tipoColaborador)
     * Asigna y valida el tipo de colaborador.
     * Solo se aceptan cuatro tipos:
     * -Guía turístico.
     * -Operador local.
     * -Proveedor transporte.
     * -Proveedor de alojamiento.
     * @param tipoColaborador tipo de colaborador ingresado.
     */
    public String getTipoColaborador() {
        return tipoColaborador;
    }

    public void setTipoColaborador(String tipoColaborador) {

        if (tipoColaborador == null || tipoColaborador.trim().isEmpty()) {
            throw new ColaboradorInvalidoException("El tipo de colaborador no puede estar vacío.");
        }

        String finalTipoColaborador = tipoColaborador.trim().toLowerCase();

        switch (finalTipoColaborador) {
            case "guía turístico":
                this.tipoColaborador = "Guía turístico";
                break;

            case "operador local":
                this.tipoColaborador = "Operador local";
                break;

            case "proveedor transporte":
                this.tipoColaborador = "Proveedor transporte";
                break;

            case "proveedor de alojamiento":
                this.tipoColaborador = "Proveedor de alojamiento";
                break;

            default:
                throw new ColaboradorInvalidoException(
                        "Tipo de colaborador inválido. Debe ser: Guía turístico, Operador local, Proveedor transporte o Proveedor de alojamiento."
                );
        }
    }

    /**
     * Metodo toString()
     * Retorna la información del colaborador en formato legible.
     *
     * @return representación textual del colaborador.
     */
    @Override
    public String toString() {
        return "COLABORADOR" +
                "\n" + super.toString() +
                "\nTipo de colaborador: " + tipoColaborador;
    }
}