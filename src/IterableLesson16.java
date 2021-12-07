import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IterableLesson16 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator <Integer> iterator = list.iterator();

        //Before Java5
        int idx = 0;
        while (iterator.hasNext()) {//we can change the list
            System.out.println(iterator.next());
            if (idx == 1)
                iterator.remove();

            idx++;
        }
        //Java 5
//        for (int x : list)//we can't change the list
//            System.out.println(x);

        System.out.println(list);
    }
}