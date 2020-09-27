public class Array7 {
    public static void main (String[] args) {

        // Array [n % 2 == 0]
        double[] array = {22, -55.44, 1000, -505.505, 77, 3, 1, 1, 0, 0, 1, 0, 55, -22, -5.05, 55, 44, 44, 0, -999};
        // array : a[1], .. , a[n] -> max(a[1] + a[2 * n], a[2] + a[2 * n -1], ... , a[n] + a[n + 1]) it's wrong
        // array : a[1], .. , a[n] -> max(a[1] + a [n], a[2] + a [n-1], ... , a[n / 2] + a[(n / 2) + 1]) it's my code

        int n = array.length;
        int barrier = n / 2;
        double max = array[0] + array[n - 1];

        int i = 1;
        int k = n - 2;

        if (n % 2 == 0) {
            while (i < barrier && k >= barrier) {
                if (array[i] + array[k] > max) {
                    max = array[i] + array[k];
                }
                i++;
                k--;
            }
            System.out.println(max);
        }
        else {
                System.out.println("Array is not correct !");
        }
    }
}
//+
