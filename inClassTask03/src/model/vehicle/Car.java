package model.vehicle;

public class Car extends Vehicle {

    private double trunkCapacity;

    /**
     * The basic Car constructor that provides all the properties
     * 
     * @param vin
     * @param make
     * @param model
     * @param perHourRate
     */
    public Car(String vin, String make, String model, double perHourRate, double trunkCapacity) {
        super(vin, make, model, perHourRate);
        this.trunkCapacity = trunkCapacity;
    }

    /**
     * Creates a copy of an existing car.
     *
     * @param other the car to copy
     */
    public Car(Car c) {
        super(c.getVin(), c.getMake(), c.getModel(), c.getPerHourRate());
    }

    public double getTrunkCapacity() {
        return trunkCapacity;
    }

    /**
     * Opens the trunk if the car is not running.
     */
    public void openTrunk() {
        if (isRunning()) {
            System.out.println("Stop the car before opening the trunk.");
        } else {
            System.out.println("Trunk opened.");
        }
    }

}