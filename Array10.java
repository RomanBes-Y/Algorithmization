import java.util.Arrays;

public class Array10 {
    public static void main (String[] args) {
        int [] array = {-7, 99, -88, 0, 0, -1, 2, -33, 8, 99}; // array[n]
        System.out.println(Arrays.toString(array));

        if ((array.length - 1) % 2 != 0) {
            array[array.length - 1] = 0;
        }

        // delete
        for (int num = 1; num < array.length - 1; num ++) {
            if (num % 2 != 0 && array [num] != 0) {
                array[num] = 0;
            }
        }

        System.out.println(Arrays.toString(array));

        for (int number = 1; number < array.length; number ++) {
            if (number * 2 <= array.length - 1) {
                array[number] = array[number * 2];
                array[number * 2] = 0;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
//+
