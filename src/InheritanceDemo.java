import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<SalaryWorker> workers = new ArrayList<>();

        workers.add(new SalaryWorker("Sam", "Diaz", "S1", "Mr.", 1985, 6500));
        workers.add(new SalaryWorker("Elena", "Cho", "S2", "Dr.", 1979, 75000));
        workers.add(new SalaryWorker("Tom", "Reyes", "S3", "Prof.", 1975, 85000));

        double[] weeklyHours = {40, 50, 40};
        for (double hours : weeklyHours) {
            System.out.println("=== Week: " + hours + " hours ===");
            for (SalaryWorker w : workers) {
                w.calculateWeeklyPay(hours);
            }
        }
    }
}