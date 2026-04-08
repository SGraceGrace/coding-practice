package practice.recursion;

import practice.util.ScannerUtil;

public class Palindrome {

  public static void main(String[] args) {
    String str = ScannerUtil.scanString();
    System.out.println(checkIfPalindrome(str, 0, str.length()-1));
    System.out.println(checkValidPalindrome2(str));
  }

  private static boolean checkIfPalindrome(String str, int left, int right) {
    if(left >= right) return true;
    if(str.charAt(left) != str.charAt(right)) return false;
    return str.charAt(left) == str.charAt(right) && checkIfPalindrome(str, left + 1, right - 1);
  }

  private static boolean checkValidPalindrome2(String str) {
    int left = 0;
    int right = str.length()-1;

    while(left < right) {
      if(str.charAt(left) != str.charAt(right)) {
        return isPalindrome(str, left+1, right) || isPalindrome(str, left,right-1);
      }
      left++;
      right--;
    }
    return true;
  }

  private static boolean isPalindrome(String str, int left, int right) {
    while(left < right) {
      if(str.charAt(left) != str.charAt(right)) return false;
      left++;
      right--;
    }
    return true;
  }
}
