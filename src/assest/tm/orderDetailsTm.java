package assest.tm;

public class orderDetailsTm {
    private int orderId;
    private int itemCode;
    private int orderQty;
    private double discount;

    public orderDetailsTm() {
    }

    public orderDetailsTm(int orderId, int itemCode, int orderQty, double discount) {
        this.setOrderId(orderId);
        this.setItemCode(itemCode);
        this.setOrderQty(orderQty);
        this.setDiscount(discount);
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public int getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "orderDetails{" +
                "orderId=" + orderId +
                ", itemCode=" + itemCode +
                ", orderQty=" + orderQty +
                ", discount=" + discount +
                '}';
    }
}
