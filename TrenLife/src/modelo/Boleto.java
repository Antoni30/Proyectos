
package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Boleto {
    public String nombre,direccion,telefono,ruta;
    public Date fechaViaje;
    public int numBoletos;

    public Boleto(String nombre, String direccion, String telefono, Date fechaViaje, int numBoletos,String ruta) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaViaje = fechaViaje;
        this.numBoletos = numBoletos;
        this.ruta=ruta;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(Date fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public int getNumBoletos() {
        return numBoletos;
    }

    public void setNumBoletos(int numBoletos) {
        this.numBoletos = numBoletos;
    }
    public String formatoBoleto()
    {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MMMM/yyyy");
        SimpleDateFormat hora = new SimpleDateFormat("hh:mm:ss");
        Date fecha = new Date();
        return "Nombre: "+this.nombre+"\nDireccion: "+this.direccion+"\nTefefono: "+this.telefono+"\nFecha de Viaje: "+formato.format(fechaViaje)+"\nFecha y hora  de Compra de Boleto: "+formato.format(fecha)+" "+hora.format(new Date())+"\nRuta: "+this.ruta;
    }
}
