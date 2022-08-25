package keywords.interviews;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Ravindu
 * 8/17/2022
 */
public class AlgoTest1 {

    public static void test2ndMaxValue(){
        int[] arr = {23,3,10,12,1,12,30,23,12,23,23,23};
        int i = arr[0];
        int j = arr[1];
        for(int e=0;e<(arr.length -1) ;e++){
            if(i < arr[e]){
                i = arr[e];
            }if(j < arr[e+1]){
                j = arr[e+1];
            }
        }
        System.out.println("2nd larget is : " + Integer.min(i,j));
    }

    public static void test2ndMaxValue2loop(){

        int[] arr = {23,3,10,12,1,12,30,23,12,23,23,23};
        int temp;
        for(int i = 0;i < arr.length;i++){
            for(int j = i+1 ; j < arr.length;j++){
                if(arr[j]<arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("2nd Max from 2loop :"+arr[arr.length-2]);
        System.out.println(Arrays.toString(arr));

    }

    public static void test2ndMaxValue2(){
        Set<Integer> maxSet = new HashSet<>(Arrays.asList(23,3,10,12,1,12,30,23,12,23,23,23));
        List<Integer> arr = new ArrayList<>(maxSet);
        int i = arr.get(0);
        int j = arr.get(1);
        for(int e=0;e<(arr.size() -1) ;e++){
            if(i < arr.get(e)){
                i = arr.get(e);
            }if(j < arr.get(e+1)){
                j = arr.get(e+1);
            }
        }
        System.out.println("2nd larget is : " + Integer.min(i,j));
    }

    public static void printDup(){
        String str = "abbbaacdbbbbbb";
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<str.length();i++){
            Character c = str.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        printDup();
//        test2ndMaxValue2loop();
//        test2ndMaxValue2();
    }
}

