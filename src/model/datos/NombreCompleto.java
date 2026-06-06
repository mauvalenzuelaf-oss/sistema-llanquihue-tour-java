package model.datos;

import util.NombreInvalidoException;

/**
 * Representa y valida el nombre completo de una persona.
 * Esta clase se utiliza como composición dentro de Persona.
 */

public class NombreCompleto {

    private String nombre;

    /**
     * Constructor de la clase Nombre.
     *
     * @param nombre nombre completo ingresado.
     */
    public NombreCompleto(String nombre) {
        setNombre(nombre);
    }

    /**
     * Retorna el nombre completo validado.
     *
     * @return nombre completo de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna y valida el nombre completo.
     * El nombre no puede estar vacío y solo puede contener letras,
     * espacios, guiones o apóstrofes.
     *
     * @param nombre nombre completo ingresado.
     */
    public void setNombre(String nombre) {

        if (nombre == null || nombre.trim().isEmpty()) {
            throw new NombreInvalidoException("El campo 'Nombre' no puede estar vacío.");
        }

        String finalNombre = nombre.trim();

        /*
         * Permite:
         * - Letras de distintos idiomas
         * - Tildes, como en "Pérez"
         * - Ñ, como en "Muñoz"
         * - Espacios como en "Juan Andrés González González'
         * - Apóstrofes, como en "Sinnead O'Connor".
         * - Guiones, como en "Marco Enriquez-Ominami"
         */
        if (!finalNombre.matches("[\\p{L}\\s'-]+")) {
            throw new NombreInvalidoException(
                    "El nombre completo solo puede contener letras, espacios, guiones o apóstrofes."
            );
        }

        this.nombre = finalNombre;
    }

    /**
     * Metodo toString()
     * Retorna el nombre completo en formato legible.
     *
     * @return representación textual del nombre completo.
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre;
    }
}