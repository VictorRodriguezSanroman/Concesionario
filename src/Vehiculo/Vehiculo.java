
package Vehiculo;

public class Vehiculo {
    //Atributos clase principal
    String matricula;
    String marca;
    String modelo;
    String cilindrada;
    int potencia;
    double velMax;
    String color;
    double precio;
    
    //Constructor
    public  Vehiculo(String matricula, String marca, String modelo, String cilindrada, int potencia, double velMax, String color, double precio){    
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
        this.velMax = velMax;
        this.color = color;
        this.precio = precio;
    }

    //Métodos
    public void calcularIVA() {
        double IVA = precio *0.21;
        System.out.println("IVA: " + IVA);
        System.out.println("Precio final: " + (precio + IVA + " €"));

    }
    
    public void mostrarVehiculo(){
        
        System.out.println("Matricula: " + matricula);
        System.out.println("marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Potencia: " + potencia);
        System.out.println("Velocidad máxima: " + velMax+ " Km/h");
        System.out.println("Color del vehículo: " + color);
        System.out.println("Precio sin IVA: " + precio + " €");
        calcularIVA();
        System.out.println("*******************************\n");
        
    }
    
   
    
}
