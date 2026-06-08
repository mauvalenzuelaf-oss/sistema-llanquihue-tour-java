package model.persona;

import model.datos.Correo;
import model.datos.Direccion;
import model.datos.NombreCompleto;
import model.datos.Rut;

/**
 * Clase base que representa a una persona vinculada a Llanquihue Tour.
 * Contiene los datos comunes de clientes, empleados y colaboradores.
 */
public class Persona {

    private NombreCompleto nombreCompleto;
    private Rut rut;
    private Direccion direccion;
    private Correo correo;

    /**
     * Constructor de la clase Persona.
     *
     * @param nombreCompleto nombre completo de la persona
     * @param numeroRut RUT de la persona
     * @param calle calle de la dirección
     * @param numeroDireccion número de la dirección
     * @param ciudad ciudad de la dirección
     * @param region región de la dirección
     * @param email correo electrónico de la persona
     */
    public Persona(String nombreCompleto, String numeroRut,
                   String calle, int numeroDireccion, String ciudad, String region,
                   String email) {

        this.nombreCompleto = new NombreCompleto(nombreCompleto);
        this.rut = new Rut(numeroRut);
        this.direccion = new Direccion(calle, numeroDireccion, ciudad, region);
        this.correo = new Correo(email);
    }

    // Getters y Setters
    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = new NombreCompleto(nombreCompleto);
    }

    public Rut getRut() {
        return rut;
    }

    public void setRut(String numeroRut) {
        this.rut = new Rut(numeroRut);
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(String calle, int numeroDireccion, String ciudad, String region) {
        this.direccion = new Direccion(calle, numeroDireccion, ciudad, region);
    }

    public Correo getCorreo() {
        return correo;
    }

    public void setCorreo(String email) {
        this.correo = new Correo(email);
    }

    /**
     * Metodo toString()
     * Retorna los datos comunes de la persona en formato legible.
     *
     * @return representación textual de la persona.
     */
    @Override
    public String toString() {
        return nombreCompleto +
                "\n" + rut +
                "\n" + direccion +
                "\n" + correo;
    }
}
