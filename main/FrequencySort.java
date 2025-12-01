package main;

import java.util.*;
import java.util.stream.Collectors;


public class FrequencySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(frequencySort(str));
    }

    public static String frequencySort(String str) {
        Map<Character, Integer> countOfEachCharacter = new HashMap<>();
        for(int i = 0; i < str.length(); i++) {
            if(countOfEachCharacter.containsKey(str.charAt(i))) {
                countOfEachCharacter.put(str.charAt(i), countOfEachCharacter.get(str.charAt(i))+1);
            } else {
                countOfEachCharacter.put(str.charAt(i), 1);
            }
        }

        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(countOfEachCharacter.entrySet());

        // Step 3: Sort the list
        Collections.sort(entryList, (a, b) -> {
            // First sort by frequency in descending order
            int frequencyCompare = b.getValue().compareTo(a.getValue());
            // If frequencies are the same, sort alphabetically
            return frequencyCompare != 0 ? frequencyCompare : a.getKey().compareTo(b.getKey());
        });

        String result = "";
        for(int i = 0; i < entryList.size(); i++) {
            for(int j = 0; j < entryList.get(i).getValue(); j++) {
                result += entryList.get(i).getKey();
            }
        }
        return result;
    }
}
