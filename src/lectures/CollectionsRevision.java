package lectures;

import java.util.ArrayList;
import java.util.List;

public class CollectionsRevision {


    static void show(List<?> list) {
        for (Object o : list)
            System.out.println(o);
    }


    public static void main(String[] args) {
        String[] items = { "Kot", "Pies", "Zebra"};
        List<String> list = new ArrayList<String>();


    }
}
