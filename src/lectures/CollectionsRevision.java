package lectures;

import java.util.List;

public class CollectionsRevision {


    static void show(List<?> list) {
        for (Object o : list)
            System.out.println(o);
    }


//    public static void main(String[] args) {
//        String[] items = { "Kot", "Pies", "Zebra"};
//        List<String> list = new ArrayList<String>();
//
//
//    }

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
        System.out.println(isPrime(5));
    }
}



