package kata.kyu06;

public class SortTheOdd {

    public static int[] sortArray(int[] array) {
        selectionSort(array);
        return array;
    }

    private static void selectionSort(int[] array) {
        int size = array.length;

        for (int step = 0; step < size - 1; step++) {
            if (isEven(array[step]))
                continue;
            int minIdx = step;

            for (int i = step + 1; i < size; i++) {
                if (isEven(array[i]))
                    continue;
                if (array[i] < array[minIdx]) {
                    minIdx = i;
                }
            }

            int temp = array[step];
            array[step] = array[minIdx];
            array[minIdx] = temp;
        }
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
