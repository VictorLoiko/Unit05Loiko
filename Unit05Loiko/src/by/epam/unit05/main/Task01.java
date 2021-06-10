package by.epam.unit05.main;

import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        int A, B;
        Random random = new Random();
        A = random.nextInt(99) + 1;
        B = random.nextInt(99) + 1;
        System.out.printf("Наши числа: %d и %d\n",A,B);
        System.out.println("Наибольший общий делитель:"+gcd(A,B));
        System.out.println("Наименьшее общее кратное:"+lcm(A,B));

    }
    public static int gcd(int a, int b) { return b==0 ? a : gcd(b, a%b); }
    
    public static int lcm(int a, int b) { return a*b/(gcd(a,b)); }
}
