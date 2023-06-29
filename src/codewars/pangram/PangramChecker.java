package codewars.pangram;

import java.util.HashMap;
import java.util.Map;

public class PangramChecker {

    public static boolean check(String sentence) {

        Map<Character, Integer> charMap = new HashMap<>();

        String sentenceFilter1 = sentence.toLowerCase();
        String sentenceFilter2 = sentenceFilter1.replaceAll("[^a-zA-Z]", "");

        char[] chars = new char[sentenceFilter2.length()];
        for (int i = 0; i < sentenceFilter2.length(); i++) {
            chars[i] = sentenceFilter2.charAt(i);
        }

        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        for (int i = 0; i < chars.length; i++) {
            int counter = 0;
            for (int j = 0; j < alphabet.length; j++){
                if (chars[i] == alphabet[j]) {
                    counter++;
                }
            }
            charMap.put(chars[i], counter);
            counter = 0;
        }

        if (charMap.size() == 26){
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        String pangram = "The quick brown fox jumps over the lazy dog.";
        System.out.println(check(pangram));
    }
}
