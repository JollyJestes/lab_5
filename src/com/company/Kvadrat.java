package com.company;

import java.util.Scanner;

public class Kvadrat {
    public void function() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сторона квадрата а:");
        int a = scanner.nextInt();
        //Периметр
        int P = 4 * a;
        System.out.println("Периметр:" + P);
        //Площадь
        int S = a * a;
        System.out.println("Площадь:" + S);
        //Диагональ
        double d = a * Math.sqrt(2);
        System.out.println("Диагональ:" + d);



        System.out.println("Сторона квадрата а2:");
        int a2 = scanner.nextInt();
        //Периметр
        int P2 = 4 * a2;
        System.out.println("Периметр:" + P2);
        //Площадь
        int S2 = a2 * a2;
        System.out.println("Площадь:" + S2);
        //Диагональ
        double d2 = a2 * Math.sqrt(2);
        System.out.println("Диагональ:" + d2);


        System.out.println("Сторона квадрата а3:");
        int a3 = scanner.nextInt();
        //Периметр
        int P3 = 4 * a3;
        System.out.println("Периметр:" + P2);
        //Площадь
        int S3 = a3 * a3;
        System.out.println("Площадь:" + S3);
        //Диагональ
        double d3 = a3 * Math.sqrt(2);
        System.out.println("Диагональ:" + d3);

        int A = (a * a2 * a3) /3;
        System.out.println("Средняя площадь квадратов " + A);
    }
}
