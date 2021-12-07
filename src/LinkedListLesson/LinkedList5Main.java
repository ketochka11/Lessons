package LinkedListLesson;

public class LinkedList5Main {
    public static void main(String[] args) {
        LinkedList5 myLinkedList = new LinkedList5();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(10);

        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));

        myLinkedList.remove(1);
        System.out.println(myLinkedList);
        myLinkedList.remove(1);
        System.out.println(myLinkedList);
    }
}
