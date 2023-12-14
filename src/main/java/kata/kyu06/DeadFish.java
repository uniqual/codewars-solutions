package kata.kyu06;

 // Make the dead fish swim

public class DeadFish {

    public static int[] parse(String data) {

        double value = 0;
        int index = 0;
        int[] array = new int[(int) data.chars().filter(ch -> ch == 'o').count()];

        for (char action : data.toCharArray()) {
            switch (action) {
                case 'i':
                    value++;
                    break;
                case 'd':
                    value--;
                    break;
                case 's':
                    value = Math.pow(value, 2);
                    break;
                case 'o':
                    array[index] = (int) value;
                    index++;
                    break;
            }
        }
        return array;
    }
}
