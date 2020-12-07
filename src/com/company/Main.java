package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner youName = new Scanner(System.in);
        System.out.println("Введите имя:  ");
        String name = youName.nextLine();
        System.out.print("Привет, " + name +"! Как дела?");
    }
}
