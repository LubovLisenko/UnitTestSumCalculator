import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestSumCalculator {
    private SumCalculator sumCalculator;

    @BeforeEach
    public void beforeEach() {
        sumCalculator = new SumCalculator();
    }
    @Test
    public void testThat1InputHandledCorrectly(){
        int actual = sumCalculator.sum(1);
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    public void testThat3InputHandledCorrectly(){
        int actual = sumCalculator.sum(3);
        int expected = 6;
        Assertions.assertEquals(expected,actual);
    }


    @Test
    public void testThatNegativeInputHandledCorrectly(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->new SumCalculator().sum(0));
    }

}
