package codewars;

import java.util.*;

public class SortOdd {

    public static int[] sortArray(int[] array) {

        List<Integer> evenElements = new ArrayList<>();
        List<Integer> oddElements = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenElements.add(array[i]);
            } else
                oddElements.add(array[i]);
        }

        Collections.sort(oddElements);

        int oddIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = oddElements.get(oddIndex);
                oddIndex++;
            }
        }

       return array;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{9, 7, 5, 8, 5, 4})));
    }
}
