package co.edu.uniquindio.estacionpeaje;

import java.util.ArrayList;

public class Conductor extends Persona{
    private ArrayList<Vehiculo> listaVehiculosAsignados;

    public Conductor(String nombre, String apellido, String nroDocumento, String fechaNacimiento) {
        super(nombre, apellido, nroDocumento, fechaNacimiento);
        this.listaVehiculosAsignados = new ArrayList<>();
    }

    //GETTERS AND SETTERS

    public ArrayList<Vehiculo> getListaVehiculosAsignados() {
        return listaVehiculosAsignados;
    }

    public void setListaVehiculosAsignados(ArrayList<Vehiculo> listaVehiculosAsignados) {
        this.listaVehiculosAsignados = listaVehiculosAsignados;
    }
}
