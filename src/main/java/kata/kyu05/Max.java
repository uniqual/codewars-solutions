package kata.kyu05;

// Maximum subarray sum

public class Max {
    public static int sequence(int[] arr) {


        int size = arr.length;

        if (size == 0) {
            return 0;
        }

        boolean bool = true;

        for (int value : arr) {
            if (value > 0) {
                bool =  false;
            }
        }

        if (bool) {
            return 0;
        }

        int max_sum = Integer.MIN_VALUE;
        int max_ending_here = 0;

        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + arr[i];
            if (max_sum < max_ending_here)
                max_sum = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_sum;
    }

}
