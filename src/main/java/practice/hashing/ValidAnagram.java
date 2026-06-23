package practice.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import practice.util.ScannerUtil;

public class ValidAnagram {

  public static void main(String[] args) {
//    String s = ScannerUtil.scanString();
//    String t = ScannerUtil.scanString();
//    System.out.println(isAnagram(s, t));

    groupAnagram();
  }

  public static boolean isAnagram(String s, String t) {
    if (s.length() != t.length())
      return false;
    HashMap<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
    }

    for (int i = 0; i < t.length(); i++) {
      if(!map.containsKey(t.charAt(i))) return false;
      else map.put(t.charAt(i), map.get(t.charAt(i)) - 1);

      if(map.get(t.charAt(i)) == 0) map.remove(t.charAt(i));
    }

    return map.isEmpty();
  }

  private static void groupAnagram() {
    String[] str = ScannerUtil.scanStringElements();
    HashMap<String, List<String>> groups = new HashMap<>();

    for (int i = 0; i < str.length; i++) {
      char[] charArray = str[i].toCharArray();
      Arrays.sort(charArray);
      groups.computeIfAbsent(new String(charArray), c -> new ArrayList<>()).add(str[i]);
    }
    System.out.println(groups.values().stream().toList());
  }
}
