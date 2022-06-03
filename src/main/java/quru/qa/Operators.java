package quru.qa;

import java.lang.Math;

public class Operators {

    public static void main (String[] args) {

        byte a = 2;
        short b = 4;
        long c = 100;
        int d = 250;
        double e = 0.5;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("c / a = " + (c / a));
        System.out.println("d * c = " + (d * c));
        System.out.println("d % e = " + (d % e));

        int price = 80;
        if (price > 50 & price < 100)
            System.out.println("Моя цена, берём!");
         else if (price <= 1000 || price >= 10000)
                        System.out.println("Что ты тут забыл?");

        int m = 2000000000;
        int n = 2000000000;
        int v = m + n;
        System.out.println(v);

        float f = 4.24f;
        int g = 5;
        System.out.println("Большее число из 2 чисел: " + Math.max(f,g));
        System.out.println("Меньшее число из 2 чисел: " + Math.min(f,g));

    }

}
