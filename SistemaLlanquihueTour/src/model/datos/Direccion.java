package model.datos;

import util.DireccionInvalidaException;

/**
 * Representa la dirección física de una persona vinculada a Llanquihue Tour.
 * Esta clase se utiliza como composición dentro de Persona.
 */
public class Direccion {

    // Atributos
    private String calle;
    private int numero;
    private String ciudad;
    private String region;

    /**
     * Constructor de la clase Direccion
     *
     * @param calle nombre de la calle de la persona
     * @param numero numero de la calle de la persona
     * @param ciudad ciudad donde vive la persona
     * @param region region donde vive la persona
     */
    public Direccion(String calle, int numero, String ciudad, String region) {
        setCalle(calle);
        setNumero(numero);
        setCiudad(ciudad);
        setRegion(region);
    }

    // Getters y Setters

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        if (calle == null || calle.trim().isEmpty()) {
            throw new DireccionInvalidaException("El campo 'Calle' no puede estar vacío.");
        }
        this.calle = calle.trim();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            throw new DireccionInvalidaException("El número de la dirección debe ser mayor que cero.");
        }
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        if (ciudad == null || ciudad.trim().isEmpty()) {
            throw new DireccionInvalidaException("El campo 'Ciudad' no puede estar vacío.");
        }
        this.ciudad = ciudad.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) throws DireccionInvalidaException {
        if (region == null || region.trim().isEmpty()) {
            throw new DireccionInvalidaException("El campo 'Región' no puede estar vacío.");
        }
        this.region = region.trim();
    }

    /**
     * Metodo toString()
     * Retorna la dirección en formato legible.
     *
     * @return representación textual de la dirección.
     */
    @Override
    public String toString() {
        return "Dirección: " + calle + " #" + numero + ", " + ciudad + ", " + region;
    }
}
