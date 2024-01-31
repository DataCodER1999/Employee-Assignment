import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee {
    private int id;
    private String name;
    Map<String, Salary> salary;
    List<Address> addresses;

    public Employee(int id, String name, Map<String, Salary> salary, List<Address> addresses) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.addresses = addresses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Salary> getSalary() {
        return salary;
    }

    public void setSalary(Map<String, Salary> salary) {
        this.salary = salary;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
    public static Map<String, Integer> countEmployeesWithSameAddress(List<Employee> employees) {
        Map<String, Integer> addressEmployeeCount = new HashMap<>();
        for (Employee employee : employees) {
            String addressKey = employee.getAddresses().toString();
            addressEmployeeCount.put(addressKey, addressEmployeeCount.getOrDefault(addressKey, 0) + 1);
        }
        return addressEmployeeCount;
    }
}
