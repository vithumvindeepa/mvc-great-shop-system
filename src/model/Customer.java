package model;

public class Customer {
    private int customerID;
    private String customerTitle;
    private String name;
    private String address;
    private String city;
    private String province;
    private int postalCode;

    public Customer() {
    }

    public Customer(int customerID, String customerTitle, String name, String address, String city, String province, int postalCode) {
        this.customerID = customerID;
        this.customerTitle = customerTitle;
        this.name = name;
        this.address = address;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }
}