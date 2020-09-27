import java.util.Arrays;

public class Array4 {
    public static void main (String[] args) {
        double [] array = {-5.44, 0, 8, 55, 100.01, 0.003}; // a[1], ... , a[n]
        double max = array [0];
        double min = array [0];
        for (double num : array) {
            if (max < num) {
                max = num;
            }
            else if (min > num) {
                min = num;
            }
        }
        for (int i = 0; i < array.length; i ++) {
            if (array[i] == max) {
                array[i] = min;
            }
            else if (array[i] == min) {
                array[i] = max;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
//+
