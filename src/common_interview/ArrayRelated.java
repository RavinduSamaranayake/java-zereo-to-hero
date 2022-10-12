package common_interview;

import java.util.Arrays;

/**
 * @author Ravindu
 * 8/28/2022
 */
public class ArrayRelated {
    //Question 10 : Write java Program to Find Smallest and Largest Element in an Array.
    public static void findSmallestLargest(int [] arr){
        int smallest = arr[0];
        int largest = arr[0];
        for (int j : arr) {
            if (j < smallest) {
                smallest = j;
            }
            if (j > largest) {
                largest = j;
            }
        }
        System.out.printf("Q10 Largest number is : %d  Smallest Number is : %d ",largest,smallest);
        System.out.println();
    }
    //Question 11 : Find missing number in the array.
    public static void findMissingNumber(int [] arr){
        int smallest = 1;
        int largest = arr.length + 1;
        for(int i = smallest;i<=largest;i++){
            if(!isValueInclude(arr,i)){
                System.out.println("Q11 Missing number is : "+i +" of Array : "+ Arrays.toString(arr));
                break;
            }
        }
    }
    public static boolean isValueInclude(int [] arr,int value){
        for(int val : arr){
            if(val == value)
                return true;
        }
        return false;
    }

    //Question 11 : Optimized sol...
    public static int findMissingNumberOptimized(int[] arr)
    {
        int n=arr.length+1;
        int sum=n*(n+1)/2;
        int restSum=0;
        for (int j : arr) {
            restSum += j;
        }
        return sum-restSum;
    }

    //Question 12 : Search an element in rotated and sorted array.
    public static void searchElementOnSortedRotated(int[] arr,int element)
    {
        for(int i =0; i < arr.length ; i++){
            if(element == arr[i]){
                System.out.println("Q12 Element Found of arr position : "+i);
            }else {
                if(i < (arr.length-1)&&arr[i+1]<arr[i]){
                    if(element>arr[i]){
                        System.out.println("Q12 Element Not Found.");
                        break;
                    }else if(element>arr[arr.length-1]){
                        System.out.println("Q12 Element Not Found.");
                        break;
                    }
                }
            }
        }
    }

    public static int findSecondLargestNumberInTheArray(int[] array)
    {
        // Initialize these to the smallest value possible
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        // Loop over the array
        for (int j : array) {
            // If current element is greater than highest
            if (j > highest) {

                // assign second highest element to highest element
                secondHighest = highest;

                // highest element to current element
                highest = j;
            } else if (j > secondHighest && j != highest)
                // Just replace the second highest
                secondHighest = j;
        }

        // After exiting the loop, secondHighest now represents the second
        // largest value in the array
        return secondHighest;
    }

    public static void main(String[] args) {
        findSmallestLargest(new int[]{12, 11, 3, 4, 3, 1, 56, 12, 1 ,56, 21, 33});
        findMissingNumber(new int[]{7,5,6,1,4,2});
        System.out.println("Q11 Optimized : "+findMissingNumberOptimized(new int[]{7,5,6,1,4,2}));
        searchElementOnSortedRotated(new int[]{16, 19, 21, 25, 3, 5, 8, 10},8);
        System.out.println("2nd Largest array : "+
                findSecondLargestNumberInTheArray(new int[]{12, 11, 33, 4, 3, 1, 56, 12, 1 ,56, 21, 33}));
    }
}
