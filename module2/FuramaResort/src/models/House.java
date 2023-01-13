package models;

public class House extends Facility{
    private String standardHouse;
    private int floor;

    public House(String standardHouse, int floor) {
        this.standardHouse = standardHouse;
        this.floor = floor;
    }

    public House(String nameService, double areaUse, double rentalPrice, int numberPeople, String rentalStyle, String standardHouse, int floor) {
        super(nameService, areaUse, rentalPrice, numberPeople, rentalStyle);
        this.standardHouse = standardHouse;
        this.floor = floor;
    }

    public String getStandardHouse() {
        return standardHouse;
    }

    public void setStandardHouse(String standardHouse) {
        this.standardHouse = standardHouse;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" +
                "standardHouse='" + standardHouse + '\'' +
                ", floor=" + floor +
                "} " + super.toString();
    }
}
