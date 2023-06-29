package codewars;

import java.util.*;

public class Meeting {

    public static String meeting(String s) {

        String upper = s.toUpperCase();

        String[] names = upper.split(";");

        List<String[]> nameList = new ArrayList<>();
        for (String name : names) {
            String[] nameParts = name.split(":");
            nameList.add(nameParts);
        }

        Collections.sort(nameList, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                int lastNameComparison = o1[1].compareTo(o2[1]);
                if (lastNameComparison != 0) {
                    return lastNameComparison;
                } else {
                    return o1[0].compareTo(o2[0]);
                }
            }
        });

        StringBuilder result = new StringBuilder();

        for (String[] nameParts : nameList) {
            result.append("(")
                    .append(nameParts[1])
                    .append(", ")
                    .append(nameParts[0])
                    .append(")");
        }

        return result.toString();
    }







    public static void main(String[] args) {
        String s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
        String result = meeting(s);
        System.out.println(result);
    }

}
