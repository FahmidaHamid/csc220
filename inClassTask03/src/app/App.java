package app;

import model.vehicle.Car;
import model.vehicle.Motorcycle;
import model.vehicle.Vehicle;

public class App {
    
        public static void main(String[] args) {
        
        System.out.println("Hello CSC 220!");

        Vehicle car1 = new Car("VIN123", "Honda", "CR-V", 1.5, 12.5);
        Vehicle mc = new Motorcycle("VIN-M-001", "Mitsubishi", "CR-7", 3.0);
        
       

        System.out.println(car1);
        System.out.println(mc);


        System.out.println("Are the two vehicles same? "+ car1.equals(new String("Some kind of vehicle"))); 

        System.out.println("Are the two vehicles same? "+ car1.equals(mc));     

        System.out.println("Are the two vehicles same? "+ car1.equals(car1)); // comparing the car to itself

        Vehicle clonedVehicle = new Car((Car) car1);
        System.out.println("Are the two vehicles same? "+ car1.equals(clonedVehicle)); // comparing the car to a clone car
    

    }
}
