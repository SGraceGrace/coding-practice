package practice.recursion;

import practice.util.*;

public class ReverseArray {

  public static void main(String[] args) {

    int[] arr = ScannerUtil.scanArrayElements();
    int n = arr.length;

    reverseArray(arr, 0, n-1);

    System.out.print("Result : ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  private static void reverseArray(int[] arr, int left, int right) {
    if(left >= right) return;

    int temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;

    reverseArray(arr, left+1, right-1);
  }
}
