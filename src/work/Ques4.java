package work;

import java.util.*;

public class Ques4 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 6, 4, 1, 3, 3, 2, 4};


        Map<Integer, Integer> freqMap = new LinkedHashMap<>();
        for (int num : arr) {

            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }


        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(freqMap.entrySet());


        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {

                return e2.getValue().compareTo(e1.getValue());
            }
        });




        System.out.println("Elements sorted by decreasing frequency:");
        for (Map.Entry<Integer, Integer> entry : entryList) {
            int number = entry.getKey();
            int frequency = entry.getValue();
                System.out.print(number + " ");

        }

    }
}
