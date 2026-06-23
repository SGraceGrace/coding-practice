package practice.arrays;

import java.util.Arrays;
import practice.util.ScannerUtil;

public class FindMissing {

  public static void main(String[] args) {
    int[] nums = ScannerUtil.scanArrayElements();
    firstMissingPositive(nums);
  }

  private static int firstMissingPositive(int[] nums) {
    Arrays.sort(nums);
    int start = 1;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == start)
        start++;
      else if ( nums[i] > 0)
        return start;
    }
    return start;
  }
}
