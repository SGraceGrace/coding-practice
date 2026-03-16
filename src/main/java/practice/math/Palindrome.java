package practice.math;

import java.util.Scanner;

public class Palindrome {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int result = reverseNumbers(n);

    if(n == result) {
      System.out.println("This is Palindrome");
    } else {
      System.out.println("This is not a Palindrome");
    }
  }

  public static int reverseNumbers(int n) {
    int result = 0;

    while(n > 0) {
      int rem = n % 10;
      result *= 10;
      result += rem;

      n = n / 10;
    }

    return result;
  }
}
