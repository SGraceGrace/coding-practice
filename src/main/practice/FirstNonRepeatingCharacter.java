package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(findFirstNonRepeatingCharacter(str));
    }

    public static String findFirstNonRepeatingCharacter(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }

        for(int i = 0; i < str.length(); i++) {
            if(map.get(str.charAt(i)) == 1) {
                return "The first non-repeating character is " + str.charAt(i);
            }
        }
        return "All the letters are repeating";
    }
}
