package org.example;

import java.util.Scanner;

public class NonRepeatingCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input String: ");
        String inputStr = sc.nextLine();

        char result = checkNonRepeatingCharacter(inputStr);
        if(result == 0) {
            System.out.println(-1);
        } else {
            System.out.println(result);
        }
    }

    private static char checkNonRepeatingCharacter(String inputStr) {
        int n = inputStr.length();

        if(n == 1) {
            return inputStr.charAt(0);
        }

        if(n == 2 && inputStr.charAt(0) != inputStr.charAt(1)) {
            return inputStr.charAt(0);
        }

        for (int i = 0; i < n ; i++) {
            char c1 = inputStr.charAt(i);
            int count = 0;
            for (int j = 0; j < n; j++) {
                char c2 = inputStr.charAt(j);
                if(c1 == c2) {
                    count++;
                }
            }
            if(count == 1) {
                return c1;
            }
        }
        return '\0';
    }
}