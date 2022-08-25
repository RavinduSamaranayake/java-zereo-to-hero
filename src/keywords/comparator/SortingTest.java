package keywords.comparator;

import keywords.streamApi.Employee;

import java.util.*;

/**
 * @author Ravindu
 * 8/25/2022
 */
public class SortingTest {

    public static void testComp(){
        List<Employee> employeeList = Arrays.asList(new Employee("11","kushan"),new Employee("112","kushan22"),
                new Employee("11","kush"),new Employee("142","kushan44"),new Employee("15","kushan55"));
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return 0;
                //return o1.getEmpId().compareTo(o2.getEmpId());
            }
        });
        employeeList.forEach(e-> System.out.println(e.getEmpName()));

        System.out.println("**************************using list sorting*****************************");

        employeeList.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getEmpId().compareTo(o2.getEmpId());
            }
        });
        employeeList.forEach(e-> System.out.println(e.getEmpName()));

        System.out.println("**************************using lambda(JAVA 8)*****************************");

        employeeList.sort((o1,o2) ->o1.getEmpId().compareTo(o2.getEmpId()));
        employeeList.forEach(e-> System.out.println(e.getEmpName()));



        System.out.println("**************************using Comparator comparing(JAVA 8)*****************************");

        employeeList.sort(Comparator.comparing(Employee::getEmpId));
        employeeList.forEach(e-> System.out.println(e.getEmpName()));

        System.out.println("**************************Reverse Sorting(JAVA 8)*****************************");

        //Why Comparator.reversed() is not working? the problem is reversed() is a default method.
        // but comparing() is the Static method when we call to compare it returns a Comparator<> instance then we can call like this
        // Comparator.reverseOrder() is a static method so that we can directly call it like this
        employeeList.sort(Comparator.comparing(Employee::getEmpId).reversed());
        employeeList.forEach(e-> System.out.println(e.getEmpName()));

        System.out.println("**************************sorting using conditions(JAVA 8)*****************************");

        employeeList.sort((o1,o2) -> {
            if(o1.getEmpId().equals(o2.getEmpId())){
                return o1.getEmpName().compareTo(o2.getEmpName());
            }
            return o1.getEmpId().compareTo(o2.getEmpId());
        });
        employeeList.forEach(e-> System.out.println(e.getEmpName()));

        System.out.println("**************************sorting using conditions(JAVA 8)*****************************");

        employeeList.sort((o1,o2) -> {
            if(o1.getEmpId().equals(o2.getEmpId())){
                return o1.getEmpName().compareTo(o2.getEmpName());
            }
            return o1.getEmpId().compareTo(o2.getEmpId());
        });
        employeeList.forEach(e-> System.out.println(e.getEmpName()));

        System.out.println("**************************sorting using conditions with Comparator(JAVA 8)*****************************");

        employeeList.sort(Comparator.comparing(Employee::getEmpId).thenComparing(Employee::getEmpName));
        employeeList.forEach(e-> System.out.println(e.getEmpName()));

        System.out.println("**************************using comparable for employee lambda(JAVA 8)*****************************");

        employeeList.sort(Employee::compareTo);
        employeeList.forEach(e-> System.out.println(e.getEmpName()));

    }

    public static void testCompWithNullValues(){
        List<Employee> employeeList = Arrays.asList(null,new Employee("11","kushan"),null,new Employee("112","kushan22"),
                new Employee("11","kush"),new Employee("142","kushan44"),new Employee("15","kushan55"),null);

        try {
           employeeList.sort((o1,o2) -> {
               return o1.getEmpId().compareTo(o2.getEmpId());
           });
           employeeList.forEach(System.out::println);

       }catch (Exception e) {
            System.out.println("*******************using some conditions***********************");

            employeeList.sort((o1, o2) -> {
                if (o1 == null) {
                    return o2 == null ? 0 : 1;
                } else if (o2 == null) {
                    return -1;
                }
                return o1.getEmpId().compareTo(o2.getEmpId());
            });
            employeeList.forEach(System.out::println);

            System.out.println("*******************using some conditions easy with Comparator***********************");
            employeeList.sort(Comparator.nullsLast(Comparator.comparing(Employee::getEmpId)));
            employeeList.forEach(System.out::println);
        }


    }

    public static void main(String[] args) {
        testComp();
        testCompWithNullValues();
    }

}
