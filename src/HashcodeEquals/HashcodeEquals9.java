package HashcodeEquals;

import java.util.*;

public class HashcodeEquals9 {
    public static void main(String[] args) {
//        Map<Integer, String> map1 = new HashMap<>();
//        Set<Integer> set1 = new HashSet<>();
//        map1.put(1, "Один");
//        map1.put(1, "Другое значение");
//        set1.add(1);
//        set1.add(1);
//        System.out.println(map1);
//        System.out.println(set1);

//        Person person1 = new Person(1, "Mike");
//        Person person2 = new Person(2, "Katy");
//        Map<Person, String> map = new HashMap<>();
//        Set<Person> set = new HashSet<>();
//        map.put(person1, "123");
//        map.put(person2, "123");
//        set.add(person1);
//        set.add(person2);
//        System.out.println(map);
//        System.out.println(set);

//        Person person1 = new Person(1, "Mike");
//        Person person2 = new Person(1, "Mike");
//        Map<Person, String> map = new HashMap<>();
//        Set<Person> set = new HashSet<>();
//        map.put(person1, "123");
//        map.put(person2, "123");
//        set.add(person1);
//        set.add(person2);
//        System.out.println(map);
//        System.out.println(set);

//        Map<Person, String> map = new HashMap<>();
//        Set<String> set = new HashSet<>();
//
//        set.add("Hello");
//        set.add("Hello");
//
//        Integer x = 1;
//        x.equals();
//        Person person1 = new Person(1, "Mike");
//        person1.equals();
//        person1.hashCode();
//        Object object = new Object();
//        System.out.println(set);

        Person person1 = new Person(1, "Mike");
        Person person2 = new Person(1, "Mike");
        Map<Person, String> map = new HashMap<>();
        Set<Person> set = new HashSet<>();
        map.put(person1, "123");
        map.put(person2, "123");
        set.add(person1);
        set.add(person2);
        System.out.println(map);
        System.out.println(set);
    }
}

class Person{
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
/*
    контракт hashcode() equals()
    1) У двух проверяемых объектах вызываем hashcode();
        если hash разные -> объекты разные.
    2) если hash одинаковые -> вызываем equals();(проверка на КОЛИЗИЮ)
    (КОЛИЗИЯ - разные объекты имеют одинаковый hash;
    3) equals() -> выдает ответ


 */