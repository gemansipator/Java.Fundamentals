package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        System.out.println("Введите число количества случайных чисел для вывода в одну строку: ");

        int name = number.nextInt();

        for(int index = 0; index <= name -1; index++){

            Double ddd = Math.random();

            System.out.print(ddd);

        }
        System.out.println();

        System.out.println("Случайное число выведено : " + name +" раз.");
        System.out.println();

        System.out.println("Введите число количества случайных чисел для вывода c новой строки каждое: ");

        int name2 = number.nextInt();

        for(int index = 0; index <= name2 -1; index++){

            Double ddd = Math.random();

            System.out.println(ddd);

        }

        System.out.println("Случайное число выведено : " + name2 +" раз.");

    }
}
