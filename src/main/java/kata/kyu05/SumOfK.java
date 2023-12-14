package kata.kyu05;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class SumOfK {

    public static Integer chooseBestSum(int miles, int towns, List<Integer> ls) {
        List<Integer> totalMiles = new ArrayList<>();
        combinationUtil(ls, new int[towns], 0, ls.size() - 1, 0, towns, totalMiles);

        Optional<Integer> result = totalMiles
                .stream()
                .filter(i -> i <= miles)
                .reduce(Integer::max);

        return result.orElse(null);
    }

    private static void combinationUtil(List<Integer> list, int[] data, int start, int end, int index, int r, List<Integer> totalMiles) {

        if (index == r) {
            int sum = 0;
            for (int j = 0; j < r; j++) {
                sum = sum + data[j];
            }
            totalMiles.add(sum);
            return;
        }

        for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
            data[index] = list.get(i);
            combinationUtil(list, data, i + 1, end, index + 1, r, totalMiles);
        }
    }

}


