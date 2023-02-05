package v3.model;

public abstract class Vehicle {
    private String driverPlate;
    private Manufacture manufacture;
    private int yearOfManufacture;
    private String owner;

    public Vehicle() {
    }

    public Vehicle(String driverPlate, Manufacture manufacture, int yearOfManufacture, String owner) {
        this.driverPlate = driverPlate;
        this.manufacture = manufacture;
        this.yearOfManufacture = yearOfManufacture;
        this.owner = owner;
    }

    public String getDriverPlate() {
        return driverPlate;
    }

    public void setDriverPlate(String driverPlate) {
        this.driverPlate = driverPlate;
    }

    public Manufacture getManufacture() {
        return manufacture;
    }

    public void setManufacture(Manufacture manufacture) {
        this.manufacture = manufacture;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s", driverPlate, manufacture.getName(), yearOfManufacture, owner);
    }
}
