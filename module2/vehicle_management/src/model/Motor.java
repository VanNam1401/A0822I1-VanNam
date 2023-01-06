package model;

public class Motor extends Vehicle {
    private Double wattage;

    public Motor(String driverPlate, Manufacturer manufacture, int yearOfManufacturer, String owner, Double wattage) {
        super(driverPlate, manufacture, yearOfManufacturer, owner);
        this.wattage = wattage;
    }

    public Double getWattage() {
        return wattage;
    }

    public void setWattage(Double wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "wattage=" + wattage +
                "} " + super.toString();
    }
}
