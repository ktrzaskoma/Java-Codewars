package codewars.countipaddresses;

import java.util.ArrayList;

public class CountIPAddresses {


    public static long ipsBetween(String start, String end) {

        var iP1 = iPSplitter(start);
        var iP2 = iPSplitter(end);

        long starter = 0;
        long ender = 0;

        for (int i = 0; i < 4; i++) {
            starter = starter * 256 + iP1.get(i);
            ender = ender * 256 + iP2.get(i);
        }

        return ender - starter;
    }

    public static ArrayList<Integer> iPSplitter(String ip) {

        ArrayList<Integer> iPCodeList = new ArrayList<>();

        String[] digits = ip.split("\\.");

        for (int i = 0; i < digits.length; i++) {
            iPCodeList.add(Integer.valueOf(digits[i]));
        }
        return iPCodeList;
    }


    public static void main(String[] args) {
        ipsBetween("0.0.0.0", "255.255.255.255");
        ipsBetween("10.0.0.0", "10.0.1.0");
        ipsBetween("20.0.0.10", "20.0.1.0");
        ipsBetween("10.0.0.0", "10.0.0.50");


    }
}
