package by.epam.unit05.main;

import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        int A, B, C;
        Random random = new Random();
        A = random.nextInt(99);
        B = random.nextInt(99);
        C = random.nextInt(99);

        System.out.printf("Наши числа: %d, %d, %d\n",A,B,C);
        System.out.println("Сумма минимального и максимального из чисел: "+findMinMaxSum(A,B,C));
    }

    public static int findMin(int a, int b, int c) {
        int min;
        min=a;
        if (min>b) {
            min=b;
        }
        if (min>c){
            min=c;
        }
        return min;
    }
    public static int findMax(int a, int b, int c) {
        int max;
        max=a;
        if (max<b) {
            max=b;
        }
        if (max<c){
            max=c;
        }
        return max;
    }
    public static int findMinMaxSum(int a, int b, int c){
        return findMin(a,b,c)+findMax(a,b,c);
    }

}
