package practice.patterns;

import java.util.Scanner;

public class Pattern4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    pattern1(n);
    pattern2(n);
  }

  private static void pattern1(int n) {
    String alphabets = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n-i; j++) {
        System.out.print(" ");
      }
      int breakpoint = i+1;
      char c = 'A';
      for (int j = 1; j <= (2*i)+1; j++) {
        if(j < breakpoint) {
          System.out.print(c++);
        } else {
          System.out.print(c--);
        }
      }
      for (int j = (2*i)+1; j < n; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }
  }
  private static void pattern2(int n) {
    String alphabets = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    for (int i = 0; i < n; i++) {
      char c = alphabets.charAt(n-i);
      for (int j = 0; j <= i; j++) {
        System.out.print(c++);
      }
      System.out.println();
    }
  }
}
