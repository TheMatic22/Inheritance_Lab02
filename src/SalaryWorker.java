public class SalaryWorker extends Person{
    protected String name;
    private double annualSalary;

    public SalaryWorker(String firstName, String lastName, String ID, String title, int YOB,double annualSalary){
        super(firstName, lastName, ID, title, YOB);
        this.annualSalary = annualSalary;
    }
    @Override
    double calculateWeeklyPay(double hoursWorked){
       return annualSalary / 52;
    }
    @Override
    public String toCSV(String hourlyPayRate){
        return super.toCSV() + "," + hourlyPayRate;
    }

}
