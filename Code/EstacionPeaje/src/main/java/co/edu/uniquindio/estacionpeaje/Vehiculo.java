package co.edu.uniquindio.estacionpeaje;

public abstract class Vehiculo {
    protected String placa;
    protected int peajesPagos;
    protected double tarifaPeaje;

    public Vehiculo(String placa, int peajesPagos) {
        this.placa = placa;
        this.peajesPagos = peajesPagos;
        this.tarifaPeaje = calcularTarifa();
    }

    //GETTERS AND SETTERS


    public int getPeajesPagos() {
        return peajesPagos;
    }

    public void setPeajesPagos(int peajesPagos) {
        this.peajesPagos = peajesPagos;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public abstract double calcularTarifa();

    public abstract double calcularPeaje();

    public abstract String descripcion();
}
