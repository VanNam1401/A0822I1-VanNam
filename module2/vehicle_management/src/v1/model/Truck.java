package v1.model;

public class Truck extends Vehicle {
    private double load;

    public Truck(String driverPlate, Manufacture manufacture, int yearOfManufacture, String owner, double load) {
        super(driverPlate, manufacture, yearOfManufacture, owner);
        this.load = load;
    }

    public double getLoad() {
        return load;
    }

    public void setLoad(double load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return super.toString() + "," + load;
    }
}
