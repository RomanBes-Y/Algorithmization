public class Array4 {
    public static void main (String[] args) {
        double [] array = {-5.44, 0, 8, 55, 100.01, 0.003};
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
        System.out.println("MAX : " + max  + "; MIN: " + min);
    }
}
