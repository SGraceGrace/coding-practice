package practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import practice.util.ScannerUtil;

public class ThreeSum {

  public static void main(String[] args) {
//    int[] numbers = ScannerUtil.scanArrayElements();
//    List<List<Integer>> result = threeSum(numbers);

    String s = ScannerUtil.scanString();
    System.out.println(reverseVowels(s));
  }
  public static List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);

    for (int i = 0; i < nums.length - 2; i++) {
      if (i > 0 && nums[i] == nums[i - 1])
        continue;

      int left = i + 1;
      int right = nums.length - 1;

      while (left < right) {
        int sum = nums[i] + nums[left] + nums[right];

        if (sum == 0) {
          result.add(List.of(nums[i], nums[left], nums[right]));

          left++;
          right--;

          while (left < right && nums[left] == nums[left - 1])
            left++;
          while (left < right && nums[right] == nums[right + 1])
            right--;
        } else if (sum < 0) {
          left++;
        } else {
          right--;
        }
      }
    }

    return result;
  }
  public static String reverseVowels(String s) {
    String vowels = "aeiouAEIOU";
    int left = 0;
    int right = s.length() - 1;

    StringBuilder sb = new StringBuilder(s);

    while (left < right) {
      while (left < right && vowels.indexOf(sb.charAt(left)) == -1) {
        left++;
      }
      while (left < right && vowels.indexOf(sb.charAt(right)) == -1) {
        right--;
      }

      char t = sb.charAt(right);
      sb.setCharAt(right, sb.charAt(left));
      sb.setCharAt(left, t);

      left++;
      right--;
    }
    return sb.toString();
  }
}
