import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SalaryWorkerTest {

    @Test
    public void testCalculateWeeklyPay_basicSalary() {
        SalaryWorker sw = new SalaryWorker("Sam", "Diaz", "S1", "Mr.", 1985, 65000);
        double result = sw.calculateWeeklyPay(40);
        assertEquals(65000.0 / 52, result, 0.001);
    }

    @Test
    public void testCalculateWeeklyPay_ignoresHoursWorked() {
        SalaryWorker sw = new SalaryWorker("Sam", "Diaz", "S1", "Mr.", 1985, 65000);
        assertEquals(sw.calculateWeeklyPay(40), sw.calculateWeeklyPay(50), 0.001);
    }

    @Test
    public void testCalculateWeeklyPay_zeroSalaryEdgeCase() {
        SalaryWorker sw = new SalaryWorker("Nina", "Cole", "S2", "Ms.", 2000, 0);
        double result = sw.calculateWeeklyPay(40);
        assertEquals(0.0, result, 0.001);
    }
}
