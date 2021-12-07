package QueueLesson14;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueLinkedListL13 {
    public static void main(String[] args) {
        Person person1 = new Person(1);
        Person person2 = new Person(2);
        Person person3 = new Person(3);
        Person person4 = new Person(4);

//        Queue<Person> people = new LinkedList<>();
        Queue<Person> people = new ArrayBlockingQueue<Person>(3);
        System.out.println(people.offer(person3));
        System.out.println(people.offer(person2));
        System.out.println(people.offer(person4));
        System.out.println(people.offer(person1));
//        System.out.println(people.remove());//удаляет первый элемент
//        System.out.println("Очередность: ");
//        for (Person person : people)
//
//        System.out.println(person);
//        System.out.println("Первый элемент: ");
//        System.out.println(people.peek());//показывает первый элемент очереди
    }
}

class Person {
    private int id;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}
