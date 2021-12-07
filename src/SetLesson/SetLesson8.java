package SetLesson;

import java.util.*;

public class SetLesson8 {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();// не гарантирует никакого порядка
        Set<String> linkedHashSet = new LinkedHashSet<>();//гарантирует упорядоченность по очереди добавлению
        Set<String> treeSet = new TreeSet<>();//гарантирует сортировку по ключу(естественный порядок)

        System.out.println("HashSet: ");
        hashSet.add("Mike");
        hashSet.add("Katy");
        hashSet.add("Tom");
        hashSet.add("George");
        hashSet.add("Donald");
        hashSet.add("Tom");
        hashSet.add("Tom");

        for (String name : hashSet) {
            System.out.println(name);
        }
        System.out.println(hashSet);
        System.out.println("LinkedHashSet: ");
        linkedHashSet.add("Mike");
        linkedHashSet.add("Katy");
        linkedHashSet.add("Tom");
        linkedHashSet.add("George");
        linkedHashSet.add("Donald");

        for (String name : linkedHashSet) {
            System.out.println(name);
        }

        System.out.println("TreeSet: ");
        treeSet.add("Mike");
        treeSet.add("Katy");
        treeSet.add("Tom");
        treeSet.add("George");
        treeSet.add("Donald");

        for (String name : treeSet) {
            System.out.println(name);
        }

        //есть ли элемент в set:
        System.out.println(hashSet.contains("Tom"));
        System.out.println(hashSet.contains("Tim"));

        //Пустой set или нет:
        System.out.println(hashSet.isEmpty());


   }
}
