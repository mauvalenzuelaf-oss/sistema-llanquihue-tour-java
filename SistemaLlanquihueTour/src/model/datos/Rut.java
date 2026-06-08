package model.datos;

import util.RutInvalidoException;

/**
 * Representa y valida un RUT chileno.
 * Esta clase se utiliza como composición dentro de Persona.
 */

public class Rut {

    // Número del RUT en formato String
    private String numero;

    /**
     * Constructor que recibe el RUT y valida su formato.
     *
     * @param numeroRUT Rut ingresdo por el usuario.
     */
    public Rut(String numeroRUT) {
        setNumero(numeroRUT);
    }

    /**
     * Retorna el numero de RUT.
     *
     * @return número de RUT.
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Asigna y valida el número de RUT.
     * El RUT no puede estar vacío y debe cumplir un formato básico.
     *
     * @param numeroRUT RUT ingresado por el usuario.
     */
    public void setNumero(String numeroRUT) {
        if (numeroRUT == null || numeroRUT.trim().isEmpty()) {
            throw new RutInvalidoException("El RUT no puede estar vacío.");
        }

        String finalRUT = numeroRUT.trim();
        finalRUT= finalRUT.replace(".", "");
        finalRUT = finalRUT.toUpperCase();

        if(!finalRUT.matches("[0-9]+-[0-9kK]")) {
            throw new RutInvalidoException(
                    "Formato de RUT no válido. Ejemplo válido: 12345678-K."
            );
        }

        this.numero = finalRUT;
    }

    /**
     * Método toString()
     * Retorna el RUT en formato legible.
     *
     * @return representación textual del RUT.
     */
    @Override
    public String toString() {
        return "Rut: " + numero;
    }
}
