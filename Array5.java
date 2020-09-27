public class Array5 {
    public static void main (String[] args) {
        int [] array = {-4, 4, 55, 1004, 2, -99, 0}; // a[1], .. , a[n]
        for (int i = 0; i < array.length; i ++) {
            if (array[i] > i) {
                System.out.println(array[i]);
            }
        }
    }
}
//+
