package common_interview;

import java.util.*;

/**
 * @author Ravindu
 * 8/27/2022
 */
public class StringRelated {
    //Question 2 : Write a java program to check if two Strings are anagram in java? For example: Angel and Angle are anagrams
    public static boolean checkStringIsAnagram(String str1,String str2){
        str1 = str1.toLowerCase().trim();
        str2 = str2.toLowerCase().trim();
        if(str1.length() != str2.length())
            return false;

        for(String ch : str1.split("")){
            if(!str2.contains(ch)){
                return false;
            }
        }
        return true;
    }

    //Question 3 : Write a program to check if String has all unique characters in java?
    public static boolean stringHasAllUnique(String str){
        str = str.trim().toLowerCase();
        Set<Character> set = new HashSet<>();
        for (char ch : str.toCharArray()){
            if(!set.add(ch))
                return false;
        }
        return true;
    }

    //Question 4 : How to check if one String is rotation of another String in java?
    public static boolean isRotationOfAnother(String str,String rotatedStr){
        String str1 = str + str;
        return str1.contains(rotatedStr);
    }

    //Question 5 : How to find duplicate characters in String in java?
    public static void findDuplicates(String str){
        str = str.toLowerCase().trim();
        Set<Character> characterSet = new HashSet<>();
        Set<Character> dupCharSet = new HashSet<>();
        for(char ch : str.toCharArray()){
            if(!characterSet.add(ch))
                dupCharSet.add(ch);
        }
        System.out.println("Q5 duplicate chars : "+dupCharSet);
    }

    //Question 6 : Find first non repeated character in String in java?
    public static void findFirstNonRepeatableChar(String str){
        str = str.toLowerCase().trim();
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (char ch : str.toCharArray()){
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else {
                map.put(ch, map.get(ch)+1);
            }
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                System.out.println("Q6 First Non Repeat Char is : "+entry.getKey());
                break;
            }
        }
    }

    //Question 7 : Find all substrings of String in java?
    //Solution: Java program to find all substrings of a String.
    //For example: If input is “abb”  then output should be “a”, “b”,”b”, “ab”, “bb”, “abb”
    public static void findAllSubstring(String str){
        List<String> substringList = new ArrayList<>();
        for(int i = 0;i<str.length(); i++){
            for(int j = i+1;j<=str.length();j++){
                substringList.add(str.substring(i,j));
            }
        }
        System.out.println("Q7 All Substrings for : "+str+" -> "+substringList);
    }

    public static void main(String[] args) {
        System.out.println("Q2 checkStringIsAnagram : "+checkStringIsAnagram("java2blog","aj2vabgol"));
        System.out.println("Q3 stringHasAllUnique : "+stringHasAllUnique("java2blog"));
        System.out.println("Q4 isRotationOfAnother : "+isRotationOfAnother("java2blog","va2blogja"));
        findDuplicates("Anand");
        findFirstNonRepeatableChar("Anandakushana");
        findAllSubstring("abb");
    }
}
