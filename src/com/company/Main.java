package com.company;

/**
 * Создать класс квадрат, член класса – длина стороны. Предусмотреть в классе методы
 * вычисления и вывода сведений о фигуре – периметр, площадь, диагональ. Создать производный класс
 * – куб, добавить в класс метод определения объема фигуры, перегрузить методы расчета площади и
 * вывода сведений о фигуре. Написать программу, демонстрирующую работу с классом: дано N1
 * квадратов и N2 кубов. Найти среднюю площадь квадратов и количество кубов с наибольшей площадью.
 */

public class Main {

    public static void main(String[] args) {
        task1();
    }

    private static void task1() {
        Kvadrat kvadrat = new Kvadrat();
        kvadrat.function();
        Kyb kyb = new Kyb();
        kyb.function();

    }


}
