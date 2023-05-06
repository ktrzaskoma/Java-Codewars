package codewars;

import java.util.HashMap;
import java.util.Map;

public class Greed {

    public static int greedy(int[] dice) {

        Map<Integer, Integer> arrayCounter = new HashMap<>();

        for (int i = 0; i < dice.length; i++) {
            int counter = 0;
            for (int j = 0; j < dice.length; j++) {
                if (dice[i] == dice[j]) {
                    counter++;
                }
            }

            arrayCounter.put(dice[i], counter);
            counter = 0;
        }


        int maxPoints = 0;
        if (arrayCounter.get(1) != null && arrayCounter.get(1) >= 3) {
            maxPoints += 1000;
            arrayCounter.put(1, arrayCounter.get(1) - 3);
        }
        if (arrayCounter.get(2) != null && arrayCounter.get(2) >= 3) {
            maxPoints += 200;
        }
        if (arrayCounter.get(3) != null && arrayCounter.get(3) >= 3) {
            maxPoints += 300;
        }
        if (arrayCounter.get(4) != null && arrayCounter.get(4) >= 3) {
            maxPoints += 400;
        }
        if (arrayCounter.get(5) != null && arrayCounter.get(5) >= 3) {
            maxPoints += 500;
            arrayCounter.put(5, arrayCounter.get(5) - 3);
        }
        if (arrayCounter.get(6) != null && arrayCounter.get(6) >= 3) {
            maxPoints += 600;
        }

        maxPoints += arrayCounter.getOrDefault(1, 0) * 100;
        maxPoints += arrayCounter.getOrDefault(5, 0) * 50;

        return maxPoints;
    }

    public static void main(String[] args) {
        int dice[] = {2, 4, 4, 5, 4};
        System.out.println(greedy(dice));
    }
}

