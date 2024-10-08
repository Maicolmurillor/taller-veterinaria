package co.edu.uniquindio.poo;

public class App {
public static void main(String[] args) {
    // Crear perro, gato, aguila y leon
    Perro perro = new Perro("max", 5, 40.0, "pastor aleman");
    Perro perro1 = new Perro("rex", 8, 20.0, "pitbull");
    Gato gato = new Gato("Eli", 4, 20.0, "negro");
    Gato gato1 = new Gato("mono", 9, 10.0, "blanco");
    Aguila aguila = new Aguila("rex", 12, 30.0, 15);
    Leon leon = new Leon("", 15, 40.0, "si");

    // Crear instancia de veterinaria
    Veterinaria veterinaria = new Veterinaria("clinica animal", "carrera 5", "3456784390");

    // Agregar animales a la veterinaria
    veterinaria.agregarPerro(perro);
    veterinaria.agregarGato(gato);
    veterinaria.agregarAguila(aguila);
    veterinaria.agregarLeon(leon);

    // Mostrar mensaje de la veterinaria
    Veterinaria.mostrarMensaje(veterinaria.toString());

    Dueño dueño = new Dueño("michael", "murillo", "3218943601", "mz 5");
    Dueño dueño1 = new Dueño("camila", "murillo", "3456789021", "mz 5");

    dueño.agregarGato(gato);
    dueño.agregarPerro(perro);

    dueño1.agregarGato(gato1);
    dueño1.agregarPerro(perro1);

    dueño.mostrarMensaje(dueño.toString());
    


}
}
