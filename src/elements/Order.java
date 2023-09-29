package elements;
public class Order {
    double amount;
    double price;
    int traderID;

    public Order(double amount, double price, int traderID) {
        this.amount = amount;
        this.price = price;
        this.traderID = traderID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTraderID() {
        return traderID;
    }

    public void setTraderID(int traderID) {
        this.traderID = traderID;
    }

    @Override
    public String toString() {
        return "Order{" +
                "amount = " + amount +
                ", price = " + price +
                ", traderID = " + traderID +
                '}';
    }
}
