package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedAndTreeMap7 {
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<>();// не гарантирует никакого порядка
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();//гарантирует упорядоченность по добавлению
        Map<Integer,String> treeMap = new TreeMap<>();//гарантирует сортировку по ключу

        System.out.println("hashMap: ");
        testMap(hashMap);

        System.out.println("linkedHashMap: ");
        testMap(linkedHashMap);

        System.out.println("treeMap: ");
        testMap(treeMap);

    }

    public static void testMap(Map<Integer, String> map){
        map.put(39, "Bob");
        map.put(12, "Mike");
        map.put(78, "Tom");
        map.put(0, "Tim");
        map.put(1500, "Lewi");
        map.put(7, "Bob");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
