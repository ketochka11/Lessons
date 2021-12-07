package Sorting;

import java.util.*;

public class Comparable1 {
    public static void main(String[] args) {
        List<Prson> peopleList = new ArrayList<>();
        Set<Prson> peopleSet = new TreeSet<>();

        addElements(peopleList);
        addElements(peopleSet);

        Collections.sort(peopleList);

        System.out.println(peopleList);
//        System.out.println(peopleSet);

    }

    private static void addElements(Collection collection){
        collection.add(new Prson(1,"Bob"));
        collection.add(new Prson(2,"Tom"));
        collection.add(new Prson(3,"Katy"));
        collection.add(new Prson(3,"George"));
    }
}

class Prson implements Comparable<Prson>{
    private int id;
    private String name;

    public Prson(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Prson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prson prson = (Prson) o;
        return id == prson.id && Objects.equals(name, prson.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(Prson o) {
        return 0;
    }
}