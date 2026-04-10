package practice.recursion;

import java.util.HashMap;
import java.util.Map;
import practice.util.ScannerUtil;

public class OperationOfArray {

  public static void main(String[] args) {
//    int[] nums = ScannerUtil.scanArrayElements();
//    solution1(nums);
//    System.out.println();

    int[] numbers = ScannerUtil.scanArrayElements();
    int target = ScannerUtil.scanInteger();
    twoSum(numbers, target);
  }

  private static void solution1(int[] nums) {
    for(int i = 0; i < nums.length - 1; i++) {
      if(nums[i] == nums[i+1]) {
        nums[i] = nums[i] * nums[i+1];
        nums[i+1] = 0;
      }
    }
    int[] res = new int[nums.length];
    int j = 0;
    for(int i = 0; i < nums.length; i++) {
      if(nums[i] != 0) {
        res[j++] = nums[i];
      }
    }
    for (int k = 0; k < res.length; k++) {
      System.out.print(res[k] + " ");
    }
  }

  private static void twoSum(int[] numbers, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    int[] res = new int[2];
    for (int i = 0; i < numbers.length; i++) {
      int key = target - numbers[i];
      if (map.containsKey(key)) {
        res[0] = map.get(key);
        res[1] = i+1;
      } else {
        map.put(numbers[i], i+1);
      }
    }

    for (int k = 0; k < res.length; k++) {
      System.out.print(res[k] + " ");
    }
  }
}
