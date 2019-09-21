package dcp;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class DCP {

    private static List<Integer> intList = new ArrayList<Integer>();

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int k = read.nextInt();// read k value
        read.close();

        Collections.addAll(intList, 10, 15, 3, 7); // add numbers to list

        boolean bool = AddsUpToK(k);
        System.out.println("The value is " + bool); //prints true or false value
        //true--- two numbers can add up to k
        //false --- no two numbers can add up to k
    }

    public static boolean AddsUpToK(int k) {

        int kVal = 0;

        for (int i = intList.size() - 1; i > 0; i--) {//iterate through the list of numbers
                                                      //starting from the last number
            int x = i - 1;
            while (x >= 0) { //add the numbers until the correct number addition combination is found. Then:
                kVal = intList.get(i) + intList.get(x);
                
                x--;
                if (kVal == k) {

                    return true;// returns true if found
                }
            }
        }
        return false;//returns false if no two numbers in the list can add up to k
    }
}
