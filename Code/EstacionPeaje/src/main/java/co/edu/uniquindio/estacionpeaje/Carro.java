package co.edu.uniquindio.estacionpeaje;

public class Carro extends Vehiculo {
    private boolean electrico;
    private boolean servicioPublico;
    public Carro(String placa, int peajesPagos, boolean electrico, boolean servicioPublico) {
        super(placa, peajesPagos);
        this.electrico = electrico;
        this.servicioPublico = servicioPublico;
    }

    //GETTERS AND SETTERS


    public boolean isElectrico() {
        return electrico;
    }

    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }

    public boolean isServicioPublico() {
        return servicioPublico;
    }

    public void setServicioPublico(boolean servicioPublico) {
        this.servicioPublico = servicioPublico;
    }

    @Override
    public double calcularTarifa(){
        double tarifaBase = 10000;
        if (electrico){
            tarifaBase *= 0.8;
            // descuento del 20%
        }
        if(servicioPublico){
            tarifaBase *= 1.15;
            //Incremento del 15%
        }
        return tarifaBase;
    }
    @Override
    public String descripcion(){
        return "Carro - Placa: " + getPlaca() + "Electrico: " + electrico + "Servicio Publico: " + servicioPublico;
    }
}
