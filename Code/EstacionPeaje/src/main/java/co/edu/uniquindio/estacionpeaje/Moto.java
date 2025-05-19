package co.edu.uniquindio.estacionpeaje;

public class Moto extends Vehiculo {
    private int cilindraje;
    public Moto(String placa, int peajesPagos, int cilindraje) {
        super(placa, peajesPagos);
        this.cilindraje = cilindraje;
    }
     //GETTER AND SETTER
    public int getCilindraje() {
        return cilindraje;
    }
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
    @Override
    public double calcularTarifa(){
        double peaje = 5000;
        if(cilindraje > 200){
            peaje += 2000;
            //recaro adicional
        }
        return peaje;
    }
    @Override
    public String descripcion(){
        return "Moto - Placa: " + getPlaca() + "Cilindraje: " + cilindraje;
    }
}

