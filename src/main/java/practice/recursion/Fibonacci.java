package practice.recursion;

import practice.util.ScannerUtil;

public class Fibonacci {

  public static void main(String[] args) {
    int n = ScannerUtil.scanInteger();
    fibonacciSeries(n);
    System.out.println(printNthFibonacci(n));
  }

  private static void fibonacciSeries(int n) {
    int a = 0;
    int b = 1;

    System.out.print(a + " ");
    System.out.print(b + " ");
    for (int i = 0; i < n -2; i++) {
      int c = a + b;
      System.out.print(c + " ");
      a = b;
      b = c;
    }
    System.out.println();
  }

  private static int printNthFibonacci(int n) {
    if(n <= 1) {
      return n;
    }
    return printNthFibonacci(n - 1) + printNthFibonacci(n - 2);
  }
}
