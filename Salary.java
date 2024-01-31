import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Salary {
    private int id;
    private LocalDate date;
    private double salary;
    private float HRA;
    private float DA;
    private float EPF;
    private float tax;

    public int getId() {
        return id;
    }

    public Salary(int id, String date, double salary, float HRA, float DA, float EPF, float tax) {
        this.id = id;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.date = LocalDate.parse(date,formatter);
        this.salary = salary;
        this.HRA = HRA;
        this.DA = DA;
        this.EPF = EPF;
        this.tax = tax;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date.toString();
    }

    public void setDate(String date) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.date = LocalDate.parse(date,formatter);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public float getHRA() {
        return HRA;
    }

    public void setHRA(float HRA) {
        this.HRA = HRA;
    }

    public float getDA() {
        return DA;
    }

    public void setDA(float DA) {
        this.DA = DA;
    }

    public float getEPF() {
        return EPF;
    }

    public void setEPF(float EPF) {
        this.EPF = EPF;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }
}
