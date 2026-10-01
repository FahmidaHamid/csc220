package model.vehicle;

/**
 * Represents a vehicle registered with the campus parking system.
 * Every vehicle has a VIN, make, model, parking rate, and running state.
 */

public abstract class Vehicle {

    private String vin; // VIN is used as the vehicle's identity, so it should not be changed after the
                        // vehicle is created.
    private String make;
    private String model;
    private double perHourRate;
    private boolean running;

    /**
     * Creates a vehicle with its identifying information and parking rate.
     *
     * @param vin         unique vehicle identification number
     * @param make        manufacturer of the vehicle
     * @param model       model of the vehicle
     * @param perHourRate parking cost per hour
     */

    public Vehicle(String vin, String make, String model, double perHourRate) {
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.perHourRate = perHourRate;
        this.running = false;
    }

    public String getVin() {
        return vin;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getPerHourRate() {
        return perHourRate;
    }

    /**
     * Calculates the parking fee based on the number of hours parked.
     *
     * @param hours number of hours the vehicle was parked
     * @return total parking fee
     */

    public void setPerHourRate(double perHourRate) {
        this.perHourRate = perHourRate;
    }

    /**
     * Starts the vehicle.
     * If the vehicle is already running, its state is not changed.
     */
    public void start() {
        if (!running) {
            running = true;
            System.out.println(make + " " + model + " started.");
        } else {
            System.out.println(make + " " + model + " is already running.");
        }
    }

    /**
     * Stops the vehicle.
     * If the vehicle is already stopped, its state is not changed.
     */
    public void stop() {
        if (running) {
            running = false;
            System.out.println(make + " " + model + " stopped.");
        } else {
            System.out.println(make + " " + model + " is already stopped.");
        }
    }

    /**
     * Reports whether the vehicle is currently running.
     *
     * @return true if the vehicle is running; false otherwise
     */
    public boolean isRunning() {
        return running;
    }

    @Override
    public String toString() {
        return "This is a " + make + ", " + model + " and the vin is: " + vin;
    }

   
    /**
     * If the two objects are the same then return true
     * If not, check if the passed object is some kind of a vehicle then compare the
     * vins
     * between this car and the obj: if vins are the same, return true; else return
     * false.
     */
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Vehicle)) {
            return false;
        }

        Vehicle other = (Vehicle) obj; // type casting

        return this.getVin().equals(other.getVin());
    }

   
    /**
     * if this car's vin is the same as the other car then return true,
     * otherwise false
     * 
     * @param other
     * @return
     */
    public boolean equals(Car other) {
        return this.getVin().equals(other.getVin());
    }

    /**
     * Calculates the parking fee for the given number of hours.
     *
     * @param hours number of hours parked
     * @return the parking fee
     */
    public double calculateParkingFee(int hours) {
        return hours * perHourRate;
    }

}