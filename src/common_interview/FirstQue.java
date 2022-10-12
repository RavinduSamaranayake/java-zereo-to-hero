package common_interview;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ravindu
 * 10/11/2022
 */
public class FirstQue {
    public static int symbolicToOctal(String permString) {
        List<String> blocks = new ArrayList<>();
        int blockSize = 3;
        for (int i = 0; i < permString.length(); i += blockSize) {
            blocks.add(permString.substring(i, Math.min(permString.length(), i + blockSize)));
        }
        String outStr = "";
        for(String str : blocks){
            outStr = outStr + sumValueOfBlock(str);
        }
        return Integer.parseInt(outStr);
    }
    static int sumValueOfBlock(String blockStr){
        int val = 0;
        for (char ch : blockStr.toCharArray()){
            val = val + mapCharToInt(ch);
        }
        return val;
    }
    static int mapCharToInt(char ch) {
        switch (ch) {
            case 'r':
                return 4;
            case 'w':
                return 2;
            case 'x':
                return 1;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        // Should write 752
        System.out.println(symbolicToOctal("rwxr-x-w-"));
    }
}
