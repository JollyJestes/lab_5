package com.company;

import java.util.Scanner;

public class Kyb {
    public void function() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("___________________");
        System.out.println("Сторона куба а:");
        int a = scanner.nextInt();
        int V = a * a * a;
        System.out.println("Объем:" + V);
        double S = 6 * Math.pow(a, 2);
        System.out.println("Площадь Куба:" + S);


        System.out.println("Сторона куба а2:");
        int a2 = scanner.nextInt();
        int V2 = a2 * a2 * a2;
        System.out.println("Объем:" + V2);
        double S2 = 6 * Math.pow(a2, 2);
        System.out.println("Площадь Куба:" + S2);


        System.out.println("Сторона куба а3:");
        int a3 = scanner.nextInt();
        int V3 = a3 * a3 * a3;
        System.out.println("Объем:" + V3);
        double S3 = 6 * Math.pow(a3, 2);
        System.out.println("Площадь Куба:" + S3);

        if (S > S2) {
            if (S > S3) {
                System.out.println(" Наибольшая Площадь Куба:" + S);
            }
        }

        if (S2 > S) {
            if (S2 > S3) {
                System.out.println("Наибольшая Площадь Куба:" + S2);
            }
        }

        if (S3 > S) {


            if (S3 > S2) {
                System.out.println("Наибольшая Площадь Куба:" + S3);
            }
        }
    }
}
