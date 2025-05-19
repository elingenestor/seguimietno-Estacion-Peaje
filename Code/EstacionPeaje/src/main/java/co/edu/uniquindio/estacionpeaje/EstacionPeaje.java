package co.edu.uniquindio.estacionpeaje;

import java.util.ArrayList;
import java.util.List;

public class EstacionPeaje {
    private String nombre;
    private String departamentoLocalizado;
    private double valorTotalRecaudado;
    private ArrayList<Vehiculo> listaCarro;
    private ArrayList<Vehiculo> listaMoto;
    private ArrayList<Vehiculo> listaCamion;
    private ArrayList<Persona> listaConductores;
    private ArrayList<Persona> listaRecaudadores;

        public EstacionPeaje(String nombre, String departamentoLocalizado) {
            this.nombre = nombre;
            this.departamentoLocalizado = departamentoLocalizado;
            this.valorTotalRecaudado = 0;
            this.listaCarro = new ArrayList<>();
            this.listaMoto = new ArrayList<>();
            this.listaCamion = new ArrayList<>();
            this.listaConductores = new ArrayList<>();
            this.listaRecaudadores = new ArrayList<>();
        }

        // GETTERS AND SETTERS


    public String getDepartamentoLocalizado() {
        return departamentoLocalizado;
    }

    public void setDepartamentoLocalizado(String departamentoLocalizado) {
        this.departamentoLocalizado = departamentoLocalizado;
    }

    public ArrayList<Vehiculo> getListaCamion() {
        return listaCamion;
    }

    public void setListaCamion(ArrayList<Vehiculo> listaCamion) {
        this.listaCamion = listaCamion;
    }

    public ArrayList<Vehiculo> getListaCarro() {
        return listaCarro;
    }

    public void setListaCarro(ArrayList<Vehiculo> listaCarro) {
        this.listaCarro = listaCarro;
    }

    public ArrayList<Persona> getListaConductores() {
        return listaConductores;
    }

    public void setListaConductores(ArrayList<Persona> listaConductores) {
        this.listaConductores = listaConductores;
    }

    public ArrayList<Vehiculo> getListaMoto() {
        return listaMoto;
    }

