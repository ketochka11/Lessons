package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLesson12 {
    public static void main(String[] args) {
        //сортировка по умолчанию
        List<String> animals = new ArrayList<>();

        animals.add("dog");
        animals.add("cat");
        animals.add("frog");
        animals.add("bird");
        animals.add("crocodile");
        animals.add("monkey");

        Collections.sort(animals);
        System.out.println(animals);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(0);
        numbers.add(500);
        numbers.add(100);

        Collections.sort(numbers);
        System.out.println(numbers);
// сортировка по убыванию
        Collections.sort(numbers, new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        if (o1 > o2) {
                            return -1;
                        } else if (o1 < o2) {
                            return 1;
                        } else {
                            return 0;
                        }
                    }
                });
        System.out.println(numbers);
// сортировка по колличеству символов
        Collections.sort(animals, new StringLengthComparator());
        System.out.println(animals);
    }
}
//создавать целый класс для одного метода неправильно.
//нужно сделать как с Integer, с помощью анонимного класса
class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        /*   compare:
        o1 > o2 => 1
        o1 < o2 => -1
        o1 == o2 => 0
        compare (2,1); => 1
        compare (1,2); => -1
        compare (1,1); => 0
         */
        if (o1.length()>o2.length()) {
            return 1;
        }else if (o1.length()<o2.length()) {
            return -1;
        }else{
            return 0;
        }
    }
}



