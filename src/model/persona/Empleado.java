package model.persona;

import util.EmpleadoInvalidoException;

/**
 * Representa a un empleado interno de Llanquihue Tour.
 * Hereda los datos generales comunes desde la clase Persona.
 */
public class Empleado extends Persona {

    private String cargo;

    /**
     * Constructor de la clase Empleado.
     *
     * @param nombreCompleto nombre completo del empleado
     * @param numeroRut RUT del empleado
     * @param calle calle de la dirección
     * @param numeroDireccion número de la dirección
     * @param ciudad ciudad de la dirección
     * @param region región de la dirección
     * @param email correo electrónico del empleado
     * @param cargo cargo que ocupa el empleado
     *
     */
    public Empleado(String nombreCompleto, String numeroRut,
                    String calle, int numeroDireccion, String ciudad, String region,
                    String email, String cargo) {

        super(nombreCompleto, numeroRut, calle, numeroDireccion, ciudad, region, email);
        setCargo(cargo);
    }

    // Getters y Setters
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        if (cargo == null || cargo.trim().isEmpty()) {
            throw new EmpleadoInvalidoException("El cargo del empleado no puede estar vacío.");
        }

        this.cargo = cargo.trim();
    }

    /**
     * Metodo toString()
     * Retorna la información del empleado en formato legible.
     *
     * @return representación textual del empleado.
     */
    @Override
    public String toString() {
        return "EMPLEADO" +
                "\n" + super.toString() +
                "\nCargo: " + cargo;
    }
}
