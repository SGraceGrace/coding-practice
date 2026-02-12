package practice;

import java.util.Scanner;

public class LongestRepeatingCharacterReplacement {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter input string : ");
    String str = sc.nextLine();

    System.out.println("Enter input number : ");
    int k = sc.nextInt();

    System.out.println(longestNonRepeatingCharacter(str, k));
  }

  private static int longestNonRepeatingCharacter(String str, int k) {

    int n = str.length();
    int max = 0;

    for (int i = 0; i < n; i++) {
      char sourceCharacter = str.charAt(i);
      int count = 0;
      for (int j = i; j < n; j++) {
        char targetCharacter = str.charAt(j);
        if(sourceCharacter == targetCharacter) {
          count++;
        } else if(k > 0) {
          k--;
          count++;
        } else {
          break;
        }
      }
      if(count > max) {
        max = count;
      }
    }
    return max;
  }
}
