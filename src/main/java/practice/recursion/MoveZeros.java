package practice.recursion;

import practice.util.ScannerUtil;

public class MoveZeros {

  public static void main(String[] args) {

    int[] nums = ScannerUtil.scanArrayElements();
    int j = 0;

    for(int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        j++;
      }
    }

    for (int k = 0; k < nums.length; k++) {
      System.out.println(nums[k]);
    }
  }
}
