package co.edu.uniquindio.estacionpeaje;

public class Camion extends Vehiculo {
    private int numeroEjes;
    private int CapacidadCarga;
    public Camion(String placa, int peajesPagos, int numeroEjes, int CapacidadCarga) {
        super(placa, peajesPagos);
        this.numeroEjes = numeroEjes;
        this.CapacidadCarga = CapacidadCarga;
    }
    //GETTER AND SETTERS

    public int getCapacidadCarga() {
        return CapacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        CapacidadCarga = capacidadCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }
    @Override
    public double calcularTarifa (){
        double peaje = numeroEjes * 7000;
        if(CapacidadCarga > 10){
            peaje *= 1.1;
            //recargo del 10%
        }
        return peaje;
    }
    @Override
    public String descripcion(){
        return "Camion - Placa: " + getPlaca() + "Numero de Ejes: " + numeroEjes + "Capacidad de Carga: " + CapacidadCarga;
    }
}

