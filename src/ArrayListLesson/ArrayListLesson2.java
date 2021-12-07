package ArrayListLesson;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLesson2 {

    public static void main(String[] args) {
//        int [] x = new int[3];
//        for (int i = 0; i <4; i++){
//            x[i] = 1;
        //Out of bounds Exception ошибка выход за пределы массива

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            arrayList.add(i);
        }
        System.out.println(arrayList);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(9));
        System.out.println(arrayList.size());

        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        for (Integer x: arrayList)
            System.out.println(x);

        arrayList.remove(5);//не эффективен вначале и конце
        System.out.println(arrayList);


        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            arrayList.add(i);
        }
        list.remove(5);
        System.out.println(list);
        list = new LinkedList<Integer>();

    }
}
