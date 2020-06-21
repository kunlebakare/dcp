import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem1 {

    public static void main(String args[]) {
        List<Integer> numbers = new ArrayList<>();
        int k = 17;

        numbers.add(10);
        numbers.add(15);
        numbers.add(3);
        numbers.add(7);
        
        System.out.println(sum(numbers, numbers, k));

    }

    public static boolean sum(List<Integer> defList, List<Integer> numbers, int k) {
        // we are implementing a modified binary search algorithm

        Collections.sort(numbers); // sorting makes this easier and faster... is also necessary

        // get the mid point
        int middleIndex = numbers.size() / 2;

        int beginIndex = 0;

        int endIndex = numbers.size() - 1;

        if (numbers.size() < 1) { // ...
            return false;
        }

        int val = k - numbers.get(middleIndex);

        if (defList.contains(val)) {
            return true;
        }

        // else
        if (val > defList.get((defList.size() - 1))) { // since val is greater than the greatest number, check upper
                                                       // half ... while loop here???

            beginIndex = middleIndex + 1;

            List<Integer> nList = new ArrayList<>();

            for (int i = beginIndex; i < numbers.size(); i++) {
                nList.add(numbers.get(i));
            }

            return sum(defList, nList, (k));

            // middleIndex = nList.size()/2; // so get middle of upper half... can we use
            // recursion here?
            // we need to repeat the cycle... number - val , then check if answer exists..
            // recursion???
        }

        if (val < defList.get((defList.size() - 1))) {// since val is lower than the greatest number, check lower half..

            beginIndex = 0;
            endIndex = middleIndex - 1;

            List<Integer> nList = new ArrayList<>();

            for (int i = beginIndex; i < (endIndex + 1); i++) {
                nList.add(numbers.get(i));
            }

            // can try this..
            return sum(defList, nList, k);
            // recursion here?
        }
        return false;
    }
}
