import java.util.Arrays;

public class Array8 {
    public static void main(String[] args) {
        int [] array = {66, -3, 3, 55, 3, 7899, 445, -3}; // a[1], .. , a[n]
        int min = array [0];
        int sum = 0;
        // min (a[1], .. , a[n])
        for (int i = 0; i < array.length; i ++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        for (int num : array) {
            if (min == num) {
                sum ++;
            }
        }

        int k = 0;

        int [] arrayN = new int [array.length - sum];

        for (int i = 0; i < array.length; i ++) {
            if (array[i] != min) {
                while (k < arrayN.length) {
                    arrayN [k] = array [i];
                    k ++;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(arrayN));

    }
}
//+
