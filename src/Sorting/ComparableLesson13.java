package Sorting;

import java.util.*;

public class ComparableLesson13 {
    public static void main(String[] args) {
        List<Human> humanList = new ArrayList<>();
        Set<Human> humanSet = new TreeSet<>();

        addElements(humanList);
        addElements(humanSet);

        Collections.sort(humanList);

        System.out.println(humanList);
        System.out.println(humanSet);
    }

    private static void addElements(Collection collection){
        collection.add(new Human(3, "Katy"));
        collection.add(new Human(2, "To"));
        collection.add(new Human(1, "Bob"));
        collection.add(new Human(4, "George"));
    }

}


class Human implements Comparable<Human> {
    private int id;
    private String name;

    public Human(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\nHuman{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return id == human.id && Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
//сортировка по id Возрастанию
//    @Override
//    public int compareTo(Human o) {
//        if (this.id > o.getId()) {
//            return 1;
//        } else if (this.id < o.getId()) {
//            return  -1;
//        }else {
//            return 0;
//        }
//    }

    //сортировка по колличесту букв в имени
    @Override
    public int compareTo(Human o) {
        if (this.name.length() > o.getName().length()) {
            return 1;
        } else if (this.name.length() < o.getName().length()) {
            return  -1;
        }else {
            return 0;
        }
    }
}