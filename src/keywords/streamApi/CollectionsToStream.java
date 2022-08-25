package keywords.streamApi;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Ravindu
 * 8/13/2022
 */
public class CollectionsToStream {
    //Count frequency of elements in a List in Java
    public static void testListToHashMap(){
        List<Integer> list = Arrays.asList(1,2,3,5,13,1,2,4,11,20,21,1,1,23,5,4);
        //using map merge function
        Map<Integer,Integer> map = list.stream().collect(Collectors.toMap(k->k, v->1, (x,y)->y+1));
        map.forEach((k,v)-> System.out.println(k+":"+v));

        System.out.println("***********************************************************************");

        //using java collection API
        Map<Integer,Long> map2 = list.stream().collect(Collectors.groupingBy(k->k,Collectors.counting()));
        TreeMap<Integer,Long> map3 = new TreeMap<>(map2);
        map3.forEach((k,v)-> System.out.println(k+":"+v));

    }

    public static void testStreamReuse(){
        Stream<Integer> integerStream = Stream.of(1,2,3,5,13,1,2,4,11,20,21,1,1,23,5,4);
        integerStream.forEach(System.out::println);
        System.out.println("********************");
        integerStream.forEach(System.out::println);
    }
    public static void testStreamSorting(){
        Stream<Employee> employeeStream = Stream.of(new Employee("12","kushan"),new Employee("112","kushan22"),
        new Employee("11","kushan33"),new Employee("142","kushan44"),new Employee("15","kushan55"));
        System.out.println("********************");
        Comparator<Employee> employeeComparator = Comparator.comparing((Employee employee1) -> Integer.parseInt(employee1.getEmpId())).reversed();
        Employee e1 = new Employee("12","kushan");
        Employee e2 = new Employee("2","kushan");
//        employeeStream.sorted(employeeComparator)
//                .forEach(employee -> System.out.println(employee.getEmpName()));
        int comVal = e1.compareTo(e2);
        System.out.println("********Com Value *********"+comVal);
    }
    public static void main(String[] args) {
        //testListToHashMap();
        //testStreamReuse();
        testStreamSorting();
    }
}
