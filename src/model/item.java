package model;

public class item {
    private int itemCode;
    private String description;
    private int packSize;
    private int quantityOnHand;
    private int unitPrice;
    private int itemType;

    public item() {
    }

    public item(int itemCode, String description, int packSize, int quantityOnHand, int unitPrice, int itemType) {
        this.itemCode = itemCode;
        this.description = description;
        this.packSize = packSize;
        this.quantityOnHand = quantityOnHand;
        this.unitPrice = unitPrice;
        this.itemType = itemType;
    }
}