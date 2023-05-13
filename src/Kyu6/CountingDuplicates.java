package Kyu6;

import java.util.*;

public class CountingDuplicates {

    public static int duplicateCount(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        String lowCaseText = text.toLowerCase();
        for (int i = 0; i < lowCaseText.length(); i++) {
            if (map.containsKey(lowCaseText.charAt(i))) {
                map.put(lowCaseText.charAt(i), map.get(lowCaseText.charAt(i)) + 1);
            } else {
                map.put(lowCaseText.charAt(i), 1);
            }
        }
        return (int) map.values().stream().filter(x->x>1).count();
    }

    public static void main(String[] args) {
        System.out.println(duplicateCount("abcde"));
        System.out.println(duplicateCount("Indivisibilities"));
    }
}
