import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int sum = 0;
        double z = 5;
        double [] array = {1.5, 8, 3, 6.35, 0, 11, 5.11, 9, 5, 78, -5}; // a[1], .. , a[n]
        for (int i = 0; i < array.length; i ++) {
            if (array[i] > z) {
                array[i] = z;
                sum ++;
            }
        }
        System.out.println(sum);
        System.out.println(Arrays.toString(array));
    }
}
//+
