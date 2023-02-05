package v2.model;

import v2.util.ConstantUtil.TypeOfCar;

public class Car extends Vehicle {
    private int numberOfSeat;
    private TypeOfCar typeOfCar;

    public Car(String driverPlate, Manufacture manufacture, int yearOfManufacture, String owner, int numberOfSeat, TypeOfCar typeOfCar) {
        super(driverPlate, manufacture, yearOfManufacture, owner);
        this.numberOfSeat = numberOfSeat;
        this.typeOfCar = typeOfCar;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public TypeOfCar getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(TypeOfCar typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s", super.toString(), numberOfSeat, typeOfCar.name());
    }
}
