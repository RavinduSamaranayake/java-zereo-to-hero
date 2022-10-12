package keywords.streamApi;

import java.util.Comparator;

/**
 * @author Ravindu
 * 8/24/2022
 */
public class Employee implements Comparable<Employee> { //this Comparable<Employee> make sense now Employee objs can compare with other Employee objs
    private String empId;
    private String empName;

    public Employee(String empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.empId.compareTo(o.getEmpId());
    }
}
