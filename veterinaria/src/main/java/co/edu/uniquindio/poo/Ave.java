package co.edu.uniquindio.poo;

public class Ave extends Animal {
    private int envergadura;

    public Ave(String nombre, int edad, double peso, int envergadura) {
        super(nombre, edad, peso);
        this.envergadura = envergadura;
    }

    public int getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(int envergadura) {
        this.envergadura = envergadura;
    }
    
}
