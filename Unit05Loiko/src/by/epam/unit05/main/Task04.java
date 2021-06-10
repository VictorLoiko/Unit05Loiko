package by.epam.unit05.main;

import java.util.Arrays;
import java.util.Random;

public class Task04 {
    public static void main(String[] args) {
        int[] array = new int[9];
        array = initializeArray(array);

        System.out.println("Массив: " + Arrays.toString(array));
        System.out.printf("Суммы элементов: \nD[1]+D[2]+D[3] = %d\nD[2]+D[3]+D[4] = %d\nD[3]+D[4]+D[5] = %d\n",
                sumElements(array, 1, 3), sumElements(array, 2, 4), sumElements(array, 3, 5));
    }

    public static int sumElements(int[] array, int k, int m) {
        int sum;
        sum = 0;
        for (int i = (k - 1); i <= (m - 1); i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int[] initializeArray(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(1000);
        }
        return array;
    }
}
