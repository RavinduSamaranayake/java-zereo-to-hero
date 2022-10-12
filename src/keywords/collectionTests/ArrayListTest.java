package keywords.collectionTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Ravindu
 * 8/13/2022
 */
public class ArrayListTest {
    public static void testFixedList(){
        List<Integer> testList;
        testList= Arrays.asList(1,2,3,4,1,2);
//        testList = new ArrayList<>();
 //       testList.add(123); // will give an exception
        testList.forEach(System.out::println);
    }

    public static void removeElements(){
        System.out.println("*********************************************************");
        List<String> list = new ArrayList<>();
        list.add("Monday");
        list.add(null);
        list.add("Tuesday");
        list.remove(0);
        System.out.println(list.get(0));
    }


    public static void main(String[] args) {
        testFixedList();
        removeElements();
    }


}
