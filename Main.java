import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {


    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Map<String, Salary> nitinSalaries = new HashMap<>();
        nitinSalaries.put("January", new Salary(1, "2020-01-20", 80000, 600, 200, 7.8f, 15));
        nitinSalaries.put("February", new Salary(2, "2020-02-20", 90000, 700, 400, 6.3f, 20));
        nitinSalaries.put("March", new Salary(3, "2020-03-20", 100000, 800, 500, 9.7f, 35));

        List<Address> nitinAddresses = new ArrayList<>();
        nitinAddresses.add(new Address(1, "Meerut", "UP", "India", "Somdutt Vihar"));

        employees.add(new Employee(1, "Nitin", nitinSalaries, nitinAddresses));

        Map<String, Salary> AbhaySalaries = new HashMap<>();
        AbhaySalaries.put("January", new Salary(1, "2020-01-20", 80000, 400, 400, 8.8f, 19));
        AbhaySalaries.put("February", new Salary(2, "2020-02-20", 90000, 900, 100, 7.3f, 22));
        AbhaySalaries.put("March", new Salary(3, "2020-03-20", 100000, 500, 700, 5.7f, 30));

        List<Address> AbhayAddresses = new ArrayList<>();
        AbhayAddresses.add(new Address(2, "Noida", "UP", "India", "sector 19"));
        employees.add(new Employee(2, "Abhay", AbhaySalaries, AbhayAddresses));

        Map<String, Salary> NikhilSalaries = new HashMap<>();
        NikhilSalaries.put("January", new Salary(1, "2020-01-20", 80000, 400, 400, 8.8f, 19));
        NikhilSalaries.put("February", new Salary(2, "2020-02-20", 90000, 900, 100, 7.3f, 22));
        NikhilSalaries.put("March", new Salary(3, "2020-03-20", 100000, 500, 700, 5.7f, 30));

        List<Address> NikhilAddresses = new ArrayList<>();
        NikhilAddresses.add(new Address(2, "Noida", "UP", "India", "sector 19"));
        employees.add(new Employee(2, "Abhay", NikhilSalaries, NikhilAddresses));




        System.out.println(Employee.countEmployeesWithSameAddress(employees));


    }
}
