package kata.kyu06;

public class FoldAnArray {

    public static int[] foldArray(int[] array, int runs) {

        int middle = (int) Math.ceil((double) array.length / 2);

        int[] newArray = new int[middle];

        if (runs == 0) {
            return array;
        }

        for (int i = 0; i < middle; i++) {
            int opposite = array.length - (i + 1);
            newArray[i] = array[i] + (i != opposite ? array[opposite] : 0);
        }

        return foldArray(newArray, --runs);
    }
}
