package kata.kyu06;

public class FindEvenIndex {

    public static int findEvenIndex(int[] arr) {
        for (int index = 0; index < arr.length; index++) {
            if (leftSum(arr, index) == rightSum(arr, index)) {
                return index;
            }
        }
        return -1;
    }

    private static int leftSum(int[] arr, int index) {
        int result = 0;

        for (int i = 0; i < index; i++) {
            result = result + arr[i];
        }
        return result;
    }

    private static int rightSum(int[] arr, int index) {
        int result = 0;

        for (int i = index + 1; i < arr.length; i++) {
            result = result + arr[i];
        }
        return result;
    }
}
