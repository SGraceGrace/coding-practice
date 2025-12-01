package main;

import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter no of elements : ");
        int n = sc.nextInt();
        System.out.println();

        System.out.print("Enter the element : ");
        int k = sc.nextInt();
        System.out.println();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println(checkIfArrayContainsElement(arr, k));
    }

    public static boolean checkIfArrayContainsElement(int arr[], int k) {
        for(int i = 0; i < arr.length; i++) {
            if(checkIfExists(Math.abs(arr[i]-k), arr)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkIfExists(int k, int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == k) {
                return true;
            }
        }
        return false;
    }
}