    public void setListaMoto(ArrayList<Vehiculo> listaMoto) {
        this.listaMoto = listaMoto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValorTotalRecaudado() {
        return valorTotalRecaudado;
    }

    public void setValorTotalRecaudado(double valorTotalRecaudado) {
        this.valorTotalRecaudado = valorTotalRecaudado;
    }

    //METODOS CREAR

    public boolean crearCarro(String placa,int peajesPagos,boolean electrico, boolean servicioPublico){
            boolean flag = false;

            for(Vehiculo vehiculo : listaCarro){
                if(vehiculo.getPlaca().equals(placa)){
                    return flag;
                }
            }
             Carro newVehiculo = new Carro(placa,peajesPagos,electrico, servicioPublico);
            listaCarro.add(newVehiculo);
             flag = true;
             return flag;
    }
    public boolean crearCamion(String placa,int peajesPagos, int numeroEjes, int capacidadCarga){
        boolean flag = false;

        for(Vehiculo vehiculo : listaCamion){
            if(vehiculo.getPlaca().equals(placa)){
                return flag;
            }
        }
        Camion newVehiculo = new Camion(placa, peajesPagos, numeroEjes, capacidadCarga);
        listaCamion.add(newVehiculo);
        flag = true;
        return flag;
    }
    public boolean crearMoto(String placa, int peajesPagos, int cilindraje){
            boolean flag = false;

            for(Vehiculo vehiculo : listaMoto){
                if(vehiculo.getPlaca().equals(placa)){
                    return flag;
                }
            }
            Moto newVehiculo = new Moto(placa, peajesPagos, cilindraje);
            listaMoto.add(newVehiculo);
            flag = true;
            return flag;
    }
    public boolean crearConductor(String nombre, String apellido, String nroDocumento, String fechaNacimiento, ArrayList<Vehiculo> listaVehiculosAsignados){
            boolean flag = false;
            for(Persona persona : listaConductores){
                if(persona.getNroDocumento().equals(nroDocumento)){
                    return flag;
                }
            }
            Conductor newConductor = new Conductor(nombre, apellido, nroDocumento, fechaNacimiento);
            listaConductores.add(newConductor);
            flag = true;
            return flag;
    }
    public boolean crearRecaudador (String nombre, String apellido, String nroDocumento, String fechaNacimiento, double salarioMensual) {
        boolean flag = false;
        for (Persona persona : listaRecaudadores) {
            if (persona.getNroDocumento().equals(nroDocumento)) {
                return flag;
            }
        }
        Recaudador newRecaudador = new Recaudador(nombre, apellido, nroDocumento, fechaNacimiento, salarioMensual);
        listaRecaudadores.add(newRecaudador);
        flag = true;
        return flag;
    }

    //METODOS DE COINCIDENCIA

    public Integer encontrarPlacaCarro (String placa){
            Integer pocision = null;
            for(int i = 0; i < listaCarro.size(); i++){
                if(listaCarro.get(i).getPlaca().equals(placa)){
                    return i;

                }
            }
            return null;
    }

    public Integer encontrarPlacaMoto (String placa){
            Integer pocision = null;
            for(int i = 0; i < listaMoto.size(); i++){
                if(listaMoto.get(i).getPlaca().equals(placa)){
                    return i;
                }
            }
            return null;
        }
    public Integer encontrarPlacaCamion (String placa){
            Integer pocision = null;
            for(int i = 0; i < listaCamion.size(); i++){
                if(listaCamion.get(i).getPlaca().equals(placa)){
                    return i;
                }
            }
            return null;
    }
    public Integer encoontrarPlacaMoto (String placa){
            Integer pocision = null;
            for(int i = 0; i < listaMoto.size(); i++){
                if(listaMoto.get(i).getPlaca().equals(placa)){
                    return i;
                }
            }
            return null;
    }
    public Integer encontrarIdConductor (String nroDocumento){
            Integer pocision = null;
            for(int i = 0; i < listaConductores.size(); i++){
                if(listaConductores.get(i).getNroDocumento().equals(nroDocumento)){
                    return i;
                }
            }
            return null;
    }
    public Integer encontrarIdRecaudador (String nroDocumento){
            Integer pocision = null;
            for(int i = 0; i < listaRecaudadores.size(); i++){
                if(listaRecaudadores.get(i).getNroDocumento().equals(nroDocumento)){
                    return i;
                }
            }
            return null;
    }

    public Vehiculo buscarVehiculoPorPlaca(String placa){
        for(Vehiculo vehiculo : listaCarro){
            if(vehiculo.getPlaca().equals(placa)){
                return vehiculo;
            }
        }
        for(Vehiculo vehiculo : listaMoto){
            if(vehiculo.getPlaca().equals(placa)){
                return vehiculo;
            }
        }
        for(Vehiculo vehiculo : listaCamion){
            if(vehiculo.getPlaca().equals(placa)){
                return vehiculo;
            }
        }
        return null;
    }

    //METODOS DE ELIMINACION

    public boolean eliminarCarro(String placa){
        Integer posicion = encontrarPlacaCarro(placa);
        if (posicion != null) {
            listaCarro.remove(posicion);
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminarMoto(String placa){
            Integer posicion = encontrarPlacaMoto(placa);
            if (posicion != null) {
                listaMoto.remove(posicion);
                return true;
            } else {
                return false;
            }
    }
    public boolean eliminarCamion(String placa){
            Integer posicion = encontrarPlacaCamion(placa);
            if (posicion != null) {
                listaCamion.remove(posicion);
                return true;
            } else {
                return false;
            }
    }
    public boolean eliminarConductor(String nroDocumento){
            Integer posicion = encontrarIdConductor(nroDocumento);
            if (posicion != null) {
                listaConductores.remove(posicion);
                return true;
            } else {
                return false;
            }
    }
    public boolean eliminarRecaudador(String nroDocumento){
            Integer posicion = encontrarIdRecaudador(nroDocumento);
            if (posicion != null) {
                listaRecaudadores.remove(posicion);
                return true;
            } else {
                return false;
            }
    }

    //BUSCAR Y VER INFO

    public Carro verInfoCarro(String placa){
            for(Vehiculo vehiculo : listaCarro){
                if(vehiculo.getPlaca().equals(placa)){
                    return (Carro) vehiculo;
                }
            }
            return null;
    }
    public Moto verInfoMoto(String placa){
            for(Vehiculo vehiculo : listaMoto){
                if(vehiculo.getPlaca().equals(placa)){
                    return (Moto) vehiculo;
                }
            }
            return null;
    }
    public Camion verInfoCamion(String placa){
            for(Vehiculo vehiculo : listaCamion){
                if(vehiculo.getPlaca().equals(placa)){
                    return (Camion) vehiculo;
                }
            }
            return null;
    }
    public Conductor verInfoConductor(String nroDocumento){
            for(Persona persona : listaConductores){
                if(persona.getNroDocumento().equals(nroDocumento)){
                    return (Conductor) persona;
                }
            }
            return null;
    }
    public Recaudador verInfoRecaudador(String nroDocumento){
            for(Persona persona : listaRecaudadores){
                if(persona.getNroDocumento().equals(nroDocumento)){
                    return (Recaudador) persona;
                }
            }
            return null;
    }
    //
}
