package practice.arrays;

import java.util.Scanner;

public class RemoveDuplicates {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter value of n:");
    int n = sc.nextInt();

    System.out.println("------Enter Array Elements------");
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      System.out.print("Element" + i + ":");
      arr[i] = sc.nextInt();
      System.out.println();
    }

    removeDuplicates(arr, n);
  }

  private static void removeDuplicates(int[] arr, int n) {
    int i = 0;

    for (int j = i+1; j < n; j++) {
      if(arr[i] != arr[j]) {
        arr[i+1] = arr[j];
        i++;
      }
    }

    for (int j = 0; j < i+1; j++) {
      System.out.println(arr[j]);
    }
  }
}
