package practice.patterns;

import java.util.Scanner;

public class Pattern3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    pattern1(n); System.out.println();
    pattern2(n); System.out.println();
    pattern3(n); System.out.println();
    pattern4(n); System.out.println();
  }

  private static void pattern1(int n) {
    int k = 1;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(k++ +" ");
      }
      System.out.println();
    }
  }
  private static void pattern2(int n) {

    String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(alphabets.charAt(j) + " ");
      }
      System.out.println();
    }
  }
  private static void pattern3(int n) {

    String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    for (int i = n-1; i >= 0; i--) {
      for (int j = 0; j <= i; j++) {
        System.out.print(alphabets.charAt(j) + " ");
      }
      System.out.println();
    }
  }
  private static void pattern4(int n) {
    String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(alphabets.charAt(i) + " ");
      }
      System.out.println();
    }
  }
}
