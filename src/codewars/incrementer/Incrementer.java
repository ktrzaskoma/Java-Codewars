package codewars.incrementer;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Incrementer {

    public static String incrementString(String str) {

        Matcher matcher = Pattern.compile("(\\d+)$").matcher(str);

        if (matcher.find()) {
            String number = matcher.group();

            BigInteger incrementedNumber = new BigInteger(number).add(BigInteger.ONE);
            String incrementedNumberWithZeros = String.format("%0" + number.length() + "d", incrementedNumber);

            String newString = str.replaceAll("\\d+$", incrementedNumberWithZeros);

            return newString;
        } else {
            return str + "1";
        }
    }


    public static void main(String[] args) {

        System.out.println(incrementString("foo1"));

    }
}
