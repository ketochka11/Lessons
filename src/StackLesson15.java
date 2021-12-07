import java.util.Stack;

public class StackLesson15 {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(3);
        stack.push(1);

        System.out.println(stack.peek()); //показывает посл эл
        System.out.println(stack.pop()); //извлекает послед эл

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }



    }
}
