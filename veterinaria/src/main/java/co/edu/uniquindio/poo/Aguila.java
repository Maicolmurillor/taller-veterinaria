package co.edu.uniquindio.poo;

public class Aguila extends Animal {
    private double envergaduraAla;

    public Aguila(String nombre, int edad, double peso, double envergaduraAla){
        super(nombre, edad, peso);
        this.envergaduraAla=envergaduraAla;

    }
    @Override
    public void comer(){
        System.out.println(getNombre() + " esta cazando o cimiendo.");
    }

    @Override
    public void dormir(){
        System.out.println(getNombre()+ " esta durmiendo.");
    }

    public double getEnvergaduraAla(){
        return envergaduraAla;
    }
    @Override
    public String toString() {
        return "de envergadura" + envergaduraAla;
    }
    public void add(Aguila aguilas) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
}
    

