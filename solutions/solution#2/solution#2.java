package solution2;
//solution to DAILY CODING PROBLEM #2 using division
import java.util.Arrays;
import java.util.Scanner;

public class Solution2 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Size of Array? ");
        int n = read.nextInt(); // get array size
        
        System.out.println("Input Numbers...");
        int[] uArray = new int[n];
        int i = 0;
        
        while(i<n){//fill array with numbers
            uArray[i] = read.nextInt();
            i++;
        }
        
        read.close();
        
        Compute comp = new Compute();//create Compute object
        System.out.println(Arrays.toString(comp.Calculate(uArray)));
        //Calculate and print array
    }

}

class Compute {//this class should be self explanatory ;)
    
    public static int[] Calculate(int[] anArray) {
        
        int multiples = 1;
        int[] multiplesArray = new int[anArray.length];
       
        for (int num : anArray) {
            multiples = multiples * num;
        }

        for (int i = 0; i < multiplesArray.length; i++) {
            multiplesArray[i] = multiples / anArray[i];
        }
         
        return multiplesArray;
    }

}
