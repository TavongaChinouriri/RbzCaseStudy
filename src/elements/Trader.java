package elements;

public class Trader {
    private int id;
    private Wallet wallet;

    public Trader(double USD, double GoldCoin){

    }
    public int sell(double amount, double price, Market market){

        return 0; //to ask about return
    }
    public int buy(double amount, double price, Market market){

        return 0; //to ask about return
    }
    public static int numberOfUsers = 0;

    public Trader(int id, Wallet wallet) {
        this.id = id;
        this.wallet = wallet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public static int getNumberOfUsers() {
        return numberOfUsers;
    }

    public static void setNumberOfUsers(int numberOfUsers) {
        Trader.numberOfUsers = numberOfUsers;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "id=" + id +
                ", wallet=" + wallet +
                '}';
    }
}
