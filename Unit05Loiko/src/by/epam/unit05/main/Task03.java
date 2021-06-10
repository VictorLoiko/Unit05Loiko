package by.epam.unit05.main;

import java.util.Random;

import static java.lang.Math.abs;

public class Task03 {
    public static void main(String[] args) {
        int A, B;
        A = getRandomInt();
        B = getRandomInt();

        System.out.printf("Наши числа: %d и %d\n", A, B);
        if (calculateNumbers(A) == calculateNumbers(B)){
            System.out.println("В данных числах одинаковое число цифр");
        } else {
            System.out.printf("В числе %d больше цифр", defineMostNumbers(A, B));
        }
    }

    public static int getRandomInt() {
        Random random = new Random();
        return random.nextInt();
    }

    public static int defineMostNumbers(int a, int b) {
        return (calculateNumbers(a) > calculateNumbers(b)) ? a : b;
    }


    public static int calculateNumbers(int number) {
        int counter;
        counter = 0;
        while (abs(number) > 1) {
            number /= 10;
            counter++;
        }
        return counter;
    }
}
