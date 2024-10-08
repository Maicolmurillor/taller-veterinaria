package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Dueño {
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    Perro perros;
    LinkedList<Gato>gatos;
    
    public Dueño(String nombre, String apellido, String telefono, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "el dueño: " + nombre + ", apellido: " + apellido + ", telefono:" + telefono + ", direccion:"
                + direccion + ", perros:" + perros + ", gatos:" + gatos;
    }

    public void agregarPerro (Perro perro){
        perros.add(perros);
    }

    public void agregarGato (Gato gatos){
        gatos.add(gatos);
    }

    public void mostrarMensaje(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarMensaje'");
    }    
    
}
