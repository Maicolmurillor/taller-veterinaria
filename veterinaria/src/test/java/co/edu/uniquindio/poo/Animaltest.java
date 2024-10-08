package co.edu.uniquindio.poo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.platform.commons.annotation.Testable;

import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Animaltest {
    private Veterinaria veterinaria;

    @BeforeAll
    public void setUp() {
        veterinaria = new Veterinaria("Mi Veterinaria", "Calle 123", "123456789");
    }

    @Testable
    public void testAgregarPerro() {
        Perro perro = new Perro("Fido", 3, 10.5, "Labrador");
        veterinaria.agregarPerro(perro);
        assertEquals(1, veterinaria.perros.size());
    }

    @Testable
    public void testAgregarGato() {
        Gato gato = new Gato("Miau", 2, 5.0, "Negro");
        veterinaria.agregarGato(gato);
        assertEquals(1, veterinaria.gatos.size());
    }

    @Testable
    public void testAgregarAguila() {
        Aguila aguila = new Aguila("Aquila", 5, 3.0, 2.5);
        veterinaria.agregarAguila(aguila);
        assertEquals(1, veterinaria.aguilas.size());
    }

    @Testable
    public void testAgregarLeon() {
        Leon leon = new Leon("Simba", 4, 150.0, "Rubia");
        veterinaria.agregarLeon(leon);
        assertEquals(1, veterinaria.leones.size());
    }

    @Testable
    public void testAgregarAve() {
        Ave ave = new Ave("sokol", 3, 1.5, 4);
        veterinaria.agregarAve(ave);
        assertEquals(1, veterinaria.aves.size());
    }
}

public class AnimalTest {
    @Testable
    public void testPerroComer() {
        Perro perro = new Perro("Fido", 3, 10.5, "Labrador");
        perro.comer();  // Solo se ejecuta el método, no hay aserciones
    }

    @Testable
    public void testGatoComer() {
        Gato gato = new Gato("Miau", 2, 5.0, "Negro");
        gato.comer();  // Solo se ejecuta el método, no hay aserciones
    }

    @Testable
    public void testAguilaComer() {
        Aguila aguila = new Aguila("Aquila", 5, 3.0, 2.5);
        aguila.comer();  // Solo se ejecuta el método, no hay aserciones
    }

    @Testable
    public void testLeonComer() {
        Leon leon = new Leon("Simba", 4, 150.0, "Rubia");
        leon.comer();  // Solo se ejecuta el método, no hay aserciones
    }
}

public class DueñoTest {
    private Dueño dueño;

    @BeforeAll
    public void setUp() {
        dueño = new Dueño("Juan", "Pérez", "987654321", "Calle 456");
        dueño.gatos = new LinkedList<>(); // Inicializamos la lista de gatos
    }

    @Testable
    public void testAgregarGato() {
        Gato gato = new Gato("Miau", 2, 5.0, "Negro");
        dueño.agregarGato(gato);
        assertEquals(1, dueño.gatos.size());
    }

    // Asegúrate de modificar el método agregarGato en la clase Dueño
    public void agregarGato(Gato gatos) {
        gatos.add(gatos);
    }
}
