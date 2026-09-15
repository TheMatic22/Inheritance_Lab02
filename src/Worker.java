public class Worker extends Person{
    protected String name;
    private double hourlyPayRate;

    public Worker(String firstName, String lastName, String ID, String title, int YOB,double hourlyPayRate) {
        super(firstName, lastName, ID, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    double calculateWeeklyPay(double hoursWorked){
        if(hoursWorked <= 40){
            return hoursWorked * hourlyPayRate;
        }else{
            double regularPay = 40 * hourlyPayRate;
            double overtimeHours = hoursWorked - 40;
            double overtimePay = overtimeHours * hourlyPayRate * 1.5;
            return regularPay + overtimePay;
        }
    }

    @Override
    public String toCSV(String hourlyPayRate) {
        return "";
    }
     void displayWeeklyPay(double hoursWorked){
         double regularHours =  Math.min(hoursWorked,40);
         double overtimeHours = Math.max(hoursWorked - 40,0);
         double regularPay =  regularHours * hourlyPayRate;
         double overtimePay = overtimeHours * hourlyPayRate * 1.5;
         double totalPay = calculateWeeklyPay(hoursWorked);

        System.out.println("Regular Hours: " + regularHours + " --> $ " + regularPay);
        System.out.println("Overtime Hours: " + overtimeHours + " --> $" + overtimePay);
        System.out.println("Total Combined Pay: $" + totalPay);
        System.out.println(name + " " + name + " -> Regular: " + regularHours + " hrs ($" + regularPay + "), Overtime: " + overtimeHours + " hrs ($" + overtimePay + "), Total: $" + totalPay);

    }
}
