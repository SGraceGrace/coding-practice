package main;

import java.util.Scanner;

public class MultiplesOfArray {
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
        calculateMultiples(arr, n);

        System.out.print("After calculation : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void calculateMultiples(int[] arr, int n) {
        int totalMultipleValue = 1;
        int nonZeroMultipleValue = 1;
        int countZeros = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] != 0) {
                nonZeroMultipleValue *= arr[i];
            } else {
                countZeros++;
            }
            totalMultipleValue *= arr[i];
        }

        if(countZeros > 1) {
            nonZeroMultipleValue = 0;
        }

        for(int i = 0; i < n; i++) {
            if(arr[i] == 0) {
                arr[i] = nonZeroMultipleValue;
            } else {
                arr[i] = totalMultipleValue / arr[i];
            }
        }
    }
}
