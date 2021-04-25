
package Vehiculo;

public class Concesionario {

    public static void main(String[] args) {
        
        //Instancias de Coche
        Vehiculo coche1 = new Coche(true,true,true,"Diesel","1234 FHL","Renault","Clio","100",150,166,"Azul",4000);
        Vehiculo coche2 = new Coche (false, true, false, "gasolina", "6547 FSD", "Nissan","Micra", "110", 140,180,"Blanco",6500);
        Vehiculo coche3 = new Coche (true, true, false, "diesel", "7896 AVB", "Lexus","200h", "150", 210,230,"Negro",20000);
        
        coche1.mostrarVehiculo();
        coche2.mostrarVehiculo();
        coche3.mostrarVehiculo();
        
        //Instancias de Moto
        Vehiculo moto1 = new Moto (true,2, "Correa","4321 DSF","Kawasaki","Empire","150",200,250,"Verde",2030);
        Vehiculo moto2 = new Moto (false,4, "Cardan","9875 5SF","Nissan","Ninja","160",230,280,"Negra",4550);

        moto1.mostrarVehiculo();
        moto2.mostrarVehiculo();
        
        //Instancias de Autobus
        Vehiculo autobus1 = new Autobus ("4567 TRE","Mercedes","Grande","250",180,190,"Rojo",10000,54,false);
        Vehiculo autobus2 = new Autobus ("7865 TEW","Mercedes","Maxi","250",180,190,"Azul",13500,70,false);

        autobus1.mostrarVehiculo();
        autobus2.mostrarVehiculo();

    }
    
}
