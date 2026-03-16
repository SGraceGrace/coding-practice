package practice.math;

import java.util.Scanner;

public class ReverseNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int count = reverseNumbers(n);
    System.out.println(count);
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
