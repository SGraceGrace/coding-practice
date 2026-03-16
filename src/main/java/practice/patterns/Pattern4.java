package practice.patterns;

import java.util.Scanner;

public class Pattern4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    pattern1(n);
    pattern2(n);
    pattern3(n);
    System.out.println();
    pattern4(n);
    System.out.println();
    pattern5(n);
    System.out.println();
    pattern6(n);
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
  private static void pattern3(int n) {
    for (int i = n; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      for (int j = 0; j < 2*(n-i); j++) {
        System.out.print(" ");
      }
      for (int j = i; j > 0; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      for (int j = 0; j < (2*n)-(2*i); j++) {
        System.out.print(" ");
      }
      for (int j = i; j > 0; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  private static void pattern4(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      for (int j = 0; j < (2*n)-(2*i); j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = n-1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      for (int j = 0; j < (2*n) - (2*i); j++) {
        System.out.print(" ");
      }
      for (int j = i; j > 0; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  private static void pattern5(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n-1; j++) {
        if(i == 0 || i == n-1) {
          System.out.print("*");
        } else if(j == 0 || j == n-2) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
  private static void pattern6(int n) {  //pending
    int l = (2*n)-1;
    for (int i = 0; i < l; i++) {
      for (int j = 0; j < l; j++) {
        if(i == 0 || i == l) {
          System.out.print(n);
        } else {
          System.out.print(n-j);
        }
      }
      System.out.println();
    }
  }
}

