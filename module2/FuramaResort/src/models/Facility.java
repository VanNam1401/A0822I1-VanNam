package models;

public abstract class Facility {
    private String nameService;
    private double areaUse;
    private double rentalPrice;

    private int numberPeople;
    private String rentalStyle;

    public Facility() {
    }

    public Facility(String nameService, double areaUse, double rentalPrice, int numberPeople, String rentalStyle) {
        this.nameService = nameService;
        this.areaUse = areaUse;
        this.rentalPrice = rentalPrice;
        this.numberPeople = numberPeople;
        this.rentalStyle = rentalStyle;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(double areaUse) {
        this.areaUse = areaUse;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public int getNumberPeople() {
        return numberPeople;
    }

    public void setNumberPeople(int numberPeople) {
        this.numberPeople = numberPeople;
    }

    public String getRentalStyle() {
        return rentalStyle;
    }

    public void setRentalStyle(String rentalStyle) {
        this.rentalStyle = rentalStyle;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "nameService='" + nameService + '\'' +
                ", areaUse=" + areaUse +
                ", rentalPrice=" + rentalPrice +
                ", numberPeople=" + numberPeople +
                ", rentalStyle='" + rentalStyle + '\'' +
                '}';
    }
}
