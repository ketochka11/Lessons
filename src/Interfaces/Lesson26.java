package Interfaces;

public class Lesson26 {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Bob");
//        animal1.sleep();
//        person1.sayHello();
//        animal1.showInfo();
//        person1.showInfo();
        Info info1 = new Animal(1);
        Info info2 = new Person("Bob");
        info1.showInfo();
        info2.showInfo();
        outputInfo(info1);
        outputInfo(info2);
        outputInfo(animal1);
    }
    public static void outputInfo(Info info){
        info.showInfo();
    }
}
