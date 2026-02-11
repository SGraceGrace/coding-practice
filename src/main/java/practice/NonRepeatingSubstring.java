package practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NonRepeatingSubstring {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter input string : ");
    String inputStr = sc.nextLine();

    System.out.println(checkNonRepeatingSubstring(inputStr));
  }

  private static int checkNonRepeatingSubstring(String str) {

    int n = str.length();
    int maxCount = 0;

    for (int i = 0; i < n; i++) {
      Set<Character> set = new HashSet<>();
      int count = 0;
      for (int j = i; j < n; j++) {
        char c = str.charAt(j);
        if(!set.contains(c)) {
          set.add(c);
          count++;
        } else {
          break;
        }
      }
      if(count > maxCount) {
        maxCount = count;
      }
    }
    return maxCount;
  }
}
