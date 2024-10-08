package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Veterinaria {
    private String nombre;
    private String direccion;
    private String telefono;
    LinkedList<Perro> perros = new LinkedList<>();
    LinkedList<Gato> gatos = new LinkedList<>();
    LinkedList<Aguila> aguilas = new LinkedList<>();
    LinkedList<Leon> leones = new LinkedList<>();
    LinkedList<Ave> aves = new LinkedList<>();

    public Veterinaria(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
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

    @Override
    public String toString() {
        return "El nombre es: " + nombre + " \n la dirección es: " + direccion + " \n el teléfono: " + telefono;
    }
    
    public void agregarPerro(Perro perro) {
        perros.add(perro);
    }

    public void agregarGato(Gato gato) {
        gatos.add(gato);
    }

    public void agregarAguila(Aguila aguila) {
        aguilas.add(aguila);
    }

    public void agregarLeon(Leon leon) {
        leones.add(leon);
    }

    public void agregarAve(Ave ave) {
        aves.add(ave);
    }
    
    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}

