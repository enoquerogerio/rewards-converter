import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        int expectedResult = (int) (cashValue / RewardValue.MILES_TO_CASH_RATE);
        var rewardValue = new RewardValue(cashValue);
        assertThat(expectedResult, equalTo(rewardValue.getMilesValue()));
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 28571;
        double expectedResult = milesValue * RewardValue.MILES_TO_CASH_RATE;
        var rewardValue = new RewardValue(milesValue);
        assertThat(expectedResult, equalTo(rewardValue.getCashValue()));
    }
}
