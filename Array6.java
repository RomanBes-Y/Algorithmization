public class Array6 {
    public static void main(String[] args) {
        double[] array = {-4.33, -39.05, 1, 0, 88, 31.31, 6, 4, 68, 22, 1, 0, 98, 77, 44, 1, 2}; // a[1], .. , a[n]
        double sum = 0;
        boolean flag;
        for (int i = 1; i <= array.length; i ++) {
            flag = i > 1 ? true : false;
            for (int k = 2; k < i; k ++) {
                if (i % k == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                sum += array[i - 1]; //  = 1 .. n
                System.out.println(array[i - 1]);
            }
        }
        System.out.println("VALUE : "+ sum);
    }
}
//+