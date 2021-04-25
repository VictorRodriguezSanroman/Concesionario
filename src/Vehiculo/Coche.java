
package Vehiculo;

public class Coche extends Vehiculo {
    //Atributos especificos de la subclase
    boolean elevalunas;
    boolean airbag;
    boolean cierreCentralizado;
    String motor;

    //Constructor subclase
    public Coche(boolean elevalunas, boolean airbag, boolean cierreCentralizado, String motor, String matricula, String marca, String modelo, String cilindrada, int potencia, double velMax, String color, double precio) {
        super(matricula, marca, modelo, cilindrada, potencia, velMax, color, precio);
        this.elevalunas = elevalunas;
        this.airbag = airbag;
        this.cierreCentralizado = cierreCentralizado;
        this.motor = motor;
    }
    
    //Métodos
    public  void importeExtra(){
        if (motor == "Diesel"){
            precio += 2000;
            
            System.out.println("Importe extra por motor Diesel: 2000 € ");
        }
        if (cierreCentralizado == true){
            precio += 500;
            System.out.println("Importe extra por cierre centralizado: 500 €");
        }
        if (airbag == true){
            precio += 1000;
            System.out.println("Importe extra por instalación de airbag: 1000 €");
        }
    }

    @Override
  public void mostrarVehiculo(){

        System.out.println("Matricula: " + matricula);
        System.out.println("marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Elevalunas: "+ elevalunas);
        System.out.println("Airbag: " + airbag);
        System.out.println("Cierre centralizado: " + cierreCentralizado);
        System.out.println("Motor: " + motor);
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Potencia: " + potencia);
        System.out.println("Velocidad máxima: " + velMax + " Km/h");
        System.out.println("Color del vehículo: " + color);
        System.out.println("\nPrecio original: " + precio);
        importeExtra();
        System.out.println("Precio más extras sin IVA: " + precio + " €");
        System.out.println();
        calcularIVA();
        System.out.println("*******************************\n");
        
    }

        
    
    
   
}
