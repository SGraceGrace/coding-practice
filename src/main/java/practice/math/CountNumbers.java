package practice.math;

import java.util.Scanner;

public class CountNumbers {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int count = countNumbers(n);
    System.out.println(count);
  }

  public static int countNumbers(int n) {

    int count = 0;
    while(n > 0) {
      n = n / 10;
      count++;
    }
    return count;
  }
}
