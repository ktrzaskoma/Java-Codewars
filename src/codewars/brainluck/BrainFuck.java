package codewars.brainluck;

public class BrainFuck {

    private static int ptr;
    // Memory of 65535 bits
    private static int lenght = 65535;
    private static byte memory[] = new byte[lenght];

    public BrainFuck(String code) {
        int c = 0;

        for (int i = 0; i < code.length(); i++) {

            if (code.charAt(i) == '>') {
                if (ptr == lenght -1)
                    ptr = 0;
                else
                    ptr++;
            }


            else if (code.charAt(i) == '<') {
                if (ptr == 0)
                    ptr = lenght - 1;
                else
                    ptr--;
            }

            else if (code.charAt(i) == '+') {
                memory[ptr]++;
            }

            else if (code.charAt(i) == '-') {
                memory[ptr]--;
            }

            else if (code.charAt(i) == '.') {
                System.out.println((char) (memory[ptr]));
            }

            else if (code.charAt(i) == ',') {
                memory[ptr] = (byte)(code.charAt(0));
            }

            else if (code.charAt(i) == '[') {
                if (memory[ptr] == 0) {
                    i++;
                    while (c > 0 || code.charAt(i) != ']') {
                        if (code.charAt(i) == '[')
                            c++;
                        else if (code.charAt(i) == ']')
                            c--;
                        i++;
                    }
                }
            }

            else if (code.charAt(i) == ']') {
                if (memory[ptr] != 0) {
                    i--;
                    while (c > 0 || code.charAt(i) != '[') {
                        if (code.charAt(i) == ']')
                            c++;
                        else if (code.charAt(i) == '[')
                            c--;
                        i++;
                    }
                }
            }

        }




    }

//    public String process(String input) {
//        return "";
//    }

    public static void main(String[] args) {

//        new BrainFuck("<<<>>>++").process("Codewars" + ((char) 255));



    }
}
