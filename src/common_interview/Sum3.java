package common_interview;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Ravindu
 * 10/11/2022
 */
public class Sum3 {
    /**
     * Adds/appends list of integers at the end of internal list.
     */
    List<Integer> internalList;
    public Sum3(){
        internalList = new LinkedList<>();
    }
    public void addLast(int[] list) {
        for(int val : list){
            internalList.add(val);
        }
    }

    /**
     * Returns boolean representing if any three consecutive integers in the
     * internal list have given sum.
     */
    public boolean containsSum3(int sum) {
        internalList.sort(Comparator.naturalOrder());
        int initNum = internalList.get(0);

        for(int i = 0 ; i< internalList.size();i++){
//            if(i < 3){
//                todo
//            }
        }
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public static void main(String[] args) {
        Sum3 s = new Sum3();

        s.addLast(new int[] { 1, 2, 3 });

        System.out.println(s.containsSum3(6));
        System.out.println(s.containsSum3(9));

        s.addLast(new int[] { 4 });

        System.out.println(s.containsSum3(9));
    }
}
