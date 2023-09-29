package elements;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Market {
    private PriorityQueue<SellingOrder> sellingOrders;
    private PriorityQueue<BuyingOrder> buyingOrders;
    private ArrayList<Transaction> transactions;

    public Market(PriorityQueue<SellingOrder> sellingOrders, PriorityQueue<BuyingOrder> buyingOrders, ArrayList<Transaction> transactions) {
        this.sellingOrders = sellingOrders;
        this.buyingOrders = buyingOrders;
        this.transactions = transactions;
    }

    public void giveSellOrder(SellingOrder order) {

    }

    public void giveBuyOrder(BuyingOrder order) {

    }

    public void makeOpenMarketOperation(double price){

    }

    public void checkTransactions(ArrayList<Trader> traders) {

    }

    public Market(int fee) {

    }

    public PriorityQueue<SellingOrder> getSellingOrders() {
        return sellingOrders;
    }

    public void setSellingOrders(PriorityQueue<SellingOrder> sellingOrders) {
        this.sellingOrders = sellingOrders;
    }

    public PriorityQueue<BuyingOrder> getBuyingOrders() {
        return buyingOrders;
    }

    public void setBuyingOrders(PriorityQueue<BuyingOrder> buyingOrders) {
        this.buyingOrders = buyingOrders;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "Market{" +
                "sellingOrders = " + sellingOrders +
                ", buyingOrders = " + buyingOrders +
                ", transactions = " + transactions +
                '}';
    }

}
