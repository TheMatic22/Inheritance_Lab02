import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WorkerTest {

    @Test
    public void testCalculateWeeklyPay_noOvertime() {
        Worker w = new Worker("Mary", "Anne", "W1", "Ms.", 1996, 22.50);
        double result = w.calculateWeeklyPay(40);
        assertEquals(900.0, result, 0.001); // 40 * 22.50
    }

    @Test
    public void testCalculateWeeklyPay_withOvertime() {
        Worker w = new Worker("Mary", "Anne", "W1", "Ms.", 1996, 22.50);
        double result = w.calculateWeeklyPay(50);
        assertEquals((40 * 22.50) + (10 * 22.50 * 1.5), result, 0.001);
    }

    @Test
    public void testCalculateWeeklyPay_underForty() {
        Worker w = new Worker("Mary", "Anne", "W1", "Ms.", 1996,22.50);
        double result = w.calculateWeeklyPay(30);
        assertEquals(675.0, result, 0.001); // 30 * 22.50
    }
}