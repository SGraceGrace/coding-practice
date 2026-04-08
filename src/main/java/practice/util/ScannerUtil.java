package practice.util;

import java.util.Scanner;

public class ScannerUtil {

  public static int[] scanArrayElements() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter value of n: ");
    int n = sc.nextInt();

    System.out.println("------Enter Array Elements------");
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      System.out.print("Element" + i + ":");
      arr[i] = sc.nextInt();
    }

    System.out.print("Array Elements :");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();

    return arr;
  }
}
