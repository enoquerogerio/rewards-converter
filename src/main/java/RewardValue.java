public class RewardValue {
    private static final double MILES_TO_CASH_RATE = 0.0035;
    private int MilesValue;
    private double CashValue;

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.CashValue = cashValue;
        this.MilesValue = (int) (cashValue / MILES_TO_CASH_RATE);
    }

    // Constructor for miles value
    public RewardValue(int milesValue) {
        this.MilesValue = milesValue;
        this.CashValue = milesValue * MILES_TO_CASH_RATE;
    }

    public int getMilesValue() {
        return this.MilesValue;
    }

    public double getCashValue() {
        return this.CashValue;
    }
}
