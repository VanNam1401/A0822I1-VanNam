package models;

public class Room extends Facility{
    private String freeService;

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room() {
    }

    public Room(String nameService, double areaUse, double rentalPrice, int numberPeople, String rentalStyle, String freeService) {
        super(nameService, areaUse, rentalPrice, numberPeople, rentalStyle);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                "} " + super.toString();
    }
}
