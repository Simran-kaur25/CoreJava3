package work;

import java.util.*;

public class Ques5 {
    public static void main(String[] args) {

        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("Apple", 3);
        unsortedMap.put("Banana", 2);
        unsortedMap.put("Orange", 5);
        unsortedMap.put("Mango", 1);

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(unsortedMap.entrySet());


        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                return e1.getValue().compareTo(e2.getValue());
            }
        });


        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println("HashMap sorted by value (ascending):");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
