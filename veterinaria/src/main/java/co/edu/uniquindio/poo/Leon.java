package co.edu.uniquindio.poo;

public class Leon extends Animal{
    private String melena;

    public Leon(String nombre, int edad, double peso, String melena){
        super(nombre, edad, peso);
        this.melena=melena;

    }
    @Override
    public void comer(){
        System.out.println(nombre+ " que " +melena+ " tiene melena, esta cazando o comiendo."); //decir si tiene o no melena 
    }

    @Override
    public void dormir(){
        System.out.println(nombre+ " que " +melena+ " tiene melena, esta durmiendo");
    }

    public String getMelena(){
        return melena;
    }
    @Override
    public String toString() {
        return "de melena" +melena;
    }
    public void add(Leon leones) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
}
