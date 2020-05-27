import java.util.ArrayList;

public class Shuttle {
    private int shuttleId;
    private String shuttleName;
    private int manufacturingYear;
    private double fuelCapacity;
    private int passengerCapacity;
    private double cargoCapacity;
    private double travelSpeed;

    public Shuttle(int shuttleId, String shuttleName, int manufacturingYear, double fuelCapacity, int passengerCapacity, double cargoCapacity, double travelSpeed) {
        this.shuttleId = shuttleId;
        this.shuttleName = shuttleName;
        this.manufacturingYear = manufacturingYear;
        this.fuelCapacity = fuelCapacity;
        this.passengerCapacity = passengerCapacity;
        this.cargoCapacity = cargoCapacity;
        this.travelSpeed = travelSpeed;
    }

    public int getShuttleId() {
        return shuttleId;
    }

    public void setShuttleId(int shuttleId) {
        this.shuttleId = shuttleId;
    }

    public String getShuttleName() {
        return shuttleName;
    }

    public void setShuttleName(String shuttleName) {
        this.shuttleName = shuttleName;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public double getTravelSpeed() {
        return travelSpeed;
    }

    public void setTravelSpeed(double travelSpeed) {
        this.travelSpeed = travelSpeed;
    }
}
