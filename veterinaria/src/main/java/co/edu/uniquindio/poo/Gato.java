package co.edu.uniquindio.poo;

public class Gato extends Animal{
    private String colorPelo;

    public Gato(String nombre, int edad , double peso, String colorPelo){
        super(nombre, edad, peso);
        this.colorPelo=colorPelo;
        
    }
    @Override
    public void comer(){
        System.out.println(nombre +" de color " +colorPelo+ " esta comiendo.");
    }
    
    @Override
    public void dormir(){
        System.out.println(nombre +" de color " +colorPelo+ " esta durmiendo.");
    }

    public String getColorPelo(){
        return colorPelo;
    }
    @Override
    public String toString() {
        return "de color de pelo" + colorPelo;
    }
    public void add(Gato gatos) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
}

