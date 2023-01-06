package model;

public abstract class Vehicle {
    private String driverPlate;
    private Manufacturer manufacture;
    private int yearOfManufacturer;
    private String owner;

    public Vehicle() {
    }

    public Vehicle(String driverPlate, Manufacturer manufacture, int yearOfManufacturer, String owner) {
        this.driverPlate = driverPlate;
        this.manufacture = manufacture;
        this.yearOfManufacturer = yearOfManufacturer;
        this.owner = owner;
    }

    public String getDriverPlate() {
        return driverPlate;
    }

    public void setDriverPlate(String driverPlate) {
        this.driverPlate = driverPlate;
    }

    public Manufacturer getManufacture() {
        return manufacture;
    }

    public void setManufacture(Manufacturer manufacture) {
        this.manufacture = manufacture;
    }

    public int getYearOfManufacturer() {
        return yearOfManufacturer;
    }

    public void setYearOfManufacturer(int yearOfManufacturer) {
        this.yearOfManufacturer = yearOfManufacturer;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "driverPlate='" + driverPlate + '\'' +
                ", manufacture=" + manufacture +
                ", yearOfManufacturer=" + yearOfManufacturer +
                ", owner='" + owner + '\'' +
                '}';
    }
}
