package main;

import java.util.Scanner;

public class ClimbingSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfStairs = sc.nextInt();
        System.out.println("No of Stairs:" + noOfStairs);
        System.out.println("Ways to reach upstairs:" + calculateStepsToReach(noOfStairs));
    }
    public static int calculateStepsToReach(int noOfStairs) {
        if(noOfStairs == 0 || noOfStairs == 1) {
            return 1;
        }
        return calculateStepsToReach(noOfStairs-1) + calculateStepsToReach(noOfStairs-2);
    }
}
