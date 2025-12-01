package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LostTreasureMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NO OF CO-0RDINATE PAIRS: ");
        int noOfCoordinates = sc.nextInt();
        System.out.println();

        ArrayList<CoordinatePairs> coordinatePairsList = new ArrayList<>();

        for(int i = 0; i < noOfCoordinates; i++) {
            System.out.println("ENTER " + (i+1) +"'th CO-ORDINATE: ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            CoordinatePairs coordinatePairs = new CoordinatePairs(x, y);
            coordinatePairsList.add(coordinatePairs);
        }
        System.out.println(findSafeTreasureLocation(coordinatePairsList));
    }

    public static String findSafeTreasureLocation(ArrayList<CoordinatePairs> coordinates) {
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < coordinates.size(); i++) {
            if(map.containsKey(coordinates.get(i).toString())) {
                map.put(coordinates.get(i).toString(), map.get(coordinates.get(i).toString())+1);
            } else {
                map.put(coordinates.get(i).toString(), 1);
            }
        }

        for(int i = 0; i < coordinates.size(); i++) {
            if(map.get(coordinates.get(i).toString()) == 1) {
                return coordinates.get(i).toString();
            }
        }
        return "All coordinates are traps";
    }
}
