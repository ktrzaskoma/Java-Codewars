package codewars.gapinprimes;


import java.util.Arrays;

public class GapInPrimes {

    public static long[] gap(int g, long m, long n) {
        long[] result = new long[2];
        long prevPrime = 0;

        for (long i = m; i <= n; i++) {
            if (isPrime(i)) {
                if (i - prevPrime == g) {
                    result[0] = prevPrime;
                    result[1] = i;
                    return result;
                }
                prevPrime = i;
            }
        }

        return null;
    }

    private static boolean isPrime(long num) {
        if (num < 2) {
            return false;
        }

        for (long i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
//        System.out.println(Arrays.toString(gap(2, 3, 50)));  // [3, 5]

        System.out.println(isPrime(15));
    }

}
