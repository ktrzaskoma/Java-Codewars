package codewars.ROT13;




import java.util.Arrays;
import java.util.List;

public class Solution {

    public static String Rot13(String message) {

        char[] lettersOfMessage = message.toCharArray();
        StringBuilder rotatedMessage = new StringBuilder();

        int startBigLetter = 'A';
        int endBigLetter = 'Z';

        int startSmallLetter = 'a';
        int endSmallLetter = 'z';


        for (char letter: lettersOfMessage) {

            if (!(letter >= startBigLetter && letter <= endBigLetter) &&
                    !(letter >= startSmallLetter && letter <= endSmallLetter)) {

                rotatedMessage.append(letter);

            } else if (Character.isUpperCase(letter)) {
                rotatedMessage.append(characterRotatorB(letter));
            } else if (Character.isLowerCase(letter)) {
                rotatedMessage.append(characterRotatorS(letter));
            }
        }
        return rotatedMessage.toString();
    }



    public static Character characterRotatorS(Character letterFromMessage) {

        int validatedLetterIndex;
        List<Character> alphabet = Arrays.asList(
                'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');

        int rotatedLetterIndex = alphabet.indexOf(letterFromMessage) + 14;


        if (alphabet.size() < rotatedLetterIndex) {
            validatedLetterIndex = rotatedLetterIndex - alphabet.size() - 1;
        } else
            validatedLetterIndex = rotatedLetterIndex - 1;

        return alphabet.get(validatedLetterIndex);

    }


    public static Character characterRotatorB(Character letterFromMessage) {

        int validatedLetterIndex;
        List<Character> alphabet = Arrays.asList(
                'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z');

        int rotatedLetterIndex = alphabet.indexOf(letterFromMessage) + 14;


        if (alphabet.size() < rotatedLetterIndex) {
            validatedLetterIndex = rotatedLetterIndex - alphabet.size() - 1;
        } else
            validatedLetterIndex = rotatedLetterIndex - 1;

        return alphabet.get(validatedLetterIndex);

    }


    public static void main(String[] args) {
        System.out.println(Rot13("Hello World!"));
    }
}
