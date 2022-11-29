package org.example;

public class Main {
    public static void main(String[] args) {
//        System.out.println(priceCalculator(5.9, 25));
//        System.out.println();

        System.out.println("Всего високосных лет - " + greg(2023));

    }

    public static Double priceCalculator(Double price, int count) {
        return (price * count);
    }

    public static int greg(int year) {
        int a = 0;
        for (int i = 1; i <= year; i++) {
            if (i % 4 == 0 && i % 100 > 0 || i % 400 == 0) {
                a++;
                System.out.println("Високосный год - " + i);
            }
        }
        return a;
    }

    // Новый метод

//    В Григорианском календаре год является високосным в двух случаях: либо он кратен 4,
//    но при этом не кратен 100, либо кратен 400.
//
//    Реализуйте метод, вычисляющий количество високосных лет с начала нашей эры (первого года)
//    до заданного года включительно. На самом деле Григорианский календарь был введен значительно позже, но здесь для упрощения мы распространяем его действие на всю нашу эру.





}