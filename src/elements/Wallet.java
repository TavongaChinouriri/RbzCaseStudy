package elements;

public class Wallet {
    private double USD;
    private double GoldCoin;
    private double blockedUSD;
    private double blockedGold;
    public Wallet (double USD, double GoldCoin){

    }

    public Wallet(double USD, double goldCoin, double blockedUSD, double blockedGold) {
        this.USD = USD;
        GoldCoin = goldCoin;
        this.blockedUSD = blockedUSD;
        this.blockedGold = blockedGold;
    }

    public double getUSD() {
        return USD;
    }

    public void setUSD(double USD) {
        this.USD = USD;
    }

    public double getGoldCoin() {
        return GoldCoin;
    }

    public void setGoldCoin(double goldCoin) {
        GoldCoin = goldCoin;
    }

    public double getBlockedUSD() {
        return blockedUSD;
    }

    public void setBlockedUSD(double blockedUSD) {
        this.blockedUSD = blockedUSD;
    }

    public double getBlockedGold() {
        return blockedGold;
    }

    public void setBlockedGold(double blockedGold) {
        this.blockedGold = blockedGold;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "USD=" + USD +
                ", GoldCoin=" + GoldCoin +
                ", blockedUSD=" + blockedUSD +
                ", blockedGold=" + blockedGold +
                '}';
    }
}
