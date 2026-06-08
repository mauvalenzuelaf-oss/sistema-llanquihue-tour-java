package model.datos;

import util.CorreoInvalidoException;

/**
 * Representa y valida el correo electrónico de una persona.
 * Esta clase se utiliza como composición dentro de Persona.
 */

public class Correo {

    private String email;

    /**
     * Constructor de la clase Correo.
     *
     * @param email correo electrónico ingresado.
     */
    public Correo(String email) {
        setEmail(email);
    }

    /**
     * Retorna el correo electrónico validado.
     *
     * @return correo electrónico.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Asigna y valida el correo electrónico.
     * El correo no puede estar vacío, debe contener arroba y punto.
     *
     * @param email correo electrónico ingresado.
     */
    public void setEmail(String email) {

        if (email == null || email.trim().isEmpty()) {
            throw new CorreoInvalidoException("El correo no puede estar vacío.");
        }

        String finalEmail = email.trim();

        if (!finalEmail.contains("@")) {
            throw new CorreoInvalidoException("El correo debe contener el carácter '@'.");
        }

        if (!finalEmail.contains(".")) {
            throw new CorreoInvalidoException("El correo debe contener un punto.");
        }

        this.email = finalEmail;
    }

    /**
     * Método toString()
     * Retorna el correo electrónico en formato legible.
     *
     * @return representación textual del correo.
     */
    @Override
    public String toString() {
        return "Correo: " + email;
    }
}