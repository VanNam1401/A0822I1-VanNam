package v2.model;

public class Motor extends Vehicle {
    private double wattage;

    public Motor(String driverPlate, Manufacture manufacture, int yearOfManufacture, String owner, double wattage) {
        super(driverPlate, manufacture, yearOfManufacture, owner);
        this.wattage = wattage;
    }

    public double getWattage() {
        return wattage;
    }

    public void setWattage(double wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return String.format("%s,%s", super.toString(), wattage);
    }
}
