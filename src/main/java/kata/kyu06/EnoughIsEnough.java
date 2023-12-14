package kata.kyu06;

import java.util.LinkedList;

public class EnoughIsEnough {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {

        if (elements == null || maxOccurrences <= 0) {
            return new int[]{};
        }

        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int element : elements) {
            linkedList.add(element);
        }

        for (int i = 0; i < linkedList.size(); i++) {
            int countOccurrence = 0;
            int element = linkedList.get(i);
            for (int j = 0; j < linkedList.size(); j++) {
                if (element == linkedList.get(j)) {
                    countOccurrence++;
                }
            }
            if (countOccurrence > maxOccurrences) {
                for (int a = 0; a < countOccurrence - maxOccurrences; a++) {
                    linkedList.removeLastOccurrence(element);
                }
            }
        }

        int[] array = new int[linkedList.size()];

        for (int i = 0; i < array.length; i++) {
            array[i] = linkedList.get(i);
        }

        return array;
    }
}