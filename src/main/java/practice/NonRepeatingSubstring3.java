package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeatingSubstring3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter input string : ");
    String inputStr = sc.nextLine();

    System.out.println(checkNonRepeatingSubstring(inputStr));
  }

  private static int checkNonRepeatingSubstring(String str) {
    int right = 0;
    int left = 0;
    int count = 0;
    Map<Character, Integer> map = new HashMap<>();

    while (right < str.length()) {
      char c = str.charAt(right);
      if (map.containsKey(c)) {
        left = Math.max(left, map.get(c) + 1);
      }
      map.put(c, right);
      count = Math.max(count, right - left + 1);
      right++;
    }
    return count;
  }
}
