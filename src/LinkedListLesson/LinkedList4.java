package LinkedListLesson;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList4 {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();
//        linkedList.add(1);
//        linkedList.get(0);
//        linkedList.size();
//        linkedList.remove(0);
measureTime(linkedList);
measureTime(arrayList);
    }
//get  быстрее для arrayList
    //add в конец быстрее для arrayList, а в начало linkedList
    private static void measureTime(List<Integer> list){//время работы
        long start = System.currentTimeMillis();
        for (int i = 0; i<100000; i++){
            list.add(0,i);//указывает индекс добавления
        }
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
