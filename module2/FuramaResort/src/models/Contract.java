package models;

public class Contract {
    private String code;
    private String idBooking;
    private double prePayment;
    private double totalPayment;
    private String idCustomer;

    public Contract(String code, String idBooking, double prePayment, double totalPayment, String idCustomer) {
        this.code = code;
        this.idBooking = idBooking;
        this.prePayment = prePayment;
        this.totalPayment = totalPayment;
        this.idCustomer = idCustomer;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public double getPrePayment() {
        return prePayment;
    }

    public void setPrePayment(double prePayment) {
        this.prePayment = prePayment;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "code='" + code + '\'' +
                ", idBooking='" + idBooking + '\'' +
                ", prePayment=" + prePayment +
                ", totalPayment=" + totalPayment +
                ", idCustomer='" + idCustomer + '\'' +
                '}';
    }
}
