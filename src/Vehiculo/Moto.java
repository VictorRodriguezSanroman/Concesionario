
package Vehiculo;

public class Moto extends Vehiculo {
    //Atributos especificos de la subclase
    boolean carenado;
    int tiempos; 
    String transmision;
    String tamaño;

    //Constructor subclase
    public Moto(boolean carenado, int tiempos, String transmision, String matricula, String marca, String modelo, String cilindrada, int potencia, double velMax, String color, double precio, String tamaño) {
        super(matricula, marca, modelo, cilindrada, potencia, velMax, color, precio);
        this.carenado = carenado;
        this.tiempos = tiempos;
        this.transmision = transmision;
        this.tamaño = tamaño;
    }
    
    //Métodos
     public  void importeExtra(){
        if (tiempos == 4){
            precio += 1500;
        System.out.println("Importe extra por 4 tiempos: 1500 €");
        }
        if (null != transmision)switch (transmision) {
            case "Cadena":
                precio += 500;
                System.out.println("Importe extra por transmisión tipo Cadena: 500 €");
                break;
            case "Correa":
                precio += 1000;
                System.out.println("Importe extra por transmisión tipo Correa: 1000 €");
                break;
            case "Cardan":
                precio += 1500;
                System.out.println("Importe extra por transmisión tipo Cardan: 1500 €");
                break;
            default:
                break;
        }
    }
    @Override
        public void mostrarVehiculo(){
        
        System.out.println("Matricula: " + matricula);
        System.out.println("marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Tamaño: " + tamaño);
        System.out.println("Carenado: " + carenado);
        System.out.println("Tiempos: " + tiempos);
        System.out.println("Transmisión ((Cadena, correa o cardán): " + transmision);
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Potencia: " + potencia);
        System.out.println("Velocidad máxima: " + velMax + " Km/h");
        System.out.println("Color del vehículo: " + color);
        System.out.println("\nPrecio original: " + precio + " €");
        importeExtra();
        System.out.println("Precio más extras sin IVA: " + precio + " €");
        System.out.println();
        calcularIVA();
        System.out.println("*******************************\n");
    }
}
