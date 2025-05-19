package co.edu.uniquindio.estacionpeaje;

public class Recaudador extends Persona {
    private double SalarioMensual;

    public Recaudador(String nombre, String apellido, String nroDocumento, String fechaNacimiento, double SalarioMensual) {
        super (nombre, apellido,nroDocumento,fechaNacimiento);
        this.SalarioMensual = SalarioMensual;
    }

    //GETTERS AND SETTERS

    public void getSalarioMensual() {
        this.SalarioMensual = SalarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        SalarioMensual = salarioMensual;
    }
}
