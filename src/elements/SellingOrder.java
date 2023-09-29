package elements;
public class SellingOrder extends Order{
    public SellingOrder(double amount, double price, int traderID) {
        super(amount, price, traderID);
    }

    @Override
    public double getAmount() {
        return super.getAmount();
    }

    @Override
    public void setAmount(double amount) {
        super.setAmount(amount);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public int getTraderID() {
        return super.getTraderID();
    }

    @Override
    public void setTraderID(int traderID) {
        super.setTraderID(traderID);
    }

    @Override
    public String toString() {
        return "SellingOrder{" +
                "amount=" + amount +
                ", price=" + price +
                ", traderID=" + traderID +
                '}';
    }
}
