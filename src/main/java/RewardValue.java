public class RewardValue {

    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue( int miles) {
        this.milesValue = miles;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return getCashValue() * 0.0035;
    }
}
