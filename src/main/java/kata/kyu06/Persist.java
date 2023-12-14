package kata.kyu06;

import java.util.LinkedList;

// Persistent Bugger.

class Persist {
    public static int persistence(int n) {

        LinkedList<Integer> list = new LinkedList<>();
        int counter = 0;

        do {
            list.clear();
            if (n == 0) {
                return counter;
            } else {
                while (n > 0) {
                    list.push(n % 10);
                    n = n / 10;
                }
            }


            int result = list.get(0);

            for (int i = 1; i < list.size(); i++) {
                result = result * list.get(i);
            }

            n = result;

            counter++;
        } while (list.size() > 1);
        return counter - 1;
    }
}
