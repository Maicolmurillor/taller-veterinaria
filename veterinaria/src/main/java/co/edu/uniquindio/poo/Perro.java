package co.edu.uniquindio.poo;

public class Perro extends Animal {
    private String raza;

    public Perro (String nombre, int edad,double peso, String raza){
        super(nombre, edad, peso);
        this.raza=raza;

    }
    @Override
    public void comer(){
        System.out.println(nombre + " de raza " +raza+  " esta comiendo");
    }
    @Override
    public void dormir(){
        System.out.println(nombre + " de raza " +raza+  " esta durmiendo.");
    }
    public String getRaaza(){
        return raza;
    }
    @Override
    public String toString() {
        return "de raza " + raza;
    }
    public void add(Perro perros) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
}
