public class RewardValue {
    public static final double MILES_TO_CASH_RATE = 0.0035;
    private int MilesValue;
    private double CashValue;

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.CashValue = cashValue;
    }

    // Constructor for miles value
    public RewardValue(int milesValue) {
        this.CashValue = convertToCash(milesValue);
    }

    private static double convertToCash(int milesValue){
        return milesValue * MILES_TO_CASH_RATE;
    }

    private static int convertToMiles(double cashValue){
        return (int) (cashValue / MILES_TO_CASH_RATE);
    }

    public int getMilesValue() {
        this.MilesValue = convertToMiles(this.CashValue);
        return this.MilesValue;
    }

    public double getCashValue() {
        return this.CashValue;
    }
}
