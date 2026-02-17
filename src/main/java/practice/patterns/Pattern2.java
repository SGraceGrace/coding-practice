package practice.patterns;

import java.util.Scanner;

public class Pattern2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    pattern1(n);
    pattern2(n);
  }

  private static void pattern2(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < ((2*n)-(2*i+1)); j++) {
        System.out.print("*");
      }
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }
  }

  private static void pattern1(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 1; j < n-i; j++) {
        System.out.print(" ");
      }
      for (int j = n-i; j < n+i+1; j++) {
        System.out.print("*");
      }
      for (int j = n+i+1; j < n; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}
