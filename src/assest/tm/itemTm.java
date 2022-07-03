package assest.tm;

public class itemTm {
    private int itemCode;
    private String description;
    private int packSize;
    private int quantityOnHand;
    private int unitPrice;
    private int itemType;

    public itemTm() {
    }

    public itemTm(int itemCode, String description, int packSize, int quantityOnHand, int unitPrice, int itemType) {
        this.setItemCode(itemCode);
        this.setDescription(description);
        this.setPackSize(packSize);
        this.setQuantityOnHand(quantityOnHand);
        this.setUnitPrice(unitPrice);
        this.setItemType(itemType);
    }

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPackSize() {
        return packSize;
    }

    public void setPackSize(int packSize) {
        this.packSize = packSize;
    }

    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    public void setQuantityOnHand(int quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getItemType() {
        return itemType;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }

    @Override
    public String toString() {
        return "item{" +
                "itemCode=" + itemCode +
                ", description='" + description + '\'' +
                ", packSize=" + packSize +
                ", quantityOnHand=" + quantityOnHand +
                ", unitPrice=" + unitPrice +
                ", itemType=" + itemType +
                '}';
    }
}
