package Kyu7;

import java.util.*;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int degree = 1;
        int result = 0;
        for (int i = binary.size()-1; i >=0 ; i--) {
            result = result + degree*binary.get(i);
            degree = degree*2;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,1,1,1))));
    }
}
