package common_interview;

/**
 * @author Ravindu
 * 8/26/2022
 */
public class Common {
    public static void reverseString(String str){
        char [] chars = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = chars.length-1;i>=0;i--){
            stringBuilder.append(chars[i]);
        }
        System.out.println("Reversed String is : "+stringBuilder);
    }

    public static void swapTwoNumbersWithoutThirdVar(int a,int b){
        b = (a + b);
        a = b - a;
        b = b - a;
        System.out.printf("a = %d, b = %d ",a,b);
    }

    public static void stringContainsVowels(String str){
        System.out.println("Contains Vowels : "+str.toLowerCase().matches(".*[aeiou].*"));
    }

    public static void main(String[] args) {
        reverseString("Kushan");
        swapTwoNumbersWithoutThirdVar(10,20);
        stringContainsVowels("Hello");
    }
}
