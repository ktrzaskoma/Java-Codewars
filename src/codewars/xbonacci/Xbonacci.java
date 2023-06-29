package codewars.xbonacci;

import java.util.Arrays;

public class Xbonacci {

    public static double[] xbonacci(double[] signature, int n) {
        double[] result = new double[n];

        for (int i = 0; i < n; i++) {
            if (i < signature.length) {
                result[i] = signature[i];
            } else {
                for (int j = 1; j <= signature.length; j++) {
                    result[i] += result[i-j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.printf("Oto lista => " + Arrays.toString(xbonacci(new double[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34}, 10)));
    }
}
