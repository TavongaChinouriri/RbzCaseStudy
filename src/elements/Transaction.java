package elements;

public class Transaction {
    private SellingOrder sellingOrder;
    private BuyingOrder buyingOrder;

    public Transaction(SellingOrder sellingOrder, BuyingOrder buyingOrder) {
        this.sellingOrder = sellingOrder;
        this.buyingOrder = buyingOrder;
    }

    public SellingOrder getSellingOrder() {
        return sellingOrder;
    }

    public void setSellingOrder(SellingOrder sellingOrder) {
        this.sellingOrder = sellingOrder;
    }

    public BuyingOrder getBuyingOrder() {
        return buyingOrder;
    }

    public void setBuyingOrder(BuyingOrder buyingOrder) {
        this.buyingOrder = buyingOrder;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "sellingOrder=" + sellingOrder +
                ", buyingOrder=" + buyingOrder +
                '}';
    }
}
