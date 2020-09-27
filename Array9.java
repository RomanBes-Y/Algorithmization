import java.util.Arrays;

public class Array9 {
    public static void main (String[] args) {

        // first array [n]
        int [] array = {99, 44, -34, -34, 9999, 99, 0, 99, -34};
        int newAr = 0;
        boolean flag;
        int k = 0;
        int min;

        for (int barrier = 0; barrier < array.length; barrier ++) {
            flag = true;
            int number = 0;
            while (number < barrier) {
                if (array[barrier] == array[number]) {
                    flag = false;
                    break;
                }
                number ++;
            }
            if (flag) {
                int num = barrier + 1;
                while (num < array.length) {
                    if (array[num] == array[barrier]) {
                        newAr ++;
                        break;
                    }
                    num ++;
                }
            }
        }

        if (newAr != 0) {
            // new array [newAr]
            //System.out.println(newAr);
            int[] newArray = new int[newAr];

            for (int barrier = 0; barrier < array.length; barrier++) {
                flag = true;
                int number = 0;
                while (number < barrier) {
                    if (array[barrier] == array[number]) {
                        flag = false;
                        break;
                    }
                    number++;
                }
                if (flag) {
                    int num = barrier + 1;
                    while (num < array.length) {
                        if (array[num] == array[barrier]) {
                            while (k < newArray.length) {
                                newArray[k] = array[num];
                                k ++;
                                break;
                            }
                            break;
                        }
                        num++;
                    }
                }
            }

            System.out.println(Arrays.toString(newArray));

            // new numberAmount[newAr] : amount of numbers
            int [] numberAmount = new int[newAr];

            for (int i = 0; i < newArray.length; i ++) {
                for (int b = 0; b < array.length; b ++) {
                    if (newArray[i] == array[b]) {
                        numberAmount[i] ++;
                    }
                }
            }

            System.out.println(Arrays.toString(numberAmount));

            // the maximum number in the array numberAmount[newAr]
            int max = numberAmount[0];
            int idMAX = 0;
            int amountRepeat = 0;
            for (int num = 0; num < numberAmount.length; num ++) {
                if (max < numberAmount[num] && max != numberAmount[num]) {
                    max = numberAmount[num];
                    idMAX = num;
                }
                else if (max == numberAmount[num]) {
                    amountRepeat ++;
                }
            }
            // output
            if (amountRepeat == 0) {
                System.out.println("Min number : " + max);
            }
            else {
                int minNewArray = newArray [idMAX];

                for (int num = 0; num < numberAmount.length; num ++) {
                    if (numberAmount[num] == max && minNewArray > newArray[num]) {
                        minNewArray = newArray[num];
                    }
                }
                System.out.println("Min number : "  + minNewArray);
            }
        }
        // array : newArray[newAr] is clear
        else {
            min = array[0];
            for (int number = 1; number < array.length ; number ++) {
                if (min > array[number]) {
                    min = array[number];
                }
            }
            System.out.println("Min number : " + min);
        }
    }
}
