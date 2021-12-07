public class ClassesAndObjects {//может быть только 1
    public static void main (String [] args){
        Personali person1 = new Personali();
        person1.name = "Роман";
        person1.age = 50;
        System.out.println("Меня зовут " + person1.name + ", " + "мне " + person1.age + " лет.");

        Personali person2 = new Personali();
        person2.name = "Вова";
        person2.age = 20;
        System.out.println("Меня зовут " + person2.name + ", " + "мне " + person2.age + " лет.");
    }
}

class Personali{ //у класса м.б. данные (поля) и действия(методы или функции)
    String name;
    int age;
}
