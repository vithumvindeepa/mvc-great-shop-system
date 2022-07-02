package model;

public class orderDetails {
    private int orderId;
    private int itemCode;
    private int orderQty;
    private double discount;

    public orderDetails() {
    }

    public orderDetails(int orderId, int itemCode, int orderQty, double discount) {
        this.orderId = orderId;
        this.itemCode = itemCode;
        this.orderQty = orderQty;
        this.discount = discount;
    }
}
