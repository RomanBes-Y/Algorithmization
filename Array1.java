public class Array1 {
    public static void main(String[] args) {
        int[] array = {44, 55, 3, 36, 5};
        int sum = 0;
        int k = 2;
        for (int i : array) {
            if (i % k == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
