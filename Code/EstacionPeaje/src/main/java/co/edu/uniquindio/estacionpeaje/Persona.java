package co.edu.uniquindio.estacionpeaje;

public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected String nroDocumento;
    protected String fechaNacimiento;

    public Persona(String nombre, String apellido, String nroDocumento, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroDocumento = nroDocumento;
        this.fechaNacimiento = fechaNacimiento;
    }

    //GETTERS AND SETTERS

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }
}
