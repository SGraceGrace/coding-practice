package practice.arrays;

import java.util.Scanner;

public class SecondLargestElement {

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

    int secondLargest = getSecondLargest(arr, n);
    System.out.println(secondLargest);

    int secondSmallest = getSecondSmallest(arr, n);
    System.out.println(secondSmallest);
  }

  private static int getSecondLargest(int[] arr, int n) {
    int largest = arr[0];
    int secondLargest = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      int num = arr[i];
      if(num > largest) {
        secondLargest = largest;
        largest = arr[i];
      } else if(num > secondLargest && num < largest) {
        secondLargest = arr[i];
      }
    }
    return secondLargest;
  }

  private static int getSecondSmallest(int[] arr, int n) {
    int smallest = arr[0];
    int ssmallest = Integer.MAX_VALUE;

    for (int i = 0; i < n; i++) {
      int num = arr[i];

      if(num < smallest) {
        ssmallest = smallest;
        smallest = num;
      } else if (num < ssmallest && num > smallest) {
        ssmallest = num;
      }
    }

    return ssmallest;
  }
}
