package practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NonRepeatingSubstring2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter input string : ");
    String inputStr = sc.nextLine();

    System.out.println(checkNonRepeatingSubstring(inputStr));
  }

  private static int checkNonRepeatingSubstring(String str) {
    int left = 0;
    int right = 0;
    int count = 0;
    Set<Character> set = new HashSet<>();

    while(right < str.length()) {
      if (!set.contains(str.charAt(right))) {
        set.add(str.charAt(right));
        count = Math.max(count, right - left + 1);
        right++;
      } else {
        set.remove(str.charAt(left));
        left++;
      }
    }
    return count;
  }
}
