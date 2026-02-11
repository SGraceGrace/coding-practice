package main;

import java.util.*;

public class FindMissingInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        System.out.println();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i+1) + ": ");
            arr[i] = sc.nextInt();
            System.out.println();
        }

        System.out.println(checkMissingNumber(arr));
    }

    public static int checkMissingNumber(int[] arr) {

        Set<Integer> set = new TreeSet<>();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                set.add(arr[i]);
            }
        }

        ArrayList<Integer> arrayList = new ArrayList<>(set);
        int currentNum;

        if(!arrayList.isEmpty()) {
            currentNum = arrayList.getFirst();
        } else {
            return 1;
        }

        for(int i = 1; i < arrayList.size(); i++) {
            if(arrayList.get(i) != currentNum+1) {
                return currentNum+1;
            } else {
                currentNum = arrayList.get(i);
            }
        }
        return currentNum+1;
    }
}
