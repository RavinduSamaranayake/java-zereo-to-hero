package keywords.streamApi;

import java.util.Comparator;

/**
 * @author Ravindu
 * 8/24/2022
 */
public class Employee implements Comparator<Employee> {
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
    public int compare(Employee o1, Employee o2) {
        if(o1.getEmpId().length()>o2.getEmpId().length()){
            return 1;
        }
        return 0;
    }

    @Override
    public Comparator<Employee> reversed() {
        return Comparator.super.reversed();
    }
}
