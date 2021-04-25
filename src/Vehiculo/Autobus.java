
package Vehiculo;

public class Autobus extends Vehiculo{
    //Atributos especificos de la subclase
    int numPlazas;
    boolean tacometro;
    int numVentanas;

    //Constructor subclase
    public Autobus(String matricula, String marca, String modelo, String cilindrada, int potencia, double velMax, String color, double precio,int numPlazas, boolean tacometro, int numVentanas) {
        super(matricula, marca, modelo, cilindrada, potencia, velMax, color, precio);
        this.numPlazas = numPlazas;
        this.tacometro = tacometro;
        this.numPlazas = numVentanas;
    }
    
    //Métodos
     public  void importeExtra(){
        if (numPlazas >= 40 && numPlazas <= 60){
            precio += 4000;
            System.out.println("Importe extra por plazas entre 40 y 60: 4000 €");
        }else if (numPlazas > 60){
            precio +=6500;
            System.out.println("Importe extra por más de 60 plazas: 6500 €");
        }
       
    }
    
    @Override
       public void mostrarVehiculo(){
        
        System.out.println("Matricula: " + matricula);
        System.out.println("marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Número de plazas: " + numPlazas);
        System.out.println("Tacómetro: " + tacometro);
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Potencia: " + potencia);
        System.out.println("Velocidad máxima: " + velMax+ " Km/h");
        System.out.println("Color del vehículo: " + color);
        System.out.println("Número de ventanas: " + numVentanas);
        System.out.println("\nPrecio original: " + precio + " €");
        importeExtra();
        System.out.println("Precio más extras sin IVA: " + precio + " €");
        System.out.println();
        calcularIVA();
        System.out.println("*******************************\n");
        
    }
    
}
