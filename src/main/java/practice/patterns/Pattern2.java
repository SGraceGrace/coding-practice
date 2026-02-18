package practice.patterns;

import java.util.Scanner;

public class Pattern2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    pattern1(n);
    pattern2(n);
    pattern3(n);
    pattern4(n);
    pattern5(n);
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

  private static void pattern3(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    for (int i = n-1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  private static void pattern4(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j < i; j++) {
        if((i-j) % 2 == 0) {
          System.out.print(0);
        } else {
          System.out.print(1);
        }
      }
      System.out.println();
    }
  }
  
  private static void pattern5(int n) {
    for (int i = 1; i <= n; i++) {
      int j;
      for (j = 1; j <= i; j++) {
        System.out.print(j);
      }
      int k;
      for (k = j; k <= ((2*n)-i); k++) {
        System.out.print(" ");
      }
      for (int l = i; l >=1; l--) {
        System.out.print(l);
      }
      System.out.println();
    }
  }
}
