package model.vehicle;

public class Motorcycle extends Vehicle {

    private boolean kickstandDown;

    public Motorcycle(
        String vin,
        String make,
        String model,
        double perHourRate
    ) {
        super(vin, make, model, perHourRate);
        this.kickstandDown = true;
    }

    /**
     * Starts the motorcycle only when the kickstand is raised.
     */
    @Override
    public void start() {
        if (kickstandDown) {
            System.out.println(
                "Cannot start the motorcycle while the kickstand is down."
            );
            return;
        }

        super.start();
    }

    /**
     * Stops the motorcycle and lowers the kickstand.
     */
    @Override
    public void stop() {
        super.stop();

        if (!kickstandDown) {
            lowerKickstand();
        }
    }

    /**
     * Raises the motorcycle's kickstand.
     */
    public void raiseKickstand() {
        kickstandDown = false;
        System.out.println("Kickstand raised.");
    }

    /**
     * Lowers the motorcycle's kickstand.
     */
    public void lowerKickstand() {
        kickstandDown = true;
        System.out.println("Kickstand lowered.");
    }

    public boolean isKickstandDown() {
        return kickstandDown;
    }
}