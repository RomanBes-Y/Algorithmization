public class Array3 {
    public static void main (String[] args) {
        double [] array = {-5, 77.55, 108, -44, 5, 11.03, 0}; // array[n]
        int sumPlus = 0;
        int sumMinus = 0;
        int sumZero = 0;
        for (double m : array) {
            if (m > 0) {
                sumPlus ++;
            }
            else if (m < 0) {
                sumMinus ++;
            }
            else  {
                sumZero ++;
            }
        }
        System.out.println(" + : " + sumPlus + " ; - : " + sumMinus +" ; 0 : " + sumZero);

    }
}
//+
