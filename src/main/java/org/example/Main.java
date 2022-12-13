package org.example;

public class Main {
    public static void main(String[] args) {
//        System.out.println(priceCalculator(5.9, 25));
//        System.out.println();

        System.out.println("Всего високосных лет - " + greg(2023));
//        int level = 11;
        for (int i = -10; i <= 10; i++) {
            System.out.println(i + " " + pow2(i));
        }


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
    // ----------------------------
    // Новая Задача
    // Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине степенью двойки.
    // ----------------------------

    public static boolean pow2(int level) {
        if (Integer.bitCount(Math.abs(level)) == 1) {
            return true;
        } else {
            return false;
        }
    }

//    Реализуйте метод flipBit, изменяющий значение одного бита заданного целого числа на противоположное.
//    Данная задача актуальна, например, при работе с битовыми полями.
//
//            Договоримся, что биты нумеруются от младшего (индекс 0) к старшему (индекс 32).


//    В Григорианском календаре год является високосным в двух случаях: либо он кратен 4,
//    но при этом не кратен 100, либо кратен 400.
//
//    Реализуйте метод, вычисляющий количество високосных лет с начала нашей эры (первого года)
//    до заданного года включительно. На самом деле Григорианский календарь был введен значительно позже, но здесь для упрощения мы распространяем его действие на всю нашу эру.





}